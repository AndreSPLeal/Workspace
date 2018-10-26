package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "   Alura   ";
		String outroVazio = vazio.trim();
				
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
				
		String nome = "Alura";// object literal
		//String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//concatena strings otimizado
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
				
				
		String nvnome = "novoALURA";
		CharSequence cs = new StringBuilder("al");
		//...
		
		nvnome = nvnome.replace("AL", cs);

		System.out.println(nvnome);
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
				
//		char c = 'A';
//		char d = 'a';
//		//classe string = imutabilidade - precisa criar outro objeto
//		String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
