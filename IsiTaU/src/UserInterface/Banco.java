package UserInterface;
import core.Conta;

public class Banco {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.setNroConta(111111-1);
		conta1.setNome("Maria Jose");
		conta1.setCpf("123.123.123-12");
		System.out.println(conta1.mostrarDadosDaConta());

		conta2.setNroConta(22222-2);
		conta2.setNome("Joao Silva");
		conta2.setCpf("345.345.345-34");
		System.out.println(conta2.mostrarDadosDaConta());

		double queroDepositar1 = 4000.0;
		System.out.println(conta1.mostarOpDep(queroDepositar1));
		conta1.depositar(queroDepositar1);
		System.out.println(conta1.mostrarDadosDaConta());
		
		double queroDepositar2 = 5000.0;
		System.out.println(conta2.mostarOpDep(queroDepositar2));
	
		conta2.depositar(queroDepositar2);
		System.out.println(conta2.mostrarDadosDaConta());

		double queroSacar = 3100.0;
		System.out.println(conta2.mostarOpSaque(queroSacar));
		boolean resultado = conta2.saque(queroSacar);
		
		if (resultado == true) {

			System.out.println("Operacao efetivada");
		}
		
		else {
			
			System.out.println("Saldo insulficiente");
		}

		System.out.println(conta2.mostrarDadosDaConta());

	}
}
