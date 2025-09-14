import java.util.Scanner;
public class Exe03 {
    public static void main(String[] args) {
        Scanner fodasse = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = fodasse.nextDouble();

        System.out.print("Digite o b: ");
        double b = fodasse.nextDouble();

        System.out.print("Digite o c: ");
        double c = fodasse.nextDouble();

       if (a == 0 && b == 0 && c != 0) {
        System.out.println("Nao existe");
       } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = -c / b;
            System.out.println("Raiz: " + x);
        } else {
            double delta = b*b - 4*a*c;

            if (delta < 0) {
                System.out.println("nao tem como assim nao chefe.");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.println("raízes  iguais.");
                System.out.println("Raiz: " + x);
            } else {
                double raizDelta = Math.sqrt(delta);
                double x1 = (-b + raizDelta) / (2*a);
                double x2 = (-b - raizDelta) / (2*a);
                System.out.println(" raízes diferentes.");
                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);
            }
        }
        fodasse.close();

     }
       


    }
