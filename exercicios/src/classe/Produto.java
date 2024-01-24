package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(){
	}
	
	Produto(String nomeInicial, double precoIncinial){
		nome = nomeInicial;
		preco = precoIncinial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * ( 1 - desconto + descontoDoGerente);
	}
}
