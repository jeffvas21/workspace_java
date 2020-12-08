package model;

public class Horista extends Funcionario {
	private float valorHora;
	private int nroHoras;
	
	public Horista(String nome, int numeroRegistro, float valorHora, int nroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.nroHoras = nroHoras;
	}

	@Override
	public double calcularSalario() {
		return this.valorHora * this.nroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNroHoras() {
		return nroHoras;
	}

	public void setNroHoras(int nroHoras) {
		this.nroHoras = nroHoras;
	}
	
}
