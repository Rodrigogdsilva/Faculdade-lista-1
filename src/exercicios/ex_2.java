package exercicios;
import javax.swing.JOptionPane;

public class ex_2 {

	public static void main(String[] args) {

		int intervaloInicial = 0, intervaloFinal = 0, i = 0, contador = 0;
		boolean isPrimo = true;
		int numPrimos[] = new int[contador];

		try {

			while (intervaloInicial > intervaloFinal) {

				JOptionPane.showMessageDialog(null, "Digite um valor de início menor que o valor final");
				intervaloInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o intervalo inicial:"));
				intervaloFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o intervalo Final:"));

			}

			for (i = intervaloInicial; i <= intervaloFinal; i++) {
				isPrimo = false;

				if (((i % 2) != 0) && ((i % 3) != 0)) {

					int numPrimo = numPrimos[contador];
					isPrimo = true;
					contador++;
				}

			}

			for (int x = 0; x <= contador; x++) {

				System.out.println(x + "º número primo" + numPrimos[x]);
			}

		} catch (NumberFormatException ex) {

			JOptionPane.showMessageDialog(null, "Ops! Apenas números devem ser digitados");

		}
	}
}
