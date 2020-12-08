package model;

public class Chefe extends Funcionario{
	private double salarioBase;
	private float  adicionalFuncao;
	private float  beneficioTerno;
	public Chefe(String nome, int numeroRegistro, double salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	@Override
	public double calcularSalario() {
		return (this.salarioBase + this.salarioBase * this.adicionalFuncao/ 100 + this.beneficioTerno); 
	}

}
