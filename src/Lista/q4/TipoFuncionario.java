package Lista.q4;

public enum TipoFuncionario {
	
	EXECUTIVO(1500), ADIMINISTRATIVO(2000), EMPRESSARIAL(2500);
	
	private double salario;
	
	TipoFuncionario(double salario){
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	

}
