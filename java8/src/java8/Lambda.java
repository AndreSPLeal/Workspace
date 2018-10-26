package java8;

public class Lambda {

	
	public static void main(String[] args) {
		
		
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		
		
//		new Thread(new Runnable() {
//
//		    @Override
//		    public void run() {
//		        System.out.println("Executando um Runnable");
//		    }
//
//		}).start();
	}
}
