package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import model.Endereco;
import model.Pessoa;

public class TestePessoa {
	
	
	@Test
	public void testarEndereco() {
		
		//Fixture ou instanciar e inicializar os atributos
		String nome = "Maria";
		String rua = "Rua Floriano Peixoto";
		String numero = "1500";
		String bairro = "Dinamérica";
		int idade = 25;
		
		//Criando um objeto
		Endereco endereco1 = new Endereco(rua, numero, bairro);
		Pessoa pessoa1 = new Pessoa(nome, endereco1, idade);
		
		System.out.println("Nome = "+pessoa1.getNome());
		System.out.println("Rua = "+pessoa1.getEndereco().getRua());
		System.out.println("Numero = "+pessoa1.getEndereco().getNumero());
		System.out.println("Bairro = "+pessoa1.getEndereco().getBairro());
		System.out.println("Idade = "+pessoa1.getIdade());
		
		//Testes de unidade
		assertEquals(pessoa1.getEndereco().getRua(),"Rua Floriano Peixoto");
		assertEquals(pessoa1.getEndereco().getNumero(),"1500");
	}

}
