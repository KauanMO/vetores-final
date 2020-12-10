import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[], b[], i;
		double k;
		int fatorial = 1;
		final int n = 15;
		a = new int[n];
		b = new int[n];
		
		for (i=0; i<n; i++) {
			System.out.println("Escreva o número que será multiplicado");
			a[i] = ler.nextInt();
			fatorial = a[i];
			k = a[i]-1;
			if (a[i]<1){
				System.out.println("Este número não tem fatorial");
			}
			else {
			do{
				
				fatorial = (int) (k * fatorial);
				b[i] = fatorial;
				k--;
			}while (k>=1);
		System.out.println("O fatorial desse número é: "+b[i]);
			}

	    }
	}
}