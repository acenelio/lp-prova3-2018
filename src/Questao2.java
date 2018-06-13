import java.util.Locale;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		double[] notas = new double[n];
		
		for (int i=0; i<n; i++) {
			nomes[i] = sc.next();
			notas[i] = sc.nextDouble();
		}

		// 1 - CALCULO DA MEDIA
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += notas[i];
		}
		double media = soma / n;
		System.out.printf("Media = %.1f%n", media);

		// 2 - ENCONTRANDO MENOR NOTA
		int pos = 0;
		for (int i=1; i<n; i++) {
			if (notas[i] < notas[pos]) {
				pos = i;
			}
		}
		System.out.printf("Menor nota: %s - %.1f%n", nomes[pos], notas[pos]);
		
		// 3 - ALUNOS ACIMA DA MEDIA
		System.out.println("Acima da media:");
		for (int i=0; i<n; i++) {
			if (notas[i] > media) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}
}
