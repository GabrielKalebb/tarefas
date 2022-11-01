import java.util.Scanner;
public class q10{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args []){
        float nota1;
        float nota2;
        float media;
    System.out.print("Digite a primeira nota: ");
    nota1=leia.nextFloat();
    System.out.print("Digite a segunda nota: ");
    nota2=leia.nextFloat();
    System.out.print((nota1+nota2)/2);
    media=leia.nextFloat();
        if(media>=6){
            System.out.print("O aluno está aprovado: "+media);
        }else{
            System.out.print("O aluno está reprovado: "+media);
        }
        }
    }
    

