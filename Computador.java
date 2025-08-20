package aula04;

public class Computador {

	String marca;
	String nome;
	String acessorios;
	String cor;
	int memoria;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public void exibirComputador() {
		
		System.out.println("");
		System.out.println("A marca é: " + marca);
		System.out.println("O nome é: " + nome);
		System.out.println("Os acessórios inclusos são: " + acessorios);
		System.out.println("A cor é: " + cor);
		System.out.println("A memória é: " + memoria + " GB");
	}
	
	public void comp1ligado() {
		System.out.println("O computador está ligado");
}
	
	public void comp2ligado() {
		System.out.println("O computador está desligado");
}

}
