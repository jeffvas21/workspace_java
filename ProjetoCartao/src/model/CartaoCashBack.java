package model;

public class CartaoCashBack extends CartaoPrePago {
	protected int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (saldo >= valor) {
		   saldo -= valor;	
		   switch (tipo) {
		   	case 1: saldo += (valor*0.02);
		   		break;
		   	case 2: saldo += (valor*0.05);
		   		break;
		   	case 3: saldo += (valor*0.08);
		   		break;
		   }
		   return true;
				
		   }
		else 
		   return false;
		}
	
	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao= " + numeroCartao + 
				             ", nomeTitular= "  + nomeTitular  + 
				             ", anoValidade= "  + anoValidade  + 
				             ", mesValidade= "  + mesValidade  + 
				             ", saldo R$"        + String.format("%.2f",saldo) + 
				             ", tipo= "         + tipo         + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
