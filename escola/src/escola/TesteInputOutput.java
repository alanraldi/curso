package escola;

import java.util.Scanner;

public class TesteInputOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nomeUsuario = scanner.next();

		System.out.println("Digite sua idade:");
		int idadeUsuario = scanner.nextInt();

		if (idadeUsuario > 60) {
			System.out.println("Ola sr. " + nomeUsuario);
		} else {
			System.out.println("Ola " + nomeUsuario);
		}

		scanner.close();
	}

}
