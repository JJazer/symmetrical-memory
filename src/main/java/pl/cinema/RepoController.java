package pl.cinema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.cinema.entity.FilmShow;
import pl.cinema.repository.FilmShowRepository;


@RestController
public class RepoController {

	@Autowired
	FilmShowRepository repo;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<FilmShow> FilmShows()
	
	{
		List<FilmShow> allShows = (List<FilmShow>) repo.findAll();
		return allShows;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void putShow(@RequestBody FilmShow filmShow)
	{
		repo.save(filmShow);
		
	}
	
}
