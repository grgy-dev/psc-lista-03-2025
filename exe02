import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner fodasse = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int compra = fodasse.nextInt();

        System.out.print("Digite o valor pago: ");
        int pago = fodasse.nextInt();
        
        if (pago < compra) {
            System.out.println("Pobre!");
        } else {
            int troco = pago - compra;
            int[] notas = {50, 20, 10, 5, 2, 1};
            System.out.println("Troco: R$ " + troco);
            for (int nota : notas) {               //dhr o negocio do for
                int qtd = troco / nota;  
                troco = troco % nota;    
                if (qtd > 0) {
                    System.out.println("Notas de " + nota + ": " + qtd);
                }
            }
        }

        fodasse.close();
    }
}
