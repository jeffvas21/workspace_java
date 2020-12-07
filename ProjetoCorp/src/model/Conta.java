package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;

	public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
		//super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public boolean debitar(float valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
	}
	
	public void creditar(float valorCredito) {
		this.saldo += valorCredito;
	
	}
	
	public String toString() {		
		return "Conta : "  + this.numeroConta + "\n" +
		" Titular "     + this.nomeTitular +  "\n" +
		" CPF     "     + this.cpf + "\n" +
		" Saldo  R$ " + String.format("%.2f%n", this.saldo);

	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
