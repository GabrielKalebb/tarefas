import java. util. Scanner;
public class q8{
    public static Scanner leia=new Scanner (System.in);
    public static void main(String args []){
    int n;
    System.out.print("Digite um número: ");
    n=leia.nextInt();
    if (n>=10){
        System.out.print("O número é positivo: "+n);
    }else{
        System.out.print("O número é negativo: "+n);
    }
    }
}
