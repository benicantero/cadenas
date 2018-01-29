package com.iesvirgendelcarmen.ejercicios;

import java.util.Scanner;

public class TestConstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		StringBuilder sBuilder = new StringBuilder();
		while (in.hasNext()) {
			String word = in.next();
			sBuilder.append(word);
			sBuilder.append(" ");
		}
		in.close();
		System.out.println(UtilidadesString.countDeterminateArticle(sBuilder.toString()));
		System.out.println(UtilidadesString.countPrepositions(sBuilder.toString()));
		System.out.println(UtilidadesString.countIndeterminateArticles(sBuilder.toString()));
		System.out.println(UtilidadesString.countWords(sBuilder.toString()));
		System.out.println(UtilidadesString.returnToUpperCase(56, 8000, sBuilder.toString()));
	}

}
