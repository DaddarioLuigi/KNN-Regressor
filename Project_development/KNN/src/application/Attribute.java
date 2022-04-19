package application;

/*
 * La classe modella un generico attributo discreto 
 * o continuo che sia.
 */
public abstract class Attribute {

		private String name; //nome simbolico dell'attributo
		private int index; //identificativo attributo
		
		//costruttore
		public Attribute(String _name, int _index)
		{
			name = _name;
			index = _index;
		}
		
		//restituisce il valore del membro name
		public String getName()
		{
			return name;
		}
		
		//restituisce il valore del membro index
		public int getIndex()
		{
			return index;
		}
}
