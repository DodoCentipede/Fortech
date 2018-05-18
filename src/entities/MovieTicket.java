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
@Table(name="movieticket", schema= "forlastproject")
public class MovieTicket {

		private int idUser;
		private MoviePlaceEntity idMoviePlace;
		private String  seatNumber;
		private String tipeTicket;
		
		@Id
		@Column(name="idUser")
		public int getIdUser() {
			return idUser;
		}
		public void setIdUser(int idUser) {
			this.idUser = idUser;
		}
		
		@ManyToOne(cascade =CascadeType.ALL)
		@JoinColumn(name="idMoviePlace")
		public MoviePlaceEntity getIdMoviePlace() {
			return idMoviePlace;
		}
		public void setIdMoviePlace(MoviePlaceEntity idMoviePlace) {
			this.idMoviePlace = idMoviePlace;
		}
		
		@Basic
		@Column(name="seatNumber")
		public String getSeatNumber() {
			return seatNumber;
		}
		public void setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
		}
		
		@Basic
		@Column(name="tipeTicket")
		public String getTipeTicket() {
			return tipeTicket;
		}
		public void setTipeTicket(String tipeTicket) {
			this.tipeTicket = tipeTicket;		
        }
}