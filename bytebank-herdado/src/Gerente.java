

//gerente é um funcionario, gerente herda da classe funcionario, assina o contrato autenticavel, é um autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	//bonificação padrão
	public double getBonificacao() {
		System.out.println("Bonificação do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}	


