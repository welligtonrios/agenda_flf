package teste;

import java.util.Scanner;

import modelo.Contato;
import service.ContatoService;



public class Menu {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("*************A genda de contatos 2018************ \n ");
		
		
		ContatoService contatoService = new ContatoService();
		
		
	    
		
		int ops=-1;
		
		
		
		while(ops!=0) {
			
			//menu
			
			System.out.println("Escolha uma opção \n ");
			System.out.println("Digite 1 para adicionar um contato");
			System.out.println("Digite 2 para remover um contato");
			System.out.println("Digite 3 para configurar um contato");
			System.out.println("Digite 4 para buscar um contato");
			System.out.println("Digite 5 para listar  contatos ");
			System.out.println("Digite 0  um contato");
			
			ops = teclado.nextInt();
			
			switch (ops) {
			case 1:
				    System.out.println("digite o nome ");
				    String nome = teclado.next();
				    System.out.println("digite o numero ");
				    long tel = teclado.nextInt();
				    contatoService.addContato(nome, tel);
				    
				break;
				
			case 2:
		
				System.out.println("digite o nome ");
			     nome = teclado.next();
			    contatoService.deleteContato(nome);
			break;
			
			case 3:
				
				   System.out.println("digite o nome do contato");
				   Contato obj = contatoService.buscaContato(teclado.next());
				   
				   System.out.println("digite o novo nome do contato");
			       contatoService.configContato(obj, teclado.next());
			       
			       System.out.println("Digite o telefone novo do contato:\n");
				contatoService.configContato(obj, teclado.nextLong());
				
				      obj.mostreContato();
				   
				   break;
				   
			case 4: 
				
				System.out.println("digite o nome do contato pata buscalo :");
				   // nome = teclado.next();
				    contatoService.buscaContato(teclado.next());
				   
			case 5 : 
				
				contatoService.listarContato();
				break;
			
			default:
				break;
			}
			
			
			}
			
			
		     System.out.println("encerrando...");
		     teclado.close();
		
		
		
		
		
		
		
		

	}

}
