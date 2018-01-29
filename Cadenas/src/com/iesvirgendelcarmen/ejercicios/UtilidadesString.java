package com.iesvirgendelcarmen.ejercicios;

import java.util.Arrays;
import java.util.List;

public class UtilidadesString {

	public static final String[] ARTICULOS_DETERMINADOS = {"el", "lo", "la","los","las"};
	public static final String[] ARTICULOS_INDETERMINADOS = {"un","unos","una","unas"};
	public static final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "durante", "en", 
			"entre", "hacia", "hasta", "mediante", "para", "por", "según", "sin", "so", "sobre", "tras", "excepto"};
	
	private static String clearPunctuationMarksAndLowerCse (String phrase) {
		return phrase.trim().replaceAll("[\",;:\\.¿\\?¡!\\(\\)><\\-=]", "").toLowerCase();
	}
	
	public static int countWords(String phrase) {
		return clearPunctuationMarksAndLowerCse(phrase).split("\\s+").length;	
	}
	
	public static int countPrepositions(String phrase) {
		//get format phrase
		String newPhrase = clearPunctuationMarksAndLowerCse(phrase);
		//get an array of words from the phrase
		String[] words = newPhrase.split("\\s+");
		//change the array of prepositions to an arraylist to use contains method
		List<String> listPrepositions = Arrays.asList(PREPOSICIONES);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listPrepositions.contains(string))
				sum ++;
			}
		return sum;
	}

	
	public static int countDeterminateArticle(String phrase) {
		//get format phrase
		String newPhrase = clearPunctuationMarksAndLowerCse(phrase);
		//get an array of words from the phrase
		String[] words = newPhrase.split("\\s+");
		//change the array of Determinated Articles to an arraylist to use contains method
		List<String> listDeterminateArticles = Arrays.asList(ARTICULOS_DETERMINADOS);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listDeterminateArticles.contains(string))
				sum ++;
			}
		return sum;
	}
	
	public static int countIndeterminateArticles(String phrase) {
		//get format phrase
		String newPhrase = clearPunctuationMarksAndLowerCse(phrase);
		//get an array of words from the phrase
		String[] words = newPhrase.split("\\s+");
		//change the array of Indeterminated Articles to an arraylist to use contains method
		List<String> listIndeterminateArticles = Arrays.asList(ARTICULOS_INDETERMINADOS);
		int sum = 0; //counter
		//iterate the array
		for (String string : words) {
			if (listIndeterminateArticles.contains(string))
				sum ++;
			}
		return sum;
	}
	
	public static String returnToUpperCase (int begin, int end, String phrase) {
		
		if (begin >end || begin > phrase.length() || end > phrase.length())
			return phrase;
		else {
			String firstString = phrase.substring(0, begin);
			String middleString = phrase.substring(begin,end);
			String finalString = phrase.substring(end);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(firstString);
			sBuilder.append(middleString.toUpperCase());
			sBuilder.append(finalString);
			return sBuilder.toString();
		}
	}
	public static void main(String[] args) {
		String phrase = "Hola esto en una a ante CABE frase";
		System.out.println(returnToUpperCase(2, 7, phrase));
	}
}
