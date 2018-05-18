package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name= "movie", schema= "forlastproject")
public class MovieEntity {
	
	
	private int idMovie;
	private String nameMovie;
	private String tipeMovie;
	private String distributieMovie;
	private String regizorMovie;
	private String dateMovie;
	private String languageMovie;
	private String classificationMovie;
	
	//private List<MoviePlaceEntity> moviePlace=new ArrayList<MoviePlaceEntity>();
	
	@Id
	@Column(name="idMovie")
	public int getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}
	/*
	@OneToMany(cascade=CascadeType.ALL, mappedBy="idMovie", fetch=FetchType.EAGER)
	public List<MoviePlaceEntity> getMoviePlace() {
		return moviePlace;
	}
	public void setMoviePlace(List<MoviePlaceEntity> moviePlace) {
		this.moviePlace = moviePlace;
	}
	*/
	
	@Basic
	@Column(name="nameMovie")
	public String getNameMovie() {
		return nameMovie;
	}
	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}
	
	@Basic
	@Column(name="tipeMovie")
	public String getTipeMovie() {
		return tipeMovie;
	}
	public void setTipeMovie(String tipeMovie) {
		this.tipeMovie = tipeMovie;
	}
	
	@Basic
	@Column(name="distributieMovie")
	public String getDistributieMovie() {
		return distributieMovie;
	}
	public void setDistributieMovie(String distributieMovie) {
		this.distributieMovie = distributieMovie;
	}
	
	@Basic
	@Column(name="regizorMovie")
	public String getRegizorMovie() {
		return regizorMovie;
	}
	public void setRegizorMovie(String regizorMovie) {
		this.regizorMovie = regizorMovie;
	}
	
	@Basic
	@Column(name="dateMovie")
	public String getDateMovie() {
		return dateMovie;
	}
	public void setDateMovie(String dateMovie) {
		this.dateMovie = dateMovie;
	}
	
	@Basic
	@Column(name="languageMovie")
	public String getLanguageMovie() {
		return languageMovie;
	}
	public void setLanguageMovie(String languageMovie) {
		this.languageMovie = languageMovie;
	}
	
	@Basic
	@Column(name="classificationMovie")
	public String getClassificationMovie() {
		return classificationMovie;
	}
	public void setClassificationMovie(String classificationMovie) {
		this.classificationMovie = classificationMovie;
	}
	
}
