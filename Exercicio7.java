import java.util.Scanner;
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        final int TAM = 10;

        int a[], b[],c[];
        int i, j, x=0;

        a = new int [TAM];
        b = new int [TAM];
        c = new int [TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o "+(i+1)+"o valor de A: ");
            a[i] = ler.nextInt();
        }
        
        System.out.println("\n");
        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o "+(i+1)+"o valor de B: ");
            b[i] = ler.nextInt();
        }

        i = 0;
        j = 0;
        
        boolean igual = false; 
        int diferentes = 0;

        for (i = 0; i < TAM; i++) {
           
            for (j = 0; j < TAM; j++) {
                
                if (a[i]==b[j]) {
                    igual = true;
                }
            }
            
            if (igual==false) {
                c[x] = a[i];
                x++;
                diferentes++;
            }
            
            igual = false;
        }
        
        System.out.println("\n Vetor C:");
        
        for (i = 0; i < x; i++) {
            System.out.print(c[i]+" ");
        }

    }
}