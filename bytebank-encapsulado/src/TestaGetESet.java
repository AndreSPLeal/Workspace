
public class TestaGetESet {

	public static void main(String[] args) {
		
		//construtor 
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;  n compila pq o atributo é private
		//atravez do metodo
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		//alterando nome		
		conta.getTitular().setProfissao("programador");
		
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		

	}

}
