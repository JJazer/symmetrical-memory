package pl.cinema.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FilmShow {

	@ManyToOne
	private CinemaHall cHall;
	@ManyToOne
	private Movie movie;
	@Id
	@GeneratedValue
	private long id;
	private LocalDateTime showTime;
	private String reservations;

	public CinemaHall getcHall() {
		return cHall;
	}

	public void setcHall(CinemaHall cHall) {
		this.cHall = cHall;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getReservations() {
		return reservations;
	}

	public void setReservations(String reservations) {
		this.reservations = reservations;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

}
