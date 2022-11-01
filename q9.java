import java. util. Scanner;
public class q9{
    public static Scanner leia= new Scanner (System.in);
    public static void main (String args []){
      float fruta;
      float pagamento;
      float custo;
      System.out.print("Digite o total de frutas compradas: ");
      fruta=leia.nextFloat();
    if (fruta>=12){
        System.out.print("O total que foi pago"+fruta*1);
    }else{
        System.out.print("O total que foi pago: "+fruta*1.3);
    }
    }
}
