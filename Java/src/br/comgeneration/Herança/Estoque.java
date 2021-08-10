package br.comgeneration.Herança;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
public static void main(String args[]) {
		
		Collection<String> estoque = new ArrayList<String>();
		estoque.add("Copo");
		estoque.add("Vazo");
		estoque.add("Garfo");
		estoque.add("Faca");
		
		System.out.println("Lista inicial de produtos no estoque: " + estoque);
		
		estoque.remove("Copo");
		
		System.out.println("Lista de produtos no estoque após remoção de um item: " + estoque);
		
	    estoque.add("Produto de limpeza");
	     
	    System.out.println("Lista atualizada de produtos no estoque: " + estoque);
	}	
}