package poo.cajero;

import java.util.StringTokenizer;

public class Transacciones {
	
	private int retiro;
	private int deposito;
	private int transferencia;
	private float prestamo;
	private float disponible;
	private boolean denegated;
	
	public Transacciones()
	{
		retiro = 0;
		deposito = 0;
		prestamo = 0;
		disponible = 0;
		denegated = true;
	}
	
///////////////////////	 RETIRO	///////////////////////
	
	public void setRetiro(int cantRetiro)
	{
		retiro = cantRetiro;
		if(retiro > disponible)
			denegated = true;
	}
	
	public float getRetiro()
	{
		if(denegated && disponible == 0)
			return 0;
		else if(denegated && disponible > 0)
			return 1;
		else
		{
			return disponible = (disponible - (float)retiro);
		}
	}
	
///////////////////////	 DEPOSITO	/////////////////////// 
	
	// --->	 VALIDA TARJETA	  <--- //
	
	public boolean getValidaTarjeta(String cardNum)
	{
		StringTokenizer CardNumNsp = new StringTokenizer(cardNum, " ");
		String token = "";

		String auxString = "";
		while(CardNumNsp.hasMoreTokens())
		{
			token = CardNumNsp.nextToken();
			auxString += token;
		}
		
		int newCardNumInt[] = new int[16];
		
		for(int i = 0; i < auxString.length(); i++)
			newCardNumInt[i] = auxString.charAt(i) - '0';
		
		int sumaValidCard = 0;
		for(int i = 0; i < 16; i++)
		{
			int digitDouble;
			if(i % 2 == 0)
			{
				digitDouble = newCardNumInt[i] * 2;
				if(digitDouble > 9)
					digitDouble = digitDouble - 9;
			}
			else
				digitDouble = newCardNumInt[i];
		
			
			sumaValidCard += digitDouble;
		}
		if(sumaValidCard % 10 == 0)
			return true;
		else
			return false;
	}
	
	// --->	 REALIZA DEPOSITO	  <--- //
	
	public void setDeposito(int cantDeposito)
	{
		deposito = cantDeposito;
		if(deposito < 100)
			denegated = true;
		else
			denegated = false;
	}
	
	public float getDeposito()
	{
		if(denegated)
			return 0;
		else	
			return disponible = (disponible + (float)deposito);
	}
	
///////////////////////	 SOLICITUD DE PRESTAMO	///////////////////////
	
	public void setPrestamo(int cantPrestamo, int plazo)
	{
		prestamo = (float)cantPrestamo;
		switch(plazo)
		{
			case 3:
				if(prestamo <= 7000)
					prestamo += (prestamo * 0.02) + (prestamo * 0.01);
				else if(prestamo <= 15000)
					prestamo += (prestamo * 0.046) + (prestamo * 0.01);
				else if(prestamo > 15000)
					prestamo += (prestamo * 0.083) + (prestamo * 0.01);
				break;
			case 6:
				if(prestamo <= 7000)
					prestamo += (prestamo * 0.02) + (prestamo * 0.013);
				if(prestamo <= 15000)
					prestamo += (prestamo * 0.046) + (prestamo * 0.013);
				else if(prestamo > 15000)
					prestamo += (prestamo * 0.083) + (prestamo * 0.013);
				break;
			case 9:
				if(prestamo <= 7000)
					prestamo += (prestamo * 0.02) + (prestamo * 0.019);
				if(prestamo <= 15000)
					prestamo += (prestamo * 0.046) + (prestamo * 0.019);
				else if(prestamo > 15000)
					prestamo += (prestamo * 0.083) + (prestamo * 0.019);
				break;
			case 12:
				if(prestamo <= 7000)
					prestamo += (prestamo * 0.02) + (prestamo * 0.026);
				if(prestamo <= 15000)
					prestamo += (prestamo * 0.046) + (prestamo * 0.026);
				else if(cantPrestamo > 15000)
					prestamo += (prestamo * 0.083) + (prestamo * 0.026);
				break;
			case 24:
				if(prestamo <= 7000)
					prestamo += (prestamo * 0.02) + (prestamo * 0.034);
				if(prestamo <= 15000)
					prestamo += (prestamo * 0.046) + (prestamo * 0.034);
				else if(prestamo > 15000)
					prestamo += (prestamo * 0.083) + (prestamo * 0.034);
				break;
		}
		
		disponible += (float)cantPrestamo;
	}
	
	public void getPrestamo(int plazo)
	{
		System.out.println("El monto total del prestamo a pagar es de $" + prestamo + " y el pago mensual es de " + (prestamo / plazo));
	}
	
	
///////////////////////	 MOSTRAR ESTADO DE CUENTA	///////////////////////
	
	public void getEdoCuenta()
	{
		System.out.println("\tSu saldo actual disponioble es de: " + disponible);
	}
	
}
