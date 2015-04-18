package escola;

import java.util.Scanner;

public class Aluno {

	private final int QTD_NOTAS = 4;

	private double somaNotas = 0;
	private String nome;
	private double notas[];

	public Aluno() {
		this.notas = new double[QTD_NOTAS];
	}

	public void cadastrarNome(Scanner scanner) {

		System.out.println("Digite o Primeiro nome do aluno:");
		this.nome = scanner.nextLine();
		scanner.nextLine();

	}

	public void cadastrarNotas(Scanner scanner) {
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno:");
			this.notas[i] = scanner.nextDouble();
			somaNotas += this.notas[i];

		}

	}

	public double calcularMedia() {

		return this.somaNotas / this.QTD_NOTAS;

	}

	public double[] getNotas() {
		return this.notas;
	}

	public String getNome() {

		return this.nome;
	}

	
	
	
}
