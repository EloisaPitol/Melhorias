package br.com.maria.scanner;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class FuncaoScanner {

	public static void main(String[] args) {
		
	  Scanner texto = new Scanner(System.in);
	  System.out.println("Escolha uma opção abaixo e digite seu numero: ");
	  System.out.println("1 -> Cadastar");
	  System.out.println("2 -> Atualizar");
	  System.out.println("3 -> Excluir");
	  
	  int opcoes = texto.nextInt();
	  
	  if (opcoes == 1) {
		EntityManager cadastar; 
		  System.out.println("Voce cadastrou produtos");
	     } else if (opcoes == 2) {
			EntityManager atualizar;  
	            System.out.println("Voce atualizou um produto");
	        } else {
	            System.out.println("Voce excluiu um produto");
	        }
	    }

}
	  


	   
