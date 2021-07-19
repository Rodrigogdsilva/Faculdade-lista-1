package exercicios;
import javax.swing.JOptionPane;

public class ex_4 {

	public static void main(String[] args) {

		int x = 0;
		String entrada;

		try {
			entrada = JOptionPane.showInputDialog("Digite o intervalo");
			int intervalo = Integer.parseInt(entrada);

			entrada = JOptionPane.showInputDialog("Digite o limite");
			int limite = Integer.parseInt(entrada);

			while (x < limite) {

				x = x + intervalo;
				System.out.println("Numero : " + x);
			}

		} catch (NumberFormatException ex) {
			System.out.println("Digite apenas numeros ");
		}

	}

}
