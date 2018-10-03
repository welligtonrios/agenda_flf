package modelo;

public class Professor {
	
	private String nome; 
	private long  cpf;
	private String email;
	private long telefone;
	private String enderešo;
	private String categoria;
	private String disciplinas;
	
	
	//construtores 
	
	
	public Professor() {
		
	}


	public Professor(String nome, long cpf, String email, long telefone, String enderešo, String categoria,
			String disciplinas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.enderešo = enderešo;
		this.categoria = categoria;
		this.disciplinas = disciplinas;
	}

	// getters e setters 
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	public String getEnderešo() {
		return enderešo;
	}


	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void mostraProfessor() {
		
		System.out.println("nome : " + this.nome);
		System.out.println("cpf : " + this.cpf);
		System.out.println("Enderešo : " + this.enderešo);
		System.out.println("Email : " + this.email);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Disciplinas: \n");
		
		
		
	}
	
	
	
	

}
