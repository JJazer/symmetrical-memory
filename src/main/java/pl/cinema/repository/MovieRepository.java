package pl.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.cinema.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
