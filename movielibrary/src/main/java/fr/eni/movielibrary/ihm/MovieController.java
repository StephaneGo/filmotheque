package fr.eni.movielibrary.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;

@Controller
public class MovieController {
	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping({"", "/movies"})
	public String showAllMovies(Model model) {
		List<Movie> lstMovies = movieService.getAllMovies();
		model.addAttribute("movies", lstMovies);
		return "view-movies";
	}

	@GetMapping("/movies/detail")
	public String findMovie(@RequestParam(name = "id") long id, Model model) {
		Movie m = movieService.getMovieById(id);
		model.addAttribute("movie", m);
		return "view-movie-detail";
	}
	
}
