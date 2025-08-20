package aula04;

public class ObjetoPoltrona {

	public static void main(String[] args) {
		
		Poltrona poltrona1 = new Poltrona();
		Poltrona poltrona2 = new Poltrona();
		
		poltrona1.setCor("Preta");
		poltrona1.setMaterial("Coro");
		poltrona1.setMobilidade("Possui rodas");

		poltrona2.setCor("Branca");
		poltrona2.setMaterial("Coro");
		poltrona2.setMobilidade("Não possui rodas");
		
		poltrona1.exibirPoltrona1();
		poltrona1.disponivel1();
		poltrona2.exibirPoltrona2();
		poltrona2.disponivel2();
		
	}

}
