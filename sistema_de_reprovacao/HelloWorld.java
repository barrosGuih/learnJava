import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite sua nota final");
        int aluno = prompt.nextInt();

        if(aluno >= 7){
            System.out.println("Aluno Aprovado");
        }
        else{
            if(aluno >= 5 & aluno < 7){
                System.out.println("Em progressao");
            }
            else{
                System.out.println("Aluno Reprovado");
            }
        }
    }
    
}