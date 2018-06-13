import java.util.Locale;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[][] mat = new double[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		double x = sc.nextDouble();
		
		double soma = 0.0;
		for (int i=1; i<n; i++) {
			for (int j=0; j<i; j++) {
				soma += mat[i][j];
			}
		}
		System.out.printf("%.1f%n", soma);
		
		System.out.printf("ELEMENTOS MENORES QUE %.0f%n", x);
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < x) {
					System.out.printf("%.1f%n", mat[i][j]);
				}
			}
		}
		
		sc.close();
	}
}
