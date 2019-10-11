package Lista.q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe nome do produto:\n");
		produto.setNome(sc.next());
		System.out.println("Informe o custo do produto:\n");
		produto.setPrecoCusto(sc.nextDouble());
		System.out.println("Informe o valor de revenda do produto:\n");
		produto.setPrecoVenda(sc.nextDouble());
		System.out.println("Margem de lucro: "+produto.getMargemLucro());
		System.out.println(produto.getMargemLucroPorcentagem());
		
	}

}
