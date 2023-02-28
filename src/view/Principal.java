package view;

import controller.*;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		EX_01 umme = new EX_01();
		EX_02 dois = new EX_02();
		EX_03 tres = new EX_03();
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite o exerxício para exibição:\n 1) Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da multiplicação de A por B.\n 2) Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por subtrações, exiba o resto da divisão.\r\n 3) Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de números pares existentes no vetor.Considere que a entrada deve ser, apenas de números naturais diferentes de zero.\n\n Para SAIR pressione 0."));
			switch (opcao) {
			case 1:
				umme.base();
				break;
			case 2:
				dois.base();
				break;
			case 3:
				tres.base();
				break;

			case 0:
				System.out.println("Programa finalizado com sucesso! ");
				break;
			default:
				System.out.println("!!! ERRO: DIGITE UMA OPÇÃO VÁLIDA!!!");
			}
		} while (opcao != 0);
	}

}
