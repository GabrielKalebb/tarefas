import java. util. Scanner;
public class q11{
    public static Scanner leia=new Scanner (System.in);
    public static void main(String args []){
        int valor1;
        int valor2;
        System.out.print("Digite o primeiro valor: ");
        valor1=leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2=leia.nextInt();
    if(valor1>valor2){
        System.out.print(valor1);
    }else{
        System.out.print(valor2);
    }
    }
}