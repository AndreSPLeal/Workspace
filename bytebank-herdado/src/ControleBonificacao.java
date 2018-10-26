
public class ControleBonificacao {

	private double soma;
	
	// polimorfismo somente um método generico, funciona p gerente e editor de video
	// os dois são funcionarios
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
