package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia dois valores numéricos inteiros e apresente o
		 * resultado da diferença do maior valor pelo menor valor. Se os valores forem
		 * iguais, o programa deve mostrar zero.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 02 valores inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("A diferença entre os números é de: " + (a - b));
		} else if (b > a) {
			System.out.println("A diferença entre os números é de: " + (b - a));
		} else {
			System.out.println(0);
		}

		sc.close();
	}

}
