package Lista.q4;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		
		ArrayList<Funcionario> administrativo = new ArrayList();
		ArrayList<Funcionario> empressarial = new ArrayList();
		ArrayList<Funcionario> executivo = new ArrayList();
		ArrayList<Funcionario> todoFuncionarios = new ArrayList();
		
		Funcionario f1 = new Funcionario("asd", "asaddsa", TipoFuncionario.EXECUTIVO);	
		executivo.add(0, f1);
		todoFuncionarios.add(0, f1);
		Funcionario f2 = new Funcionario("qwqw", "12312", TipoFuncionario.EMPRESSARIAL);
		empressarial.add(0, f2);
		todoFuncionarios.add(1, f2);
		Funcionario f3 = new Funcionario("zxc", "0987", TipoFuncionario.ADIMINISTRATIVO);
		empressarial.add(0, f3);
		todoFuncionarios.add(2, f3);
		
	}
}
