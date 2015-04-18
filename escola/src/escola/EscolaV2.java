package escola;

import java.util.Scanner;

public class EscolaV2 {

	static final int OPCAO_ENTRAR_NOTAS = 1;
	static final int OPCAO_EXIBIR_MEDIA = 2;
	static final int OPCAO_EXIBIR_HISTORICO = 3;
	static final int OPCAO_EXIBIR_SITUACAO = 4;
	static final int OPCAO_SAIR = 0;

	public static void main(String[] args) {

		Tela tela = new Tela();

		Scanner scanner = new Scanner(System.in);
		int opcaoMenu;

		Aluno aluno = new Aluno();

		double mediaNotas = 0;

		do {
			imprimeMenu(tela);

			opcaoMenu = scanner.nextInt();

			switch (opcaoMenu) {
			case OPCAO_ENTRAR_NOTAS:
				aluno.cadastrarNome(scanner);
				aluno.cadastrarNotas(scanner);
				break;
			case OPCAO_EXIBIR_MEDIA:
				mediaNotas = aluno.getMediaFinal();
				System.out.println("Media: " + mediaNotas);
				scanner.nextLine();
				break;
			case OPCAO_EXIBIR_HISTORICO:
				double notas[] = aluno.getNotas();
				for (int i = 0; i < notas.length; i++) {
					System.out.println("nota " + (i + 1) + ": " + notas[i]);
				}
				scanner.nextLine();
				break;
			case OPCAO_EXIBIR_SITUACAO:
				if (aluno.isAprovado()) {
					System.out.println("Aprovado, " + aluno.getNome());
				} else {
					System.out.println("Reprovado, " + aluno.getNome());
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

	private static void imprimeMenu(Tela tela) {
		tela.escreva("Controle academico\n");
		tela.escrevaSeparador();
		tela.escreva("Digite a opcao desejada");
		tela.escreva(OPCAO_ENTRAR_NOTAS + " - Entrar notas.");
		tela.escreva(OPCAO_EXIBIR_MEDIA + " - Exibir media.");
		tela.escreva(OPCAO_EXIBIR_HISTORICO + " - Exibir historico escolar.");
		tela.escreva(OPCAO_EXIBIR_SITUACAO + " - Exibir situacao.");
		tela.escrevaSeparador();
		tela.escreva(OPCAO_SAIR + " - Sair.");
	}
}
