CREATE DATABASE Map;
CREATE USER 'Student'@'%' IDENTIFIED BY 'map';
GRANT ALL PRIVILEGES ON *.* TO 'Student'@'localhost';
CREATE TABLE Map.provaC(
       X int,
       Y int,
		C int
);

insert into Map.provaC values(1,10,1);
insert into Map.provaC values(2,50,2);
insert into Map.provaC values(4,100,2);
insert into Map.provaC values(5,60,3);
insert into Map.provaC values(8,20,4);
insert into Map.provaC values(4,40,2);
commit;