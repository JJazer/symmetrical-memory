package pl.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CinemaHall {
	@Id
	@GeneratedValue
		private long id;
	
	private int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}
