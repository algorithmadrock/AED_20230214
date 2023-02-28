package controller;

import javax.swing.JOptionPane;

public class EX_02 {

	public void base() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));

		JOptionPane.showMessageDialog(null, "O resto da divisão é:" + recursiva(a, b));
	}

	private static int recursiva(int a, int b) {
		if (b > a) { // a divisão deu resto
			return a;
		} else {
			return recursiva(a - b, b);
		}
	}

}
