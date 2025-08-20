package aula04;

public class ObjetoConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.setId(1);
		conta1.setTipo("Corrente");
        conta1.setSaldo(2000);
        
        conta2.setId(1);
        conta2.setTipo("Corrente");
        conta2.setSaldo(2000);
        
        conta1.sacar(100);
        conta2.depositar(100);
        
        conta1.exibirConta1();
        conta2.exibirConta2();
        

	}

}
