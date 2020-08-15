package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex03 {

	public static void main(String[] args) {
		/*
		 * Construa um programa que leia três valores numéricos (representados pelas
		 * variáveis A, B e C) e faça o cálculo do delta de uma equação de segundo grau,
		 * segundo a fórmula de Báskara. O programa deve mostrar quantas raízes reais a
		 * equação possui (delta < 0 – mostrar uma mensagem dizendo que a equação não
		 * possui raízes reais, delta > 0 – mostrar que possui duas raízes reais, delta
		 * = 0 – mostrar que possui uma única raiz real).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores numéricos: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else if (delta > 0) {
			System.out.println("A equação possui duas raízes reais.");
		} else {
			System.out.println("A equação possui uma única raiz real.");
		}

		sc.close();
	}

}
