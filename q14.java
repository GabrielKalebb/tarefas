import java.util.Scanner;
public class q14{
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args[]){
        int valor1,valor2,valor3,maior,maior2,resultado;

        System.out.print("Digite o primerio valor:");
        valor1=leia.nextInt();
        System.out.print("Digite o segundo valor:");
        valor2=leia.nextInt();
        System.out.print("Digite o terceiro valor:");
        valor3=leia.nextInt();
        
        if (valor1>valor2&valor1>valor3){
          maior=valor1;
          if (valor2>valor3){
            maior2=valor2;
            resultado=maior+maior2;
            System.out.println(resultado);
          }else{
            maior2=valor3;
            resultado=maior+maior2;
            System.out.println(resultado);
          }
        
        }else if (valor2>valor1&valor2>valor3){
          maior=valor2;
          if (valor1>valor3){
            maior2=valor1;
            resultado=maior+maior2;
            System.out.println(resultado);
          }else{
            maior2=valor3;
            resultado=maior+maior2;
            System.out.println(resultado);
          }
        
        }else if (valor3>valor1&valor3>valor2){
          maior=valor3;
          
          if (valor1>valor2){
            maior2=valor1;
            resultado=maior+maior2;
            System.out.println(resultado);
          }else{
            maior2=valor2;
            resultado=maior+maior2;
            System.out.println(resultado);
            }
}

        }
}


