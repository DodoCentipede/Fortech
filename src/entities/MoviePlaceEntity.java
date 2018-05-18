package entities;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name ="movieplace", schema="forlastproject")
public class MoviePlaceEntity {
	
	private int idMoviePlace;
	private MovieEntity idMovie;
	private String timeMoviePlace;
	private String screenMoviePlace;
	
	@Id
	@Column(name="idMoviePlace")
	public int getIdMoviePlace() {
		return idMoviePlace;
	}
	public void setIdMoviePlace(int idMoviePlace) {
		this.idMoviePlace = idMoviePlace;
	}
	
	
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="idMovie")
	public MovieEntity getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(MovieEntity idMovie) {
		this.idMovie = idMovie;
	}
	
	
	@Basic
	@Column(name="timeMoviePlace")
	public String getTimeMoviePlace() {
		return timeMoviePlace;
	}
	public void setTimeMoviePlace(String timeMoviePlace) {
		this.timeMoviePlace = timeMoviePlace;
	}
	
	@Basic
	@Column(name="screenMoviePlace")
	public String getScreenMoviePlace() {
		return screenMoviePlace;
	}
	public void setScreenMoviePlace(String screenMoviePlace) {
		this.screenMoviePlace = screenMoviePlace;
	}

}
