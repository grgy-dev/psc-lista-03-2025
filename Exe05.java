import java.util.Scanner;

public class Exe05 {
    public static void main (String[] args){
        Scanner fodasse = new Scanner (System.in);

        System.out.print("Fala o primeiro numero ai: ");
        int numeroUm = fodasse.nextInt();

        System.out.print("Fala o segundo numero irmao: ");
        int numeroDois = fodasse.nextInt();

        System.out.print("Digite a operacao (+, -, *, /, ^): ");
        String operacao = fodasse.next();

        double resultado;

        switch (operacao) {
            case "+":
            resultado = numeroUm + numeroDois;
            System.out.println("Resultado: "+resultado);
            break;

            case "-":
            resultado = numeroUm - numeroDois;
            System.out.println("Resultado: "+resultado);
            break;

            case "*":
            resultado = numeroUm * numeroDois;
            System.out.println("Resultado: "+resultado);
            break;

            case "/":
            resultado = numeroUm / numeroDois;
            System.out.println("Resultado: "+resultado);
            break;

            case "^":
            resultado = numeroUm ^ numeroDois;
            System.out.println("Resultado: "+resultado);
            break;
        }
        fodasse.close();

    }
}