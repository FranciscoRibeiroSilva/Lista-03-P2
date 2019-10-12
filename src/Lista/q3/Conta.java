package Lista.q3;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta (String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("Invalido");
		}
		else {
			setSaldo(valor);
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		if (getSaldo() >= valor) {
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String imprimeNome() {
		return"Nome: "+getNome()+"\nSaldo: "+getSaldo();
	}
}
