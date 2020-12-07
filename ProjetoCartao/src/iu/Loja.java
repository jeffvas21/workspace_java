package iu;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Loja {
	public static void main(String[] args) {
		CartaoPrePago cpp = new  CartaoPrePago("123456","Antonio Silva", 2022, 04, 1500);
		CartaoPrePago ccb1= new CartaoCashBack("567501","Bronze", 2023,05,1200,1);
		CartaoPrePago ccb2= new CartaoCashBack("567502","Silver", 2023,05,1200,2);
		CartaoPrePago ccb3= new CartaoCashBack("567503","Gold  ", 2023,05,1200,3);

		System.out.println(cpp);
		System.out.println(ccb1);
		System.out.println(ccb2);
		System.out.println(ccb3);

		System.out.println("===============================");

		cpp.adicionarCredito(500);
		ccb1.adicionarCredito(500);
		ccb2.adicionarCredito(500);
		ccb3.adicionarCredito(500);
		
		cpp.comprar(100);
		ccb1.comprar(100);
		ccb2.comprar(100);
		ccb3.comprar(100);

		System.out.println(cpp);
		System.out.println(ccb1);
		System.out.println(ccb2);
		System.out.println(ccb3);
	
		
	}
}


