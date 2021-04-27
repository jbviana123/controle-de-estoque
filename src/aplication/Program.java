package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Ente com o produto :");
		System.out.print("Name :");
		String name = sc.nextLine();
		System.out.print("Preço :");
		Double preco = sc.nextDouble();
		System.out.print("Estoque :");
		int quantidade= sc.nextInt();
		
		Produto produto = new Produto(name, preco, quantidade);

		System.out.println();
		System.out.println("Dados do produto" + produto);

		System.out.println();
		System.out.println("Entre com a quantidade a ser adicionada: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados :" + produto);
		System.out.println();
		System.out.println("Entre com a quantidade retirada :");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println("Dados atualizados :" + produto);

		sc.close();
	}

}
