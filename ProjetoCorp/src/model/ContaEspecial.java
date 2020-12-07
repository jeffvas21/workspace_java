package model;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}

	public boolean debitar(float valorSaque) {
		if (super.saldo + this.limite >= valorSaque) {
			super.saldo -= valorSaque;
			return true;
		}
		return false;
	
	}
	
	public String toString() {
		return "Conta Especial: "  + super.numeroConta + "\n" +
				" Titular "     + super.nomeTitular +  "\n" +
				" CPF     "     + super.cpf + "\n" +
				" Saldo  R$ " + String.format("%.2f", super.saldo) + "\n" +
				" limite R$ " + String.format("%.2f%n", this.limite);

	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
