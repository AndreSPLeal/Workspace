package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Conta[5];
			
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		referencias[0] = cc1;
				
		ContaPoupanca cc2 = new ContaPoupanca(11, 22);
		
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGeneriaca = (Object) referencias[1];
//		
//		System.out.println(referenciaGeneriaca.getNumero());
		
		//Conta ref = contas[1];
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast, alterando a referencia
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		//Forma Literal - Usamos as chaves {} para indicar que se trata de um array e os valores já ficam declarados dentro das chaves.
		//int[] refs = {1,2,3,4,5};
				
				
//		ContaPoupanca[] cc = new ContaPoupanca[10];
//		ContaPoupanca cp1 = new ContaPoupanca(11,22);
//		ContaPoupanca cp2 = new ContaPoupanca(33,44);
//
//		cc[0] = cp1;
//		cc[4] = cp2;
//
//		System.out.println(cc[1].getNumero());
		

	}

}
