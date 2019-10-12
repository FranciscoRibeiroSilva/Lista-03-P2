package Lista.q4;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	TipoFuncionario tipoFuncionario;
	
	public Funcionario (String nome, String cpf, TipoFuncionario tipoFuncionario) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoFuncionario = tipoFuncionario;
		this.salario = tipoFuncionario.getSalario();
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public TipoFuncionario getTipo () {
		return this.tipoFuncionario;
	}
}
