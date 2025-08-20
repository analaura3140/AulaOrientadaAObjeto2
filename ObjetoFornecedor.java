package aula04;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setId(1);
		fornecedor1.setRazaoSocial("Serviço Nacional de Aprendizagem Industrial");
		fornecedor1.setNomeFantasia("SENAI");
		fornecedor1.setCnpj("03.774.819/0001-02");
		fornecedor1.setEndereco("Praça Roberto Mange, R. Santa Rosália, 30, Sorocaba - SP, 18090-110");
		fornecedor1.setFone("(15) 3212-7400");
		fornecedor1.setEmail("Privado");
		fornecedor1.setInscricaoEstadual("Privado");

		fornecedor1.exibirFornecedor();
		fornecedor1.aberto();
	}

}

