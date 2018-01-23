package com.iesvirgendelcarmen.ejercicios;

public class SecureKey {
	
	private String key;
	
	private boolean almostEightCharacter() {
		return (key.length()>=8);
	}
	
	private boolean almostOneLowerCharacter() {
		return key.matches("[a-z]+");
	}
	
	private boolean almostOneUpperCharacter() {
		return key.matches("[A-Z]+");
	}
	
	
	public void secureKey() {  //llamada a todos lo metodos anteriores utilizando evaluacion perezosa && para que no siga evaluando el siguiente si no cumple el primero
		
	}
}
