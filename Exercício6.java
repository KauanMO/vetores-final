import java.util.Scanner; 

public class Exercício6 { 

	public static void main(String[] args) { 
		Scanner ler = new Scanner(System.in); 
			final int N = 3; 
			int a[], b[], c[], i, j,x, contIguais=0; 
			a = new int[N]; 
			b = new int[N]; 

				for(i=0; i<N; i++) { 
					System.out.println("Digite o "+(i+1)+" valor de A"); 
					a[i] = ler.nextInt(); 
				} 

				for(i=0; i<N; i++) { 
					System.out.println("Digite o "+(i+1)+" valor de B"); 
					b[i] = ler.nextInt(); 
				} 

				for(i=0; i<N; i++) { 
					for (j=0; j<N; j++) { 
						if (a[i] == b[j]) { 
							contIguais++; 
						} 
					} 
				}
				
				if (contIguais == 0) { 

					System.out.println("Não há valores iguais e o vetor C está vazio"); 

				}else { 
					x=0; 
					c = new int[contIguais]; 

					for (i = 0; i<N ; i++) { 
						for (j = 0; j<N; j++) { 
							if (a[i] == b[j]) { 
								c[x] = a[i]; 
								System.out.println(c[x]+" "); 
								x++; 

 } 

 } 

  } 

} 

} 

} 