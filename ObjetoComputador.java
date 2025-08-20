package aula04;

public class ObjetoComputador {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		
computador1.setMarca("Dell");
computador1.setNome("Dell 24 All-in-One");
computador1.setAcessorios("Teclados, mouse");
computador1.setCor("Branco");
computador1.setMemoria(16);

computador2.setMarca("Dell");
computador2.setNome("Notebook Gamer G15");
computador2.setAcessorios("Nenhum");
computador2.setCor("Cinza");
computador2.setMemoria(16);

computador1.exibirComputador();
computador1.comp1ligado();
computador2.exibirComputador();
computador2.comp2ligado();
	}

}
