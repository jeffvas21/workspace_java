public class LojaVirtual {
	public static void main(String[] args) {

		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		Produto prod3 = new Produto();
		
		prod1.setCodbarras(1);
		prod1.setNome("Chocolate");
		prod1.setDepartamento("Doceria");
		prod1.setPreco(2.0);
		
		prod2.setCodbarras(2);
		prod2.setNome("Laranja");
		prod2.setDepartamento("Feira");
		prod2.setPreco(4.0);
		
		prod3.setCodbarras(3);
		prod3.setNome("Heineken");
		prod3.setDepartamento("Cervejas");
		prod3.setPreco(5.0);

		prod1.mostraProduto();
		double desc1 = prod1.aplicardesconto(10.0);
		System.out.printf("Preco Promo  : R$ %.2f%n",desc1);

		System.out.println("===============================");
		prod2.mostraProduto();
		double desc2 = prod2.aplicardesconto(20.0);
		System.out.printf("Preco Promo  : R$ %.2f%n",desc2);

		System.out.println("===============================");
		prod3.mostraProduto();
		//double desc3 = prod3.aplicardesconto(30.0);
		System.out.printf("Preco Promo  : R$ %.2f%n",prod3.aplicardesconto(30.0));
	}

}