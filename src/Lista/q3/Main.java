package Lista.q3;

public class Main {
	
	public static void main (String args[]) {
		
		Conta cont1 = new Conta ("Francisco", 1234, 100);
		Conta cont2 = new Conta ("Majibuu", 5678, 4000);
		
		cont1.sacar(2500);
		cont1.deposita(300);
		
		cont2.sacar(1000);
			
		System.out.println("Saldo conta 1: "+cont1.getSaldo()+"\nSaldo Conta 2: "+cont2.getSaldo());
		
		cont2.transfere(cont1, 2000);
		
		cont1.transfere(cont2, 2500);
		
		System.out.println("Conta 1: "+cont1.imprimeNome());
		System.out.println("Conta 2: "+cont2.imprimeNome());
		
		cont1.setNome("Francisco Lima");
		
		System.out.println("Conta 1: "+cont1.imprimeNome());
	}

}
