package application;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex09 {

	public static void main(String[] args) {
		/*
		 * Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é
		 * inferior a 5000. Escreva um programa que possa ser utilizado para efetuar o
		 * cálculo do salário reajustado de um funcionário, a partir do valor do salário
		 * informado pelo usuário.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o valor do salário: R$ ");
		double salario = sc.nextDouble();

		if (salario < 5000.00) {
			double salarioFinal = salario + (salario * 0.3);
			System.out.printf("Novo Salário: R$ %.2f", salarioFinal);
		} else {
			System.out.println("Valor não elegível para aumento.");
			System.out.printf("O salário permanece R$ %.2f", salario);
		}

		sc.close();
	}

}
