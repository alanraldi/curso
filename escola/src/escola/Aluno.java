package escola;

import java.util.Scanner;

public class Aluno {

	private static final double MEDIA_APROVACAO = 6;

	private final int QTD_NOTAS = 4;

	private String nome;
	private double notas[];
	private double mediaFinal;

	public Aluno() {
		this.notas = new double[QTD_NOTAS];
	}

	public void cadastrarNome(Scanner scanner) {

		System.out.println("Digite o Primeiro nome do aluno:");
		this.nome = scanner.nextLine();
		scanner.nextLine();

	}

	public void cadastrarNotas(Scanner scanner) {
		double somaNotas = 0;
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno:");
			this.notas[i] = scanner.nextDouble();
			somaNotas += this.notas[i];

		}
		mediaFinal = mediaFinal(somaNotas);
	}

	private double mediaFinal(double somaNotas) {
		return somaNotas / this.QTD_NOTAS;
	}

	public double getMediaFinal() {

		return this.mediaFinal;

	}

	public double[] getNotas() {
		return this.notas;
	}

	public String getNome() {

		return this.nome;
	}

	public boolean isAprovado() {

		return (this.mediaFinal >= MEDIA_APROVACAO);
	}

}
