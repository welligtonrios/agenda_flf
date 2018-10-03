package modelo;

import java.util.ArrayList;

public class Aluno {
	
	private String nome; 
	private long  cpf;
	private long matricula;
	private String endere�o;
	private String email;
	private long telefone;
	private boolean situacao;
	private String curso;

	
	//ArrayL para armazenar as disciplinas 
	
	String [] disciplinas = new String[6];
	
	 public String[] getDisciplinas() {
		return disciplinas;
	}


	
	
	//construtores
	
	public Aluno() {
		
	}

	public Aluno(String nome, long cpf, long matricula, String endere�o, String email, long telefone, boolean situacao,
			String curso, ArrayList<String> disciplinas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endere�o = endere�o;
		this.email = email;
		this.telefone = telefone;
		this.situacao = situacao;
		this.curso = curso;
	}
	
	
	// getters and setters

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

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public void mostraAluno() {
		
		System.out.println("nome : " + this.nome);
		System.out.println("cpf : " + this.cpf);
		System.out.println("matricula: " + this.matricula);
		System.out.println("Endere�o : " + this.endere�o);
		System.out.println("Email : " + this.email);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Situa��o : " + this.situacao);
		System.out.println("curso : " + this.curso);
		
		System.out.println("Disciplinas: \n");
		
		for (String disciplina : disciplinas) {
			System.out.println(disciplina);
			
			
		}
		
		
	}
	

	
	
	
	
	


	
	
	
	
	
}
