package pl.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Movie {
	
@Id	
@GeneratedValue
private long id;
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String title;
	private String director;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

}
