/**
 * 
 */
package poo.cajero;
import java.util.*;


/**
 * @author Mauricio
 *
 */
public class Banco {

	static Scanner entry = new Scanner(System.in);
	static Transacciones accion = new Transacciones();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
	}
	
	public static void showMenu()
	{
		int opcAction;
		
		System.out.println("\tQue opcion deseas realizar?");
		System.out.println("\t-------------------------------\n");
		System.out.println("\t1.- Retiro de efectivo");
		System.out.println("\t2.- Deposito");
		System.out.println("\t3.- Solicitar prestamo");
		System.out.println("\t4.- Ver estado de cuenta");
		System.out.println("\t0.- Finalizar");
		System.out.println("\t-------------------------------");
		System.out.print("\topc: ");
		opcAction = entry.nextInt();
		
		callActions(opcAction);
	}
	
	public static void callActions(int opcAction)
	{
		int back;
		int cantidadRetiro;
		switch(opcAction)
		{
			case 1:
				System.out.print("\t\nIngresa la cantidad a retirar: ");
				cantidadRetiro = entry.nextInt();
				accion.setRetiro(cantidadRetiro);
				int retiroSuccess = (int)accion.getRetiro();
				if(retiroSuccess == 0)
				{
					System.out.println("\t\nSu cuenta esta vacia");
					System.out.println("\tDesea realizar otra accion? 1.- Si  2.- No");
					System.out.println("\t---------------------------------------------");
					System.out.print("\topc: ");
					back = entry.nextInt();
					
					if(back == 1)
						showMenu();
					else if(back == 2)
					{
						System.exit(0);
					}
				}
				else if(retiroSuccess == 1)
				{
					System.out.println("\t\nNo tiene suficiente dinero disponible");
					System.out.println("\tDesea realizar otra accion? 1.- Si  2.- No");
					System.out.println("\t---------------------------------------------");
					System.out.print("\topc: ");
					back = entry.nextInt();
					
					if(back == 1)
					{
						showMenu();
						back=0;
					}
					else if(back == 2)
					{
						System.exit(0);
					}
				}
				else
				{
					System.out.println("\tLa transaccion se ha realizado con exito!!");
					System.out.println("\tDesea visualizar su estado de cuenta? 1.- Si  2.- Volver al menu principal");
					System.out.println("\t---------------------------------------------");
					System.out.print("\topc: ");
					back = entry.nextInt();
					
					if(back == 1)
						accion.getEdoCuenta();
					else if(back == 2)
					{
						showMenu();
					}
				}
				break;
			case 2: 
				int cantDeposito;
				String cardNum;
				String cleanBuffer = entry.nextLine();
				
				System.out.println("Ingresa el numero de la tarjeta a la que desea hacer el deposito: ");
				cardNum = entry.nextLine();
				
				if(accion.getValidaTarjeta(cardNum))
				{
					System.out.print("\t\nIngresa la cantidad que deseas depositar: ");
					cantDeposito = entry.nextInt();
					
					accion.setDeposito(cantDeposito);
					int depositoSuccess = (int)accion.getDeposito();
					
					if(depositoSuccess == 0)
					{
						System.out.println("\t\nNo puedes depositar una cantidad menor a $100 pesos");
						System.out.println("\tDesea volver a intentarlo? 1.- Si  2.- Volver al menu principal");
						System.out.println("\t-----------------------------------------------");
						System.out.print("\topc: ");
						back = entry.nextInt();
						if(back == 1)
							callActions(opcAction);
						else
							showMenu();
					}
					else
					{
						System.out.println("\t\nLa transaccion se ha realizado con exito!!");
						System.out.println("\tDesea visualizar su estado de cuenta? 1.- Si  2.- Volver al menu principal");
						System.out.println("\t---------------------------------------------");
						System.out.print("\topc: ");
						back = entry.nextInt();
						
						if(back == 1)
							accion.getEdoCuenta();
						else if(back == 2)
						{
							showMenu();
						}
					}	
				}
				else
				{
					System.out.println("Numero de tarjeta no valido");
					callActions(opcAction);
				}
				break;
			case 3:
				System.out.print("Selecciona la cantidad que deseas solicitar para realizar el prestamo: ");
				int cantPrestamo = entry.nextInt();
				int plazo;
				
				do
				{
					System.out.println("Selecciona el plazo de pago: ");
					System.out.println("ADVERTENCIA!  Recuerda que la tasa interes depende de la cantidad prestada y del pazo a pagar");
					
					System.out.println("Para cantidades menores a $7000 el interes es de 2% \nPara cantidades entre $7001 y $15000 el interes es de 4.6%"
							+ "\nPara cantidades mayores a $15000 el interes es de 8.3%");
					
					System.out.println("1.- 3 Meses --> +1%");
					System.out.println("2.- 6 Meses --> +1.3%");
					System.out.println("3.- 9 Meses --> +1.9%");
					System.out.println("4.- 12 Meses --> +2.6%");
					System.out.println("5.- 24 Meses --> +3.4%");
					plazo = entry.nextInt();
					
				}
				while(plazo != 3 && plazo != 6 && plazo != 9 && plazo != 12 && plazo != 24);
				
				accion.setPrestamo(cantPrestamo, plazo);
				accion.getPrestamo(plazo);
				
				System.out.println("\tDesea visualizar su estado de cuenta? 1.- Si  2.- Volver al menu principal");
				System.out.println("\t---------------------------------------------");
				System.out.print("\topc: ");
				back = entry.nextInt();
				
				if(back == 1)
					accion.getEdoCuenta();
				else if(back == 2)
				{
					showMenu();
				}
				break;
			case 4:
				accion.getEdoCuenta();
		}
	}

}
