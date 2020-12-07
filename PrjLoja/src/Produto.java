public class Produto {
	private int codbarras;
	private String nome;
	private String departamento;
	private double preco;

	// metodo mostraProduto() --- somente imprime na tela
	
	public int getCodbarras() {
		return codbarras;
	}

	public void setCodbarras(int codbarras) {
		this.codbarras = codbarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	void mostraProduto() {
		System.out.println("Codigo       : " +codbarras);
		System.out.println("Nome         : " +nome);
		System.out.println("Departamento : " +departamento);
		System.out.printf ("Preco        : R$ %.2f%n", preco);
	}

	// metodo aplicardesconto(percentual) ---- retorna valor do produto com desconto informado
	
	double aplicardesconto(double percentual) {
		return preco - preco * percentual / 100;
	}
	
	
}
