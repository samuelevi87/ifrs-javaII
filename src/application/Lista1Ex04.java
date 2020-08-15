package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex04 {

	public static void main(String[] args) {
		/*
		 * Construa um programa que leia três valores para os lados de um triângulo (A,
		 * B e C). O programa deve verificar se os lados fornecidos formam realmente um
		 * triângulo. Em caso positivo, deve mostrar a mensagem “Os lados formam um
		 * triângulo” e caso contrário “Os valores informados não podem formar um
		 * triângulo”. Para que três valores de lados formem um triângulo, cada par de
		 * lados somados não pode ser menor ou igual ao terceiro lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores numéricos: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("Os lados formam um triângulo.");
			// Informando o tipo de triângulo baseado nos lados.
			if (a == b && a == c) {
				System.out.println("Triângulo Equilátero.");
			} else if (a != b && a != c && c != b) {
				System.out.println("Trinângulo Escaleno.");
			} else {
				System.out.println("Triângulo Isósceles.");
			}
		} else {
			System.out.println("Os valores informados não podem formar um triângulo.");
		}

		sc.close();
	}

}
