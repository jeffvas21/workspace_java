package core;

public class Conta {
	private int nroConta;
	private String nome;
	private String cpf;
	private double saldo;

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDep) {
		saldo = saldo + valorDep;
	}

	public boolean saque(double valorSaque) {
		if (saldo >= valorSaque) {
			saldo = saldo - valorSaque;
			return true;
		}
		return false;
	}

	public String mostrarDadosDaConta() {
		String resultado = "Conta     : " + nroConta + "\nNome      : " + nome + "\nCPF       : " + cpf + "\nSaldo     : R$ " + String.format("%.2f", saldo) +"\n";
		return resultado;
	}
	
	public String mostarOpSaque(double valorSaque) {
		String resultado = (nome + " com saldo de R$ " + String.format("%.2f", saldo) + " solicitou saque de R$ " + String.format("%.2f", (valorSaque)));
		return resultado;
	}
	
	public String mostarOpDep(double valorDep) {
		String resultado = (nome + " com saldo de R$ " + String.format("%.2f", saldo) + " solicitou deposito de R$ " + String.format("%.2f", (valorDep)));
		return resultado;
	}

}
