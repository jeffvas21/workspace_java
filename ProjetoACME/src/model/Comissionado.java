package model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	
	}

	@Override
	public double calcularSalario() {
		return  this.salarioBase + this.salarioBase * this.comissao / 100;
	}

}
