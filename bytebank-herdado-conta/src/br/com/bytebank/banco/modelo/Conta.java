package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 *Classe representa a moldura de uma conta. 
 * @author André Spiuca
 * @version 0.1
 *
 */


public abstract class Conta extends Object implements Comparable<Conta>,Serializable {
	
	// a classe contem 4 atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	
	//static atribui 'total' a classe
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */
	
	//construtor	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("(vem da classe)Total de conta é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("(vem da classe)estou criando uma conta " + this.numero);
	}
	
	

	// criando metodo
	public abstract void deposita(double valor);
	
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */	
	public void saca(double valor) throws SaldoInsuficienteException{
		
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); 
		destino.deposita(valor);
			
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//ou novoNumero
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("n pode negativo");
			return;
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia<= 0) {
			System.out.println("n pode numewro negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	//atributo static n usa .this ...metodo da class
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
	
	

}



















