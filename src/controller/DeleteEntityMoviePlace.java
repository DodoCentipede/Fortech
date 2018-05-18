package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.MovieEntity;
import entities.MoviePlaceEntity;
import model.MovieEntityModel;
import model.MoviePlaceEntityModel;

/**
 * Servlet implementation class DeleteEntityMoviePlace
 */
@WebServlet("/DeleteEntityMoviePlace")
public class DeleteEntityMoviePlace extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEntityMoviePlace() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idMoviePlaceT");
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		MoviePlaceEntity mpe=new MoviePlaceEntity();
		mpe.setIdMoviePlace(Integer.parseInt(id));
		mpem.delete(mpe);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idMoviePlaceT");
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		MoviePlaceEntity mpe=new MoviePlaceEntity();
		mpe.setIdMoviePlace(Integer.parseInt(id));
		mpem.delete(mpe);
		request.getRequestDispatcher("adminpanel.html").forward(request, response);
	}

}
