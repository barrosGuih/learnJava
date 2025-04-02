import java.util.Scanner;

public class mediaPonderada{
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite nota1:");
        int nota1 = prompt.nextInt();
        System.out.println("Digite nota2:");
        int nota2 = prompt.nextInt();

        nota1 = nota1 * 5;
        nota2 = nota2 * 5;


        int media = (nota1+nota2 ) / 10;

        System.out.println("A média é " + media);
    }
}