package Lista.q1;

public class UsarPessoa {
	
	public static void main(String args []) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Francisco");
		pessoa.setIdade(20);
		pessoa.setAltura(1.71);
		pessoa.setPeso(70);
		
		System.out.println(pessoa.dadosPessoais());
	}
	
	
	
}
