package java_ejercicios;
import java.util.*;

public class Serie_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int num1 = 0, n;
		int num2 = 1;
		int suma_numero = 0;
		
		System.out.println("Hasta que numero de la serie de Fibonacci deseas ver?: ");
		n = entry.nextInt();
		
		
		System.out.print(num1 + ", " + num2 + ", ");
		for(int i = 3; i <= n; i++)
		{
			suma_numero = num1 + num2;
			System.out.print(suma_numero + ", ");
			num1 = num2;
			num2 = suma_numero;
		}
	}

}
