package pl.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.cinema.entity.FilmShow;

@Repository
public interface FilmShowRepository extends CrudRepository<FilmShow, Long> {

}
