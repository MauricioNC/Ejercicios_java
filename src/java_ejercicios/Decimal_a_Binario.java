package java_ejercicios;
import java.util.*;

public class Decimal_a_Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int num = 0, resultado = 0;
		int residuo;
		
		System.out.println("Ingresa el numero a convertir: ");
		num = entry.nextInt();
		
		do
		{ 
			resultado = num/2;
			residuo = num%2;
			num = resultado;
			
			System.out.print(residuo + " ");
		}
		while(resultado != 0);
	}

}
