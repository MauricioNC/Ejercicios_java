package poo.calculadora;
import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaramos la variable entry de tipo scanner para leerpor teclado
		Scanner entry = new Scanner(System.in);
		
		//declaramos la variable operaciones que nos permitira invocar nuestros metodos
		Operaciones operacion = new Operaciones();
		
		int num1, num2, opc;
		
		System.out.println("Elige una de las siguientes opciones: ");
		
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("-------------------");
		System.out.print("Opc: ");
		opc = entry.nextInt();
		
		//Validamos antes de entrar al switch que sea una opcion valida
		if(opc > 0 && opc < 5)
		{
			//si se cumple entonces pedimos los datos desde fuera para no repetir en cada case
			System.out.println("Ingresa dos numero");
			
			System.out.print("Num1: ");
			num1 = entry.nextInt();
			
			System.out.print("Num2: ");
			num2 = entry.nextInt();
			
			
			switch(opc)
			{
			/*En cada case lo que hacemos es llamar el setter de cada operacion y pasarle los datos obtenidos, posterior a eso mandamos llamar el
			 * getter para imprimir el resultado de la operacion
			 * */
			case 1: 
				operacion.setSuma(num1, num2);
				operacion.getSuma();
				break;
			case 2: 
				operacion.setResta(num1, num2);
				operacion.getResta();
				break;
			case 3:
				operacion.setMultiplicacion(num1, num2);
				operacion.getMultiplicacion();
				break;
			case 4:
				//parceamos las variables num1 y num2 a float, ya que el metodo correspondiente solo rtecibe parametros del tipo float
				operacion.setDivision((float)num1, (float)num2);
				operacion.getDivision();
				break;
			}			
		}
		else
			System.out.println("Opcion no valida");
		
		
	}

}
