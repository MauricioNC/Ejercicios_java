package java_ejercicios;
import java.util.*;


public class Promedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry = new Scanner(System.in);
		
		int nAlumnos;
		double promedio, pMayor = 0, pMenor = 0;
		
		System.out.println("Introduce el numero de alumnos: ");
		nAlumnos = entry.nextInt();
		
		for(int i= 1; i <= nAlumnos; i++)
		{
			System.out.println("Promedio " + i);
			promedio = entry.nextFloat();
			
			if(promedio > pMayor)
				pMayor = promedio;
			else if(promedio < pMenor)
				pMenor = promedio;
		}
		
		System.out.println("El mayor es: " + pMayor);
		System.out.println("El menor es: " + pMenor);
		
			

	}

}
