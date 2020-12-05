import java.util.Scanner; 

public class Exercício1 {

 

	public static void main(String[] args) { 
			Scanner in = new Scanner(System.in); 

			int a[], b[], i, contpar=0, contimpar=0; 
				final int N = 20;
				a = new int[N]; 
				b = new int[N]; 

		for(i =0; i<N; i++) { 

			System.out.println("Entrar com o "+(i+1)+ " valor:"); 
			a[i] = in.nextInt(); 

				if (a[i]%2 == 0) { 

					contpar++; 

				}else { 

					contimpar++; 

				} 

		} 
		for(i =0; i<N; i++) {
			System.out.print(a[i]+" "); 

		} 
		
		System.out.println("\nPares: "+contpar);
		System.out.println("Impares: "+contimpar); 

	} 

 

} 