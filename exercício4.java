import java.util.Scanner;
import java.lang.Math;

public class exercício4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int a[], b[], i;
			double pot;
			final int n = 11;
			a = new int[n];
			b = new int[n];
			
		for (i=0; i<n; i++) {
			System.out.println("Apresente o "+(i+1)+"o número como expoente da base 2");
			a[i] = ler.nextInt();
			
			pot = Math.pow (2, a[i]);
				System.out.print(pot + "\n");
		}

	}

}
