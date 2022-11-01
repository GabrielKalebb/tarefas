import java.util.Scanner;
public class q4{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args []){
        float base;
        float altura;
        float area;
        System.out.print("Digite a base: ");
        base=leia.nextFloat();
        System.out.print("Digite a altura: ");
        altura=leia.nextFloat();
        area=(base*altura);
        System.out.print("O valor da área é: "+area);
    }
}


