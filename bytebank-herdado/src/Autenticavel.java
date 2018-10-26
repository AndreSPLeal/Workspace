

//contrato Autenticavel
	//quem assinar esse contrato, precisa implementrar
		// metodo setSenha
		// metodo autentica
//dentro da interface n tem nada concreto 
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
