package lambda;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Roberto", 350));
		usuarios.add(new Usuario("Hugo", 200));
		usuarios.add(new Usuario("Kate", 120));
		usuarios.add(new Usuario("Beatriz", 320));		
		return usuarios;
	}
	public static List<Movie> getMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Avatar", 7, 2009, "Action"));
		movies.add(new Movie("Matrix", 9, 1999, "Sci-fi"));
		movies.add(new Movie("Terminator", 8, 1984, "Sci-fi"));
		movies.add(new Movie("Rock", 6, 1976, "Action"));
		movies.add(new Movie("Titanic", 4, 1997, "Drama"));
		movies.add(new Movie("Alien", 10, 1979, "Sci-fi" ));
		return movies;
	}
}
