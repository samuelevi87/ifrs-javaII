package application;

import java.util.Scanner;

public class Lista1Ex07 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que leia três valores numéricos inteiros, identifique
		 * e apresente o maior valor informado.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores numéricos inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " é o maior valor.");
		} else if (b > a && b > c) {
			System.out.println(b + " é o maior valor.");
		} else {
			System.out.println(c + " é o maior valor.");
		}

		sc.close();
	}

}
