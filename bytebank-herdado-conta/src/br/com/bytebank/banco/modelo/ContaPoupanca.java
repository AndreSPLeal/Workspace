package br.com.bytebank.banco.modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaPoupanca, " + super.toString();
	}

}
