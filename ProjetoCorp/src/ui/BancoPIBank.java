package ui;

import model.Conta;
import model.ContaEspecial;

public class BancoPIBank {
	public static void main(String[] args) {
		
		Conta c1, c2;
		
		c1 = new Conta("Carina","12312312312",1234,200);
		c2 = new ContaEspecial("Amore","12343245346",4567,400,500);
		
//		Conta c1 = new Conta();
//		c1.setNumeroConta(1234);
//		c1.setNomeTitular("Carina");
//		c1.setCpf("123123123");
//		c1.setSaldo(200);

//		ContaEspecial c2 = new ContaEspecial();
//		c2.setNumeroConta(4567);
//		c2.setNomeTitular("Amore");
//		c2.setCpf("553123155");
//		c2.setSaldo(400);
//		c2.setLimite(500);

		System.out.println(c1);

		boolean deb = c1.debitar(100);
		if (deb == true) {
			System.out.println("Debito autorizado!!");
			System.out.printf("Novo Saldo: R$ %.2f%n", c1.getSaldo());
		} else
			System.out.println("Saldo insulficiente");
		
		
		System.out.println(c2);

		boolean deb2 = c2.debitar(500);
		if (deb2 == true) {
			System.out.println("Debito autorizado!!");
			System.out.printf("Novo Saldo R$ %.2f%n", c2.getSaldo());
			System.out.printf("Limite para Saque R$ %.2f%n", (c2.getLimite() + c2.getSaldo()));
		} else
			System.out.println("Saldo insulficiente");
			
	}

}
