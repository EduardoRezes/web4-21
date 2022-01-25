package lambda;

import java.util.List;

public class AppLambda {

	public static void main(String[] args) {
		
		List<Movie> movies = Database.getMovies();
		
		for (Movie m: movies) {
			System.out.println(m);
		}
		
		movies.forEach(
			(Movie m) -> {
				System.out.println(m.getTitle());
			}
		);
		
		movies.forEach(
			m -> System.out.println(m.getTitle())
		);
		
		movies.forEach(System.out::println);
		
		// lambda == função/metodo(java)
		System.out.println("\n=============================");
		movies.stream()
			.filter(m -> m.getScore() >= 10)
			.forEach(System.out::println);
		
		// .removeIf( condicao > X)
		
	}
	public void printMovieTitle(Movie m) {
		System.out.println(m.getTitle());
	}

}
