import java.util.Scanner;
public class q16{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args[]){
       int anos,horas,dh,dinheiro;
        System.out.print("Digite quantos anos você trabalhou nessa empresa:");
        anos=leia.nextInt();
        System.out.print("Digite quantas horas você trabalhou:");
        horas=leia.nextInt();
        System.out.print("Digite quanto você recebe por hora:");
        dh=leia.nextInt();
        dinheiro=dh*horas;
        if (anos<=1){
            System.out.print("O salário final é:"+(1500+dinheiro));
        }else if ((anos>1)&&(anos<3)){
            System.out.print("O salário final é:"+(2000+dinheiro));
        }else{
            System.out.print("O salário final é:"+(3000+dinheiro));
        }
    }
}
