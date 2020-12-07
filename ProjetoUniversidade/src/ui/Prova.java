package ui;

import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestoesMultiplas;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		
		int pontos=0;
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples simulado[];
		String respAluno;
		
		simulado = new QuestaoSimples[5];
		simulado[0] = new QuestoesMultiplas("Qual a formula da Agua?","H2O","H2SO4","H2O2", "H2O", "NaCl");
		simulado[1] = new QuestaoComDica("Qual a linguagem do curso?", "JAVA", "Come�a com JA e termina com VA");
		simulado[2] = new QuestaoSimples("Quem descobriu o Brasa?", "Pedrao Cabral");
		simulado[3] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleao?","Marrom", "Nao pense na cor");
		simulado[4] = new QuestaoSimples("Quem joga como nunca e perde como sempre?","XV de Jau");
		
		for (int pos=0; pos<simulado.length; pos++) {
			System.out.println(simulado[pos].aplicarQuestao());
			System.out.print("Sua resposta: ");
			respAluno = teclado.nextLine();
			if (simulado[pos].corrigir(respAluno)) {
				pontos++;
			}
		}
		
		System.out.println("Voce acertou um total de "+pontos+"/"+simulado.length);
				 
		
		
		teclado.close();
	}

}