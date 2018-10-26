public class Conta {
	// a classe contem 4 atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//static atribui 'total' a classe
	private static int total;
	
	//construtor
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("(vem da classe)Total de conta é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("(vem da classe)estou criando uma conta " + this.numero);
	}
	
	

	// criando metodo
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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
	
	

}



















