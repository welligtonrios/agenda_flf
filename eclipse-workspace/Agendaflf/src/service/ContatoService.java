package service;

import java.util.ArrayList;

import modelo.Contato;

public class ContatoService {

	//atributos
	
	ArrayList<Contato> listaContato = new ArrayList<Contato>();
	
	
	public ArrayList<Contato>getListContato(){
	  return this.listaContato; 
		
	}
	
	//CRUD
	
	
	//Criar contato
	
	public void addContato(String nome, long tel) {
		Contato c = new Contato(nome, tel);
		listaContato.add(c);
	}
	   
	//pesquisar
	
	 public Contato buscaContato(String nome) {
		 for (Contato contato : listaContato) {
			if (contato.getNome().equals(nome) ) {
				return contato ; 
			}
		}
		 System.out.println("contato nao encontrado...");
		 return null;
	 }
	 
	 // Atualizar contato
	 
	 public void configContato (Contato obj,String nome ) {
		 obj.setNome(nome);
	 }
	 public void configContato (Contato obj, long tel ) {
		 obj.setTel(tel);
	 }
	 public void configContato (Contato obj,String nome, long tel) {
		 obj.setNome(nome);
		 obj.setTel(tel);
	 }
	 // deletar contato
	 
	 public void deleteContato(String nome) {
		 listaContato.remove(buscaContato(nome));
	 }
	 
	 //Lista Contato
	 
	 public void listarContato() {
		 
		 for (Contato contato : listaContato) {
			contato.mostreContato();
		}
	 }
	
}
