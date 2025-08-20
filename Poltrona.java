package aula04;

public class Poltrona {

	String cor;
	String material;
	String mobilidade;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMobilidade() {
		return mobilidade;
	}
	public void setMobilidade(String mobilidade) {
		this.mobilidade = mobilidade;
	}
	
	public void disponivel1() {
		System.out.println("Está disponivel");
	}
	
	public void disponivel2() {
		System.out.println("Não está disponivel");
	}
	
	public void exibirPoltrona1() {
		System.out.println("A cor da poltrona é: " + cor);
		System.out.println("O material da poltrona é: " + material);
		System.out.println("A mobilidade da poltrona é: " + mobilidade);
	}
	
	public void exibirPoltrona2() {
		System.out.println("");
		System.out.println("A cor da poltrona é: " + cor);
		System.out.println("O material da poltrona é: " + material);
		System.out.println("A mobilidade da poltrona é: " + mobilidade);
	}
	
	}
	

