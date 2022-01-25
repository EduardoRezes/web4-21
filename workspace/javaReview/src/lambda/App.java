package lambda;

public class App {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		
		if (a == b) System.out.println("eh igual a==b ");
		
		Usuario user = new Usuario("Julia", 2000);
		Usuario user2 = new Usuario("Julia", 2000);

		if (user.getNome() == user2.getNome()) System.out.println("eh igual user==user2");
		
	}

}
