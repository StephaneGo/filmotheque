package fr.eni.movielibrary.bll;

import java.util.List;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;

public interface MovieService {
	List<Movie> getAllMovies();

	Movie getMovieById(long id);

	List<Genre> getGenres();

	Genre getGenreById(long id);

	List<Participant> getParticipants();


}
