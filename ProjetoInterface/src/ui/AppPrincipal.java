package ui;

import core.DBMySQL;
import core.DBPostgre;
import core.DBSql;
import core.InterfaceDB;

public class AppPrincipal {
	public static void main(String[] args) {

		InterfaceDB mydb;
//		mydb = new DBMySQL();
//		mydb = new DBPostgre();
		mydb = new DBSql();
	
		mydb.conectar("banco1", "jeffvas");
		mydb.comando("select * from cadastro");
		mydb.desconectar("banco1");
			
	}
}
