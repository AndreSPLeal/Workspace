
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no Sitema!");
		} else {
			System.out.println("N pode entrar no Sistema!");
		}
	}

}
