import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
	int i, j, a[];
		final int TAM = 10;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite um n�mero e descubra se ele � ou n�o um n�mero primo");
			a[i] = ler.nextInt();
			int resto0=0;
			for (j=1; j<a[i]; j++) {
				if (a[i] % j == 0) {
					resto0++;
				}
			}
			if (resto0 >= 2) {
				System.out.println("o n�mero " +a[i] +" N�O � primo");
			} else {
					System.out.println("o numero " +a[i] +" � um n�mero primo \n");
				}
			}
		}
		
		
	}


