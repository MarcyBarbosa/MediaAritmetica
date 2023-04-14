import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
       
        double num1, num2, media;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Bem-vindo a media aritmetica");

        System.out.println("Digite um numero");
         num1 = scanner.nextDouble();

        System.out.println("Digite outro numero");
        num2 = scanner.nextDouble();

        media = (num1 + num2)/2;

        System.out.printf("A media aritmetica entre eles\n" + media);
    
        scanner.close();
    }
}    