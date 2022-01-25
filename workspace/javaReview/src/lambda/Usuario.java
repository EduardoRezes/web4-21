package lambda;

class CarrinhoDeCompra{
}
class Produto{
}
class Endereco{
}

@Author(name="Felippe") // metadado
public class Usuario implements Comparable<Usuario> {
	
	class Autenticar{}
	
	private static Integer nextId = 1;
	private Integer id;
	
	@Validation(min=5)
	private String nome;
	private Integer pontos;
	private boolean moderador;

	public Usuario(String nome, Integer pontos) {
		this.id = nextId++;
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	@Override
	public int compareTo(Usuario outro) {
		return this.nome.compareTo(outro.getNome());
	}
	
	@Override
	public String toString() {
		return "Usuario: "+id+" | " + nome + " | " + pontos;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	public boolean isModerador() {
		return moderador;
	}
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	
}
