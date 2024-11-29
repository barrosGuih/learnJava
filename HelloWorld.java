import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.println("adicione o valor 1: ");
        int a = numero.nextInt();
        System.out.println("adicione o valor 2: ");
        int b = numero.nextInt();

        int soma = a + b;

        System.out.println("A soma e: " + soma);

        numero.close();
    }
    
}