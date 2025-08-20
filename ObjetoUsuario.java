package aula04;

public class ObjetoUsuario {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
	
		usuario1.setId(1);
		usuario1.setNome("Nayara");
		usuario1.setPassword(123);
		usuario1.setPermissao("Tem permissão");
		usuario1.setUsuario("@naynay");

		usuario2.setId(2);
		usuario2.setNome("Laura");
		usuario2.setPassword(231);
		usuario2.setPermissao("Não tem permissão");
		usuario2.setUsuario("@laulau");
		
		usuario1.exibirUsuario();
		usuario2.exibirUsuario();
		
		
	}

}
