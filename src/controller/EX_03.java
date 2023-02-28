package controller;

import java.util.Random;

import javax.swing.JOptionPane;

public class EX_03 {

	public void base() {
		int tamanho = (Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:")) - 1);// para a leitura do vetor dar certo na recursividade
		int[] vetor = new int[tamanho+1];

		Random random = new Random();

		for (int i = 0; i < tamanho; i++) { // carregando a função com números aleatórios
			vetor[i] = random.nextInt();
		}

		JOptionPane.showMessageDialog(null, "Nesse vetor há: " + recursiva(vetor, tamanho) + " numeros pares gerados aleatoriamente");
	}

	private static int recursiva(int[] vetor, int t) {
		if (t < 0) {
			return 0;
		} else {
			if (vetor[t] % 2 == 0) {
				return 1 + recursiva(vetor, t - 1);
			} else {
				return 0 + recursiva(vetor, t - 1);
			}
		}
	}
}
