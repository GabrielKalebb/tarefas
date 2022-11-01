import java.util.Scanner;
public class q15{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args[]){
        int valorA;
        int valorB;
        int valorC;
        System.out.print("Digite o primerio lado:");
        valorA=leia.nextInt();
        System.out.print("Digite o segundo lado:");
        valorB=leia.nextInt();
        System.out.print("Digite o terceiro lado:");
        valorC=leia.nextInt();
    if(valorA>(valorB+valorC)){
     System.out.print("Não é um triângulo");
    }else if(valorB>(valorA+valorC)){
        System.out.print("Não é um triângulo");
    }else if(valorC>(valorA+valorB)){
        System.out.print("Não é um triângulo");
    }else{
        System.out.print("É um triângulo");
    }
    }
}