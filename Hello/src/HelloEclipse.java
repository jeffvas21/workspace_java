import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Ufa... hello eclipse");
		
		int a = teclado.nextInt();
		
		System.out.println("Digitou: " + a);
		
		teclado.close();
	}
}