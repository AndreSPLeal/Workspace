
public class CriaConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("Primeira conta " + primeiraConta.saldo);
		System.out.println("Segunda conta " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;

		System.out.println("segunda conta agora está na agencia = " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		// check a referencia de dois objetos
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
