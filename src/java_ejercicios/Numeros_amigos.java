package java_ejercicios;
import java.util.*;


public class Numeros_amigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int num1, num2, suma = 0;
		
		System.out.println("ingresa dos numeros: ");
		num1 = entry.nextInt();
		
		System.out.println("Ingresa dos numeros: ");
		num2 = entry.nextInt();
		
		if(num1 <= 0 || num2 <= 0)
			System.out.println("Los numeros deben ser mayores a 0");
		else
		{
			for(int i = 1; i <= num1/2; i++)
			{
				if(num1%i == 0)
					suma += i;
			}
			
			if(suma == num2)
				System.out.println("Los numeros reecibidos son amigos :)");
			else
				System.out.println("Los numeros recibidos no son amigos :(");
		}
	}

}
