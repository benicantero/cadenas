package com.iesviergendelcarmen.teoria;

import java.util.Scanner;

public class AuxiliarTarjetaCredito {

	public static void main(String[] args) {
		//leer con scanner el numero de tarjeta
		System.out.println("Introduce el numero de la tarjeta");
		Scanner in= new Scanner(System.in);
		String numeroTarjeta = in.nextLine();
		in.close();
		//expresion regular para comprobar ese formato del numero
		//se admite espacio en blanco al principio y al final
		//se admite xxxx xxxx xxxx tambien con mas expacios entre cada grupo de cuatro numeros
		//se admite xxxx-xxxx-xxxxx-xxxxx
		//se admite 1234123412341234
		String regexNumeroTarjeta = "\\s*\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)\\d{4}(\\s*|-?)";
		System.out.printf("Comprobando numero %s: %b%n",numeroTarjeta,numeroTarjeta.matches(regexNumeroTarjeta));
		String numeroTarjetaFinal = numeroTarjeta.trim().replaceAll("[-\\s]",""); //sin trim(quita espacios en blanco delante y detras)
																				   //tambien funciona
		System.out.println(numeroTarjetaFinal);
		
		/*char cero = '0'; // vale 48 en unicode
		char uno ='1';  // vale 49 en unicode
		int suma = cero + uno; // no da error porque suma sus valores unicode*/
		
		int suma = 0;
		for (int i = 0; i < numeroTarjetaFinal.length() - 1; i++) {
			int numero = numeroTarjetaFinal.charAt(i) - 48; // se resta 48 porque el 0 en unicode es 48
			if (i % 2 != 0 ) {
				numero *= 2;
			}
			suma += numero;
		}
		int multiplicacion = suma * 9; // segun algoritmo de Lunh
		String multiplicacionCadena = multiplicacion + "";
		//904 length = 3; posicion 0 ->9, posicion 1 ->0, posicion 2->4
		String ultimoNumero = multiplicacionCadena.substring(multiplicacionCadena.length()-1);
		System.out.printf("Suma :%d, multiplicacion :%d, ultima cifra :%s%n",suma, multiplicacion, ultimoNumero);
		//System.out.printf("Tarjeta %s ¿valida? : %b%n", numeroTarjetaFinal,numeroTarjetaFinal.substring(beginIndex)
				
				
			//	numeroTarjetaFinal.equals(ultimoNumero)); // creo que esto final esta mal
	}

}
