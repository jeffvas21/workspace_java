
public class Carro {
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;


// fun��o come�a com void pois n�o retorna valor

	void imprimir() {
		System.out.println("----- CARRO -----");
		System.out.println("Marca: " + marca + "/" + modelo);
		System.out.println("Ano  : " + ano + " Cor: " + cor + " Preco: " + preco);
		System.out.println("");
	}

}
