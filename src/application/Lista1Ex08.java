package application;

import java.util.Scanner;

public class Lista1Ex08 {

	public static void main(String[] args) {
		/* Faça um programa que leia três valores numéricos inteiros, identifique e
apresente o menor valor informado.*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores numéricos inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println(a + " é o menor valor.");
		} else if (b < a && b < c) {
			System.out.println(b + " é o menor valor.");
		} else {
			System.out.println(c + " é o menor valor.");
		}

		sc.close();

	}

}
