package fr.eni.movielibrary.bo;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;

	private Participant director;
	private List<Participant> actors;

	private Genre genre;

	public Movie() {
		actors = new ArrayList<>();
	}

	public Movie(long id, String title, int year, int duration, String synopsis) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
	}

	public Movie(long id, String title, int year, int duration, String synopsis, Participant director, Genre genre) {
		this();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.director = director;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Participant getDirector() {
		return director;
	}

	public void setDirector(Participant director) {
		this.director = director;
	}

	public List<Participant> getActors() {
		if (actors == null) {
			actors = new ArrayList<>();
		}
		return actors;
	}

	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [id=");
		builder.append(id);
		builder.append("]\ntitle:");
		builder.append(title);
		builder.append("[year:");
		builder.append(year);
		builder.append(", duration:");
		builder.append(duration);
		builder.append("]\n\tSynopsis:");
		builder.append(synopsis);
		builder.append("\n\tDirector:");
		builder.append(director);
		builder.append("\n\tActors:");
		builder.append(actors);
		builder.append("\n\tGenre:");
		builder.append(genre);
		return builder.toString();
	}

}
