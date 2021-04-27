package entities;

public class Produto {
	
	public String name;
	public double preco;
	public int quantidade;
	
	public Produto(String name, double preco, int quantidade ){
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double totalValueStoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade +=quantidade;
	}
	
	public void removeProduto(int quantidade) { 
		this.quantidade -=quantidade;
	}

	@Override
	public String toString() {
		return "Produto name=" + name + ","
				+ " preco=" + preco + ", quantidade=" + quantidade + ","
				
				+ " valor total ="
				+ totalValueStoque()  ;
	}

	
	
	
	 
	
	 




}
