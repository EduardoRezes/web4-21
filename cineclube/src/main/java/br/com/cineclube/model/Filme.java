package br.com.cineclube.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDate release;
	private Category category;
	private BigDecimal score;
	private String title;
	
	public Filme() {}
	
	public Filme(String title, LocalDate release, Category cat,
			BigDecimal score) {
		this.title = title;
		this.release = release;
		this.category = cat;
		this.score = score;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getRelease() {
		return release;
	}
	public void setRelease(LocalDate release) {
		this.release = release;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}