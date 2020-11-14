package java_ejercicios;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int rango, factorial = 1;
		
		System.out.println("Has ta que numero deseas obtener el factorial?: ");
		rango = entry.nextInt();
		
		for(int i = 1; i <= rango; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("El factorial de " + rango + " es " + factorial);
	}

}
