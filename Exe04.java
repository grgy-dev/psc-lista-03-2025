import java.util.Scanner;
public class Exe04{
    public static void main(String[] args) {
        Scanner fodasse = new Scanner(System.in);

    System.out.print("Digite as opcoes: (1 = perimetro, 2 = area, 3 = volume): ");
    int opcoes = fodasse.nextInt();

    System.out.print("Informe o raio: ");
    double raio = fodasse.nextDouble();

    if (opcoes == 1) {
        double perimetro = 2 * Math.PI * raio;  
        System.out.printf("Perímetro: %.2f%n", perimetro); 
    } else if (opcoes == 2){
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Area circular: %.2f%n", area);    
    } else if (opcoes == 3){
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Volume: %.2f%n", volume);
    } else{
        System.out.println("e pra escolher 1, 2 ou 3 burro");
    }
fodasse.close();



    }
    
}
   

