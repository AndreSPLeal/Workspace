
public class TesteConexao {

	public static void main(String[] args) {

		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu error na conexão");
		}
		
		
		
		// --------------------------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu error na conexão");
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//				con.close();
//			}
//		}
	}

}
