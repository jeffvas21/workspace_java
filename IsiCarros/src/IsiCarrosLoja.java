
public class IsiCarrosLoja {
	public static void main(String[] args) {
		
		Carro c1, c2;
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca  	= "Porche";
		c1.modelo 	= "Kaieny";
		c1.cor    	= "Azul Marinho";
		c1.ano		= 2020;
		c1.preco	= 1250000.00;
		
		c2.marca	= "GM";
		c2.modelo	= "Corsa";
		c2.cor		= "Cinza";
		c2.ano		= 1998;
		c2.preco	= 5600.00;

		c1.imprimir();
		c2.imprimir();
		
	}
}
