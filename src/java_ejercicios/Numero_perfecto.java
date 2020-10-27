package java_ejercicios;
import java.util.*;


public class Numero_perfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int num, suma = 0;
		
		System.out.println("Ingresa un numero mayor a cero: ");
		num = entry.nextInt();
		
		if(num <= 0) // validamos si el numereo recibido es mayor a 0
			System.out.println("Ingresa un numero mayor a cero!!");
		else
		{
			// iniciamos un ciclo que vaya desde 1 hasta num/2
			for(int i = 1; i <= num/2; i++)
			{
				// validamos si el residuo de dividir num / i es igual a 0 y sumamos i con la variable suma
				if(num % i == 0)
					suma += i;
			}
			
			// porultimo validamos si la suma es igual al numero recibido
			if(suma == num)
				System.out.println("El numero ingresado es pefecto");
			else
				System.out.println("El numero ingresado no es perfecto");
		}
	
	}

}
