package poo.calculadora;

public class Operaciones { 
	
	//declaramos las variables que vamos a utilizar, las encapsulamos con un private para bloquear el acceso directo a la variable.
	private int suma;
	private int resta;
	private int multiplicacion;
	private float division;
	
	//creamos un constructor con el mismo nombre que la clase, este no retorna nada y no se le especifica el tipo de retorno
	//en este constructor inicializamos las variables que vamos a utilizar
	public Operaciones()
	{
		suma = 0;
		resta = 0;
		multiplicacion = 0;
		division = 0;
	}
	
	
	/*Los metodos set realizan la opceracion correspondiendte y almacenan el resultado en alguna de las variables anteriormente declaradas
	 * estas reciben dos parametros a excepcion del metodo setDivision, que son los datos ingresados por el usuario
	 * Y los metodos get unicamente imprimen el resultado de la operacion.
	 * */
	
	public void setSuma(int num1, int num2)
	{
		suma = num1 + num2;
	}
	
	public void getSuma()
	{
		System.out.println("La suma es: " + suma);
	}
	
	public void setResta(int num1, int num2)
	{
		resta = num1 - num2;
	}
	
	public void getResta()
	{
		System.out.println("La resta es: " + resta);
	}
	
	public void setMultiplicacion(int num1, int num2)
	{
		multiplicacion = num1 * num2;
	}
	
	public void getMultiplicacion()
	{
		System.out.println("La multiplicacion es: " + multiplicacion);
	}
	
	// Este metodo recibe parametros float ya que hay ocasiones en las que el resultado de una division no siempre es entero, sino que retorna un valor con decimales.
	public void setDivision(float num1, float num2)
	{
		division = num1 / num2;
	}
	
	public void getDivision()
	{
		System.out.println("La division es: " + division);
	}
}
