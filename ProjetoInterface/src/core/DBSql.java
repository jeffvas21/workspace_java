package core;

public class DBSql implements InterfaceDB {

	@Override
	public void conectar(String db, String usuario) {
		// TODO Auto-generated method stub
		System.out.println("conectado ao DB "+ db +" com usuario "+usuario);
	}

	@Override
	public void comando(String comando) {
		// TODO Auto-generated method stub
		System.out.println("SQL > "+comando);
		
	}

	@Override
	public void desconectar(String db) {
		// TODO Auto-generated method stub
		System.out.println("dsconectado do DB "+ db);
		
	}
}
