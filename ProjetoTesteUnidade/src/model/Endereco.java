package model;

public class Endereco {
	
	//atributos
	String rua;
	String numero;
	String bairro;
	
	//Construtor
	public Endereco(String novaRua, String novoNumero, String novoBairro) {
		this.rua = novaRua;
		this.numero = novoNumero;
		this.bairro = novoBairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

}
