package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um valor numérico inteiro. O programa deve
		 * apresentar a mensagem “O valor está na faixa permitida”, caso o valor
		 * informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
		 * deve apresentar a mensagem “O valor está fora da faixa permitida”.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int a = sc.nextInt();

		if (a > 0 && a < 10) {
			System.out.println("O valor está na faixa permitida.");
		} else {
			System.out.println("O valor está fora da faixa permitida.");
		}

		sc.close();
	}

}
