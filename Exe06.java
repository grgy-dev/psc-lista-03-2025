import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner fodasse = new Scanner(System.in);

        System.out.print("Fala um numero: ");
        int n1 = fodasse.nextInt();

        System.out.print("Fala o outro chefe: ");
        int n2 = fodasse.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int sorteado = (int)(Math.random() * (maior - menor + 1)) + menor;

        if (sorteado % 2 == 0) {
            System.out.println("Número sorteado: " + sorteado + " (par)");
        } else {
            System.out.println("Número sorteado: " + sorteado + " (ímpar)");
        }

        fodasse.close();
    }
}