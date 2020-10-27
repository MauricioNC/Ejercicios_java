package java_ejercicios;
import java.util.*;

public class Termina_en_dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*clase para determinar si un numero termina en 2 o no*/
		
		// variable para leer datos por teclado
		Scanner entry = new Scanner(System.in);
		
		int num = 0; // varable en la que se almacena en dato recibido
	
		System.out.println("Ingresa un numero: ");
		num = entry.nextInt(); // lectura del dato
		
		// validamos primero si el numero no es menor o igual a 0
		if(num <= 0)
			System.out.println("Ingresa un numero mayor a cero");
		// si al dividir el numero entre 10, este tiene un residuo de 2, lo notificamos por pantalla
		else if(num % 10 == 2)
			System.out.println("El numero ingresado termina en 2");
		else
			System.out.println("El numero ingresado no termina en 2");

	}

}
