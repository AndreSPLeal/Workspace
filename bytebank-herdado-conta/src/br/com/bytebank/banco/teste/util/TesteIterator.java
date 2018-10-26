package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		Set<String> nomes1 = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it1 = nomes.iterator();

		while(it1.hasNext()) {
		  System.out.println(it1.next());
		}

	}

}
