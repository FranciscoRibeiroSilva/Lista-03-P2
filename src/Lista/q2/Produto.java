package Lista.q2;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPrecoCusto(double precoC) {
		this.precoCusto = precoC;
	}
	
	public double getPrecoCusto() {
		return this.precoCusto;
	}
	
	public void setPrecoVenda(double precoV) {
		this.precoVenda = precoV;
	}
	
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setMargemLucro(double margemL) {
		this.margemLucro = margemL;
	}
	
	public double getMargemLucro() {
		this.margemLucro = getCalcularMargemLucro();
		return this.margemLucro;
	}
	
	public double getCalcularMargemLucro() {
		double margem = (getPrecoVenda() - getPrecoCusto());
		return margem;
	}
	
	public String getMargemLucroPorcentagem() {
		return "Margem de lucro percentual: "+(getPrecoCusto()/100)*getMargemLucro()+"%";
	}
}
