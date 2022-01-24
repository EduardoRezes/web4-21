package lambda;

public class Movie {
	private static Integer nextId = 1;
	private Integer id;
	private Integer score;
	private String title;
	private Integer year;
	private String type;

	public Movie(String title, Integer score, Integer year, String type) {
		this.id = nextId++;
		this.title = title;
		this.score = score;
		this.year = year;
		this.type = type;
	}
	@Override
	public String toString() {
		return this.title + " | " + this.score + " | " + this.year + " | " + this.type;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
}