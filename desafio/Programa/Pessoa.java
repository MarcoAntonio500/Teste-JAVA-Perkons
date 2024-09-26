package Programa;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public Pessoa() {
	}

	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Integer getPrice() {
		return idade;
	}

	public void setPrice(Integer idade) {
		this.idade = idade;
	}

	public String getQuantity() {
		return cpf;
	}

	public void setQuantity(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [Nome = " + nome + ", Idade = " + idade + ", CPF = " + cpf + "]";
	}
}
