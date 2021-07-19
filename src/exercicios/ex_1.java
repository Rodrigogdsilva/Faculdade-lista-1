package exercicios;
import javax.swing.JOptionPane;

public class ex_1 {

	public static void main(String[] args) {

		int x, res;
		String entrada;
		x = 0;

		try {
			entrada = JOptionPane.showInputDialog("Digite o intervalo");
			int intervalo = Integer.parseInt(entrada);

			while (x < 100) {

				x = x + intervalo;
				res = 0;
				res = x % 2;
				if (res == 0) {
					System.out.println("Numeros par encontrado " + x);
				}
			}

		} catch (NumberFormatException ex) {
			System.out.println("Digite apenas numeros ");
		}

	}

}
