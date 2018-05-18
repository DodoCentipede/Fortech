package Item;

import entities.MovieTicket;

public class ItemMovieTicket {

	private MovieTicket p=new MovieTicket();

	public MovieTicket getP() {
		return p;
	}

	public void setP(MovieTicket p) {
		this.p = p;
	}

	public ItemMovieTicket(MovieTicket p) {
		super();
		this.p = p;
	}
}
