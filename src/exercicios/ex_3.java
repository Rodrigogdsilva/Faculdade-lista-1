package exercicios;
import javax.swing.JOptionPane;

public class ex_3 {

	public static void main(String[] args) {

		String entrada;

		try {
			double resultado;
			entrada = JOptionPane.showInputDialog("Digite a nota de P1");
			double P1 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite a nota de P2");
			double P2 = Double.parseDouble(entrada);

			entrada = JOptionPane.showInputDialog("Digite a nota de Trabalho");
			double trabalho = Double.parseDouble(entrada);

			resultado = (P1 * 0.35) + (P2 * 0.5) + (trabalho * 0.15);

			System.out.println("A sua m�dia � : " + resultado);

		} catch (NumberFormatException ex) {
			System.out.println("Digite apenas numeros ");
		}

	}

}
