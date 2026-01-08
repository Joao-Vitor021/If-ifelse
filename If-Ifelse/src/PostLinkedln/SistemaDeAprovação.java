package PostLinkedln;

import java.util.Scanner;

public class SistemaDeAprovação {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual foi sua nota? (0 a 10)");
		double nota = entrada.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Nota digitada inválida");
			entrada.close();
			return;
		}

		else if (nota >= 7) {
			System.out.println("Você foi aprovado, Parabéns!");

		}

		else if (nota >= 5) {
			System.out.println("Você está de recuperação, Melhore!");
		} else {
			System.out.println("Você foi reprovado!");
		}
		entrada.close();
	}

}
