//n pode mais instanciar dessa classe, pq é abstrata. na classe n pode dar new
public abstract class Funcionario {
		
	
	private String nome;
	private String cpf;
	private double salario;
	
	//construtor
	//public Funcionario() {		
	//}
	
	//bonificação padrão, metodo sem corpo, n há implementação.
	public abstract double getBonificacao();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
