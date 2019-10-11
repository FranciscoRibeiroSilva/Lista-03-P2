package Lista.q1;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double calcularIMC() {
		return this.peso/(this.altura * this.altura);
	}
	
	public String dadosPessoais() {
		return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nAltura: "+getAltura()+"\nPeso: "+getPeso()+"\nIMC: "+calcularIMC();
	}
}
