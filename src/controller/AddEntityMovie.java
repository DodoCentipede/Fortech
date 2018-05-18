package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.MovieEntity;
import model.MovieEntityModel;

/**
 * Servlet implementation class AddEntityMovie
 */
@WebServlet("/AddEntityMovie")
public class AddEntityMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEntityMovie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idMovieT");
		String name=request.getParameter("nameMovieT");
		String tipe=request.getParameter("tipeMovieT");
		String distributie=request.getParameter("distributieMovieT");
		String regizor=request.getParameter("regizorMovieT");
		String date=request.getParameter("dateMovieT");
		String language=request.getParameter("languageMovieT");
		String classif=request.getParameter("classificationMovieT");
		
		MovieEntityModel mem =new MovieEntityModel();
		MovieEntity me=new MovieEntity();
		me.setIdMovie(Integer.parseInt(id));
		me.setNameMovie(name);
		me.setTipeMovie(tipe);
		me.setDistributieMovie(distributie);
		me.setRegizorMovie(regizor);
		me.setDateMovie(date);
		me.setLanguageMovie(language);
		me.setClassificationMovie(classif);
		mem.create(me);
		
		if(id!=null)
		{
			request.getRequestDispatcher("adminpanel.html").forward(request, response);;
			return;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
