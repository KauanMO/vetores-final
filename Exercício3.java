import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	int i, j, a[];
		final int TAM = 10;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite um número e descubra se ele é ou não um número primo");
			a[i] = ler.nextInt();
			int resto0=0;
			for (j=1; j<a[i]; j++) {
				if (a[i] % j == 0) {
					resto0++;
				}
			}
			if (resto0 >= 2) {
				System.out.println("o número " +a[i] +" NÃO é primo");
			} else {
					System.out.println("o numero " +a[i] +" é um número primo \n");
				}
			}
		}
		
		
	}


