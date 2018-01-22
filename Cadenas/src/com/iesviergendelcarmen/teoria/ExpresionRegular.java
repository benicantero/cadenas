package com.iesviergendelcarmen.teoria;

import java.util.Scanner;

public class ExpresionRegular {

	public static void main(String[] args) {
		//1.- leer un DNI 12345678letra
		//2.- leer un telefono que pueda empezar por +34 y el numero que pueda empezar por 6 o 7
		
		
		
		String dniRegex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]{0,1}$";
		String telefonoRegex = "^(\\+?34)?[67][\\d]{8}$"; // lo equivalente al metacaracter \\d es [0-9]
		esValido (leerToken(),dniRegex);
		esValido(leerToken(), telefonoRegex);
	}

	public static String leerToken() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce token");
		String token = in.next();
		in.close();
		return token;
	}
	
	public static void esValido (String token, String regex) {
		boolean exito = token.trim().toUpperCase().matches(regex);
		System.out.printf("Token %s ¿es valido? %B%n",token,exito);
	}
}
