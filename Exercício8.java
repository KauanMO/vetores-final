import java.util.Scanner; 
public class Exercício8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int a[], i, j, p, pesquisa, contem = 0, naocontem = 0;
			final int n = 10;
			a = new int[n];
			
			for (i=0; i<n; i++) {
				System.out.println("Informe os 10 itens para pesquisá-los");
				a[i] = ler.nextInt();
			}
				System.out.println("Digite o número que deseja pesquisar no vetor");
				pesquisa = ler.nextInt();
					for (p=0; p<n; p++) {
						if (pesquisa == a[p]) {
							contem++;
						}
						else {
							naocontem++;
						}
					}
					if (contem>0) {
						System.out.println("O número "+pesquisa+" está sim no vetor");	
					}
					else if (naocontem>1) {
						System.out.println("O número pesquisado não está no vetor");	
					}
			}
	}


