package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		//alto nivel
		//PrintStream ps = new PrintStream(new File("lorem2.txt")); //new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.print("sadasdasdasdasdasdasdasdasd");
				
		ps.close();
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//
//        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        fw.write(System.lineSeparator());
//        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//
//        fw.close();
		
		
		
	}

}
