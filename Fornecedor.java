package aula04;

public class Fornecedor {

	int id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereco;
	String fone;
	String email;
	String inscricaoEstadual;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public void exibirFornecedor() {
		
		System.out.println("");
		System.out.println("O ID é: " + id);
		System.out.println("A Razão Social é: " + razaoSocial);
		System.out.println("O nome fantasia é: " + nomeFantasia);
		System.out.println("O cnpj é: " + cnpj);
		System.out.println("O enderço é: " + endereco);
		System.out.println("O telefone é: " + fone);
		System.out.println("O email é: " + email);
		System.out.println("A inscrição estadual é: " + inscricaoEstadual);
	}

		public void aberto() {
		System.out.println("Está aberto");
	}
}
