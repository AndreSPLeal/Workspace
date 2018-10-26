
public class TesteReferencias {
	public static void main(String[] args) {
		
		//primeiraConta n é uma conta é uma referência
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		
		//segundaConta conta pegando referencia da primeiraConta
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("Saldo da segunda conta " + segundaConta.saldo);
		//ao imprimir saldo da primeiraConta as duas referencias são pro mesmo objeto
		//so tem uma conta, um unico 'new'
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
		}
		
		//check a referencia mesmo objeto
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
