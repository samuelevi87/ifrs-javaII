package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex05 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que leia quatro valores numéricos inteiros e mostre os
		 * valores que são divisíveis por 2 e 3.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quatro valores numéricos inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.println("Números divisíveis por 2 e 3 simultâneamente:");

		if ((a % 2) == 0 && (a % 3) == 0) {
			System.out.printf(a + " ");
		}
		if ((b % 2) == 0 && (b % 3) == 0) {
			System.out.printf(b + " ");
		}
		if ((c % 2) == 0 && (c % 3) == 0) {
			System.out.printf(c + " ");
		}
		if ((d % 2) == 0 && (d % 3) == 0) {
			System.out.printf(d + " ");
		}

		sc.close();
	}

}
