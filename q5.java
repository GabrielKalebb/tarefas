import java.util.Scanner;
public class q5{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int salario;
        int reajuste;
        int sf;
        int resultado;
       System.out.print("Digite o seu salário:");
       salario=leia.nextInt();
       System.out.print("Digite o reajuste do seu salário:");
       reajuste=leia.nextInt();
       sf=(salario*reajuste)/100;
       System.out.println(sf);
       resultado=salario+sf;
       System.out.print("O seu salário atual é de:"+resultado);
}
}
