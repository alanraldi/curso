package escola;

import java.util.Scanner;

public class Escola {

	// ok o sistema deve ter um menu de acesso com as opcoes
	// 1 - Entrar notas
	// .....ok buscar o nome do aluno
	// .....ok buscar tres <notas> do aluno
	// 2 - Exibir media
	// .....ok calcular a <media>
	// .....ok escreva a media
	// 3 - Exibir historico escolar
	// .....ok escreva as notas dos alunos!!
	// 4 - Exibir situacao
	// .....ok se media >= 6
	// .....ok ..escreva aprovado, <aluno>
	// .....ok senao
	// .....ok ..escreva reprovado, <aluno>
	// 0 - Sair
	// ok .....escreva Xau

	static final int OPCAO_ENTRAR_NOTAS = 1;
	static final int OPCAO_EXIBIR_MEDIA = 2;
	static final int OPCAO_EXIBIR_HISTORICO = 3;
	static final int OPCAO_EXIBIR_SITUACAO = 4;
	static final int OPCAO_SAIR = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcaoMenu;

		final int QTD_NOTAS = 3;
		String nomeAluno = "";
		double somaNotas = 0;
		double notas[] = new double[QTD_NOTAS];
		double mediaNotas = 0;

		do {
			imprimeMenu();

			opcaoMenu = scanner.nextInt();

			switch (opcaoMenu) {
			case OPCAO_ENTRAR_NOTAS:
				System.out.println("Digite o nome do aluno:");
				nomeAluno = scanner.nextLine();

				for (int i = 0; i < QTD_NOTAS; i++) {
					System.out.println("Digite a nota " + (i + 1)
							+ " do aluno:");
					notas[i] = scanner.nextDouble();
					somaNotas += notas[i];
				}
				break;
			case OPCAO_EXIBIR_MEDIA:
				mediaNotas = somaNotas / QTD_NOTAS;
				System.out.println("Media: " + mediaNotas);
				scanner.nextLine();
				break;
			case OPCAO_EXIBIR_HISTORICO:
				for (int i = 0; i < notas.length; i++) {
					System.out.println("nota " + (i + 1) + ": " + notas[i]);
				}

				break;
			case OPCAO_EXIBIR_SITUACAO:
				if (mediaNotas >= 6) {
					System.out.println("Aluno: Aprovado, " + nomeAluno);
				} else {
					System.out.println("Aluno: Reprovado, " + nomeAluno);
				}
				break;
			case OPCAO_SAIR:
				System.out.println("Xau...");
				break;
			default:
				// opcao invalida
				break;
			}

		} while (opcaoMenu != OPCAO_SAIR);

		scanner.close();
	}

	private static void imprimeMenu() {
		System.out.println("Controle academico\n");

		System.out.println("Digite a opcao desejada");
		System.out.println(OPCAO_ENTRAR_NOTAS + " - Entrar notas.");
		System.out.println(OPCAO_EXIBIR_MEDIA + " - Exibir media.");
		System.out.println(OPCAO_EXIBIR_HISTORICO
				+ " - Exibir historico escolar.");
		System.out.println(OPCAO_EXIBIR_SITUACAO + " - Exibir situacao.");
		System.out.println(" =======================");
		System.out.println(OPCAO_SAIR + " - Sair.");
	}
}
