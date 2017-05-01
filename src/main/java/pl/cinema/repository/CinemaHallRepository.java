package pl.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.cinema.entity.CinemaHall;

@Repository
public interface CinemaHallRepository extends CrudRepository<CinemaHall, Long> {

}
