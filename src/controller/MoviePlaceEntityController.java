package controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Item.*;
import entities.*;
import model.*;
import java.util.*;

/**
 * Servlet implementation class MoviePlaceEntityController
 */
@WebServlet("/MoviePlaceEntityController")
public class MoviePlaceEntityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoviePlaceEntityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action=request.getParameter("action");
		//MovieEntityModel mem =new MovieEntityModel();
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		HttpSession session =request.getSession();
		if(action.equals("ContinueBuying")) {
			List<ItemMoviePlaceEntity> cont=new ArrayList<ItemMoviePlaceEntity>();
			
			for(MoviePlaceEntity p:mpem.findAll()) {
				if(p.getIdMovie().getIdMovie()==Integer.parseInt(request.getParameter("id"))) {
					
					cont.add(new ItemMoviePlaceEntity(p));
				}
				session.setAttribute("cont", cont);
			}
				
			request.getRequestDispatcher("toMoviePlace.jsp").forward(request, response);
		}
			
			
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		HttpSession session =request.getSession();
			List<ItemMoviePlaceEntity> cont=new ArrayList<ItemMoviePlaceEntity>();
			for(MoviePlaceEntity p:mpem.findAll()) {
	
					cont.add(new ItemMoviePlaceEntity(p));
				}
				session.setAttribute("cont", cont);
			
				
			request.getRequestDispatcher("toMoviePlace1.jsp").forward(request, response);
		}
		
	

}
