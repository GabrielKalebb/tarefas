import java.util.Scanner;
public class q6{
	public static Scanner leia=new Scanner (System.in);
	public static void main (String args[]){
	float nota1;
	float nota2;
	float nota3;
	float media;
	System.out.print("Digite a primeria nota do aluno: ");
	nota1=leia.nextFloat();
	System.out.print("Digite a segunda nota do aluno: ");
	nota2=leia.nextFloat();
	System.out.print("Digite a terceira nota do aluno: ");
	nota3=leia.nextFloat();
	media=((nota1*2)+(nota2*3)+(nota3*5))/10;
	System.out.print("A média do aluno é:"+media);
	}
}

