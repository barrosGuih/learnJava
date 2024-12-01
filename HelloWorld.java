import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);

        System.out.println("adicione a nota 1: ");
        int nota1 = numero.nextInt();
        System.out.println("adicione a nota 2: ");
        int nota2 = numero.nextInt();
        System.out.println("adicione a nota 3: ");
        int nota3 = numero.nextInt();

        int media = ((nota1 + nota2 + nota3)/3);

        System.out.println("A media e: " + media);

        numero.close();
    }
    
}