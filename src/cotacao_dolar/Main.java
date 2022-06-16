package cotacao_dolar;

import java.util.Locale;
import java.util.Scanner;

import conversao_dolar.Conversor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conversor conv = new Conversor();
		
		System.out.print("Qual o valor do Dolar: ");
		conv.dolar = sc.nextDouble();
		System.out.print("Quantos Dolares você quer comprar: ");
		conv.qtdDolar = sc.nextDouble();
		
		System.out.printf("Você vai pargar %.2f",conv.somaReais());
		
		
		sc.close();

	}

}
