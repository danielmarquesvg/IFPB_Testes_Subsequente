package model;

public class Pessoa {
	
	//atributos ou caracteristicas
	String nome;
	Endereco endereco;
	int idade;
	
	//Construtor
	public Pessoa (String novoNome, Endereco novoEndereco, int novaIdade) {
		this.nome = novoNome;
		this.endereco = novoEndereco;
		this.idade = novaIdade;
	}

	
	//metodos ou funcoes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}
