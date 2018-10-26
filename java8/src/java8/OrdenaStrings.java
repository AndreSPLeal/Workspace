package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Dev Java");
		palavras.add("Caribe Center");
		palavras.add("My House");

		// Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);
		
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});
		
		//lambda *****
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);//exercicio
		
		System.out.println(palavras);
		
		//***********************
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);
		
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}

		// 1 foreach lambda
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//		};

		// 2
//		palavras.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//		});

		// 3
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//						
//		});

		// 4 Lambda *****
		palavras.forEach(s -> System.out.println(s));
	}

}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//
//}
