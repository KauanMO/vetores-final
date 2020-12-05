import java.util.Scanner;

public class Exercício2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
	int i,a[],r,j;
		final int TAM = 10;
		a = new int [TAM];
		
		for(j=0;j<=4;j++) {
			System.out.println("Digite um número e receba sua tabuada");
		a[j] = in.nextInt();
		
		for (i=0;i<=10;i++) {
			r = a[j]*i;
			System.out.println(a[j]+" * "+i+" = "+r);
		}
		}
		
	}
}