package com.iesviergendelcarmen.teoria;

import java.util.Scanner;

public class ManipularDouble {

	public static void main(String[] args) {
		// 1.-leer Scanner (con next)
		// 2.-aplicar expresion regular
		// 3.-reemplazar "," por "." en el numero decimal
		// 4.-convertir String a double
		// 5.-mostrar ra�z c�bica con tres decimales

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce valor double"); // leo la cadena 
		String doble = sc.next();
		sc.close();
		String regEx = "^-?[\\d]+([,.][\\d]+)?$";// puede empezar por -; a continuacion un numero o mas; a continuacion un '.' o una ',' ;
												  //despues y para finalizar otro numero que se puede repetir
		boolean valido = doble.matches(regEx);
		System.out.printf("Es v�lido el double %s?, %b%n", doble,valido);
		if (valido) {
			String dobleReemplazado = doble.replace(',', '.'); // reemplazamos las ',' por los '.'
			System.out.println("Cambiamos comas por puntos para poder paserar "+dobleReemplazado);
			double dobleParseado = Double.parseDouble(dobleReemplazado); // parseamos el String a un double
			System.out.printf("Ra�z de c�bica de %s, vale %.3f%n ",doble,Math.cbrt(dobleParseado));
		}
		
	}	
}
