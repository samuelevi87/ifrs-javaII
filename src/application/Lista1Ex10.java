package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex10 {

	public static void main(String[] args) {
		/*
		 * A nota final de um estudante é calculada a partir de três notas atribuídas,
		 * respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a
		 * um exame final. A média das três notas mencionadas obedece aos pesos a
		 * seguir: Nota Peso Trabalho de laboratório 2 Avaliação semestral 3 Exame final
		 * 5 Faça um programa que receba as três notas, calcule e mostre a média
		 * ponderada e o conceito que segue a tabela: Média Ponderada Conceito 8,0
		 * (inclusive) a 10,0 (inclusive) A 7,0 (inclusive) a 8,0 B 6,0 (inclusive) a
		 * 7,0 C 5,0 (inclusive) a 6,0 D 0,0 (inclusive) a 5,0 E
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as notas a seguir:");
		System.out.print("Trabalho de laboratório: ");
		double notaLab = sc.nextDouble();
		System.out.print("\nAvaliação Semestral: ");
		double notaAvSemestral = sc.nextDouble();
		System.out.print("\nExame Final: ");
		double notaExFinal = sc.nextDouble();

		double mediaponderada = ((notaLab * 2) + (notaAvSemestral * 3) + (notaExFinal * 5)) / 10;

		System.out.println("Media ponderada: " + mediaponderada);

		if (mediaponderada >= 8.0 && mediaponderada <= 10.0) {
			System.out.println("Conceito A");
		} else if (mediaponderada >= 7.0 && mediaponderada < 8.0) {
			System.out.println("Conceito B");
		} else if (mediaponderada >= 6.0 && mediaponderada < 7.0) {
			System.out.println("Conceito C");
		} else if (mediaponderada >= 5.0 && mediaponderada < 6.0) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}

		sc.close();
	}

}
