package java_ejercicios;
import java.util.*;


public class Numeros_Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int num, aux, nInverso = 0, digito;
		
		System.out.println("Ingresa un numero: ");
		num = entry.nextInt();
		
		aux = num;
		
		// se da la vuelta al numero
		while(aux != 0)
		{
			digito = aux % 10;
			nInverso = nInverso * 10 + digito;
			aux = aux / 10;
		}
		
		if(num == nInverso)
			System.out.println("El numero es capicua");
		else
			System.out.println("El numero no es capicua");
		
	}

}
