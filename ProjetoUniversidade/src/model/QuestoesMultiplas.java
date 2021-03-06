package model;

public class QuestoesMultiplas extends QuestaoSimples {
	
	private String altA;
	private String altB;
	private String altC;
	private String altD;
	
	public QuestoesMultiplas(String enunciado, String resposta, String altA, String altB, String altC,
			String altD) {
		super(enunciado, resposta);
		this.altA = altA;
		this.altB = altB;
		this.altC = altC;
		this.altD = altD;
	}
	
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+"\n"+
	           "  a) "+altA+"\n"+
	           "  b) "+altB+"\n"+
	           "  c) "+altC+"\n"+
	           "  d) "+altD;
	}

	public String getAltA() {
		return altA;
	}

	public void setAltA(String altA) {
		this.altA = altA;
	}

	public String getAltB() {
		return altB;
	}

	public void setAltB(String altB) {
		this.altB = altB;
	}

	public String getAltC() {
		return altC;
	}

	public void setAltC(String altC) {
		this.altC = altC;
	}

	public String getAltD() {
		return altD;
	}

	public void setAltD(String altD) {
		this.altD = altD;
	}
	

}