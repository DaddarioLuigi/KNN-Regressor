package database;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import example.Example;

/**
 * Classe che modella il training set a partire da un DB e un table Schema
 * @author Luigi Daddario
 *
 */
public class TableData {

	private DbAccess db;
	private String table;
	private TableSchema tSchema;
	private List<Example> transSet;
	private List<Comparable> target;
	
	public enum QUERY_TYPE {
		MIN, MAX;
		}
	
	/**
	 * Costruttore di classe
	 * @param db
	 * @param tSchema
	 * @throws SQLException
	 * @throws InsufficientColumnNumberException
	 */
	public TableData(DbAccess db, TableSchema tSchema) throws SQLException,InsufficientColumnNumberException{
		this.db=db;
		this.tSchema=tSchema;
		this.table=tSchema.getTableName();
		transSet = new ArrayList();
		target= new ArrayList();	
		init();
	}
	

	private void init() throws SQLException{		
		String query="select ";
		
		Iterator<Column> it=tSchema.iterator();
		for(Column c:tSchema){			
			query += c.getColumnName();
			query+=",";
		}
		query +=tSchema.target().getColumnName();
		query += (" FROM "+table);
		
		Statement statement = db.getConnection().createStatement();
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			Example currentTuple=new Example(tSchema.getNumberOfAttributes());
			int i=0;
			for(Column c:tSchema) {
				if(c.isNumber())
					currentTuple.set(rs.getDouble(i+1),i);
				else
					currentTuple.set(rs.getString(i+1),i);
				i++;
			}
			transSet.add(currentTuple);
			
			if(tSchema.target().isNumber())
				target.add(rs.getDouble(tSchema.target().getColumnName()));
			else
				target.add(rs.getString(tSchema.target().getColumnName()));
		}
		rs.close();
		statement.close();	
	}
	
	
	/**
	 * Esegue una interrogazione al DB utilizzando SQL per poter estrarre il valore MIN o MAX (colonna del DB)
	 * @param column
	 * @param aggregate
	 * @return
	 * @throws SQLException
	 */
	public Object getAggregateColumnValue(Column column,QUERY_TYPE aggregate) throws SQLException
	{
		String query = "SELECT ";
		Statement statement = db.getConnection().createStatement();
		ResultSet rs; //inizializzazione variabile che conterr� i risultati della query
		Object result_object = new Object();
		if(aggregate == QUERY_TYPE.MAX)
		{
			rs = statement.executeQuery(query + "MAX("+column.getColumnName()+") from provac WHERE 1");
		}
		else if(aggregate == QUERY_TYPE.MIN)
		{
			rs = statement.executeQuery(query + "MIN("+column.getColumnName()+") from provac WHERE 1");
		}
		else return -1;
		
		while(rs.next())
		{
			result_object = rs.getInt(column.getColumnName());
		}
		return result_object;
	}

	
	/**
	 * getter
	 * @return transSet
	 */
	public List<Example> getExamples(){
		return transSet; 
	}
	
	/**
	 * getter
	 * @return target
	 */
	public List getTargetValues(){
		return target; 
	}
	
}
