import java.util.InputMismatchException;
import java.util.Scanner;

public class prjmain {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int a,b,r;
	try {
	System.out.println("digite um valor ");
	a=teclado.nextInt();
	System.out.println("digite outro valor ");
	b=teclado.nextInt();
	
	r = a/b;
	
	System.out.println("Resultado "+r);
	
	teclado.close();
	}
	
	catch (InputMismatchException ex) {
		System.out.println("tipo de dado invalido");
	}
	catch (ArithmeticException ex) {
		System.out.println("não pode ser zero");
	}
	catch (Exception ex) {
		System.out.println("Deu Ruim");
	}
	
	}

} 

