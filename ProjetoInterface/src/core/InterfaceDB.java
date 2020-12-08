package core;

public interface InterfaceDB {
	public void conectar(String db, String usuario);
	public void comando(String comando);
	public void desconectar(String desconectar);
}
