import java.util.Scanner;

public class MediaAritmetica{
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite sua nota 1: ");
        int nota1 = prompt.nextInt();

        System.out.println("Digite sua nota 1: ");
        int nota2 = prompt.nextInt();

        System.out.println("Digite sua nota 1: ");
        int nota3 = prompt.nextInt();

        int media = (nota1 + nota2 + nota3)/3;

        System.out.println("A media e: " + media);

    }
    
}