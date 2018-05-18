package Item;

import entities.MoviePlaceEntity;

public class ItemMoviePlaceEntity {

	private MoviePlaceEntity p=new MoviePlaceEntity();

	public MoviePlaceEntity getP() {
		return p;
	}

	public void setP(MoviePlaceEntity p) {
		this.p = p;
	}

	public ItemMoviePlaceEntity(MoviePlaceEntity p) {
		super();
		this.p = p;
	}
	
}



