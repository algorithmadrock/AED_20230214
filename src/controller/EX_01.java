package controller;

import javax.swing.JOptionPane;

public class EX_01 {

	public void base() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));

		JOptionPane.showMessageDialog(null, "O resultado da multiplicação é:" + recursiva(a, b));
	}

	private static int recursiva(int a, int b) {
		if (b == 1) {
			return a;
		} else {
			return a + recursiva(a, b - 1);
		}
	}

}
