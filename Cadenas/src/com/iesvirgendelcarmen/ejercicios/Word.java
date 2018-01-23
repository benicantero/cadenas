//relacion de ejercicios del tema.
//ejercicio 1
package com.iesvirgendelcarmen.ejercicios;
/**
 * Class Word
 * @author matinal
 * @version 1.0
 */


public class Word {

	private String value;
	
	/**
	 * 
	 * @param value String contetn of word
	 */
	public Word(String value) {
		this.value = value;
	}
								//numero de letras
	/**
	 * 
	 * @return value length
	 */
	public int getNumberOfChar() {
		return value.length();
	}
								//empieza por vocal
	/**
	 * 
	 * @return boolean if start wiht a vowel
	 */
	public boolean startWithVowel() {
		return value.toLowerCase().matches("^[aeiouáéíóú].*$");
	}
								//acaba en vocal
	/**
	 * 
	 * @return
	 */
	public boolean endtWithVowel() {
		return value.toLowerCase().matches("^.*[aáeéiíoóuú]$");
	}
								//numero de vocales
	public int countNumbersOfVowel() {
		int sum = 0;
		for (int i = 0; i < getNumberOfChar(); i++) {
			Word word = new Word(value.toLowerCase().charAt(i) + "");
			if (word.startWithVowel()) {
				sum++;
			}
		}
		return sum;
	}
								//contiene una h
	public boolean containsHorh() {
		return value.toLowerCase().contains("h");
	}
								//indicar si son iguales
	public boolean isEqualInValue(String string) {
		return value.equalsIgnoreCase(string);
	}
	
	@Override
	public String toString() {
		return "Word [value=" + value + ", getNumberOfChar()=" + getNumberOfChar() + ", startWithVowel()="
				+ startWithVowel() + ", endtWithVowel()=" + endtWithVowel() + ", countNumbersOfVowel()="
				+ countNumbersOfVowel() + ", containsHorh()=" + containsHorh() + ", isPalindrome()=" + isPalindrome()
				+ "]";
	}
								//indicar si es palindromo
	public boolean isPalindrome() {
		StringBuilder sBuilder = new StringBuilder (value);
		String reverseWord= sBuilder.reverse().toString();
		return reverseWord.equals(value);
	}
}
