import java.util.Scanner;
public class questao3{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args[]){
        int n;
        int antecessor;
        int sucessor;
        System.out.print("Digite um número: ");
        n=leia.nextInt();
        antecessor=(n-1);
        System.out.println("o antecessor é:"+antecessor);
        sucessor=(n+1);
        System.out.println("o sucessor é:"+sucessor);
    }
}
