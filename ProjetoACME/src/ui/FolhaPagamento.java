package ui;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaPagamento {
	public static void main(String[] args) {
		Funcionario lista [];
		lista = new Funcionario [6];

		lista[0] = new Empreiteiro("Empreiteiro",1234,3500);
		lista[1] = new Chefe("Chefe1", 1234, 3000, 200, 500);
		lista[2] = new Horista("Horista", 1234, 10, 5);		
		lista[3] = new Comissionado("Comissionado", 1234, 3000,10);
		lista[4] = new Horista("Horista", 1234, 90, 5);		
		lista[5] = new Comissionado("Comissionado", 1234, 8000,20);

//		for(int pos = 0  ; pos < func.length; pos++) {
			
//			System.out.println(	func[pos].getNome() +
//								" Salario " + func[pos].calcularSalario());
		System.out.println("================ FOLHA DE PAGAMENTO =================");	
		for(Funcionario f : lista) {	
	 	    System.out.printf("%8d - %-30s R$ %8.2f%n",f.getNumeroRegistro(), f.getNome(), f.calcularSalario());
		}
		
	}

}
