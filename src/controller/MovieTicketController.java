package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Item.ItemMovieTicket;

import entities.MovieTicket;

import model.MovieTicketModel;

/**
 * Servlet implementation class MovieTicketController
 */
@WebServlet("/MovieTicketController")
public class MovieTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieTicketController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		//MovieEntityModel mem =new MovieEntityModel();
		MovieTicketModel mtm=new MovieTicketModel();
		HttpSession session =request.getSession();
		if(action.equals("SeeThePeople")) {
			List<ItemMovieTicket> contNext=new ArrayList<ItemMovieTicket>();
			for(MovieTicket pi:mtm.findAll()) {
				
				if(pi.getIdMoviePlace().getIdMoviePlace()==Integer.parseInt(request.getParameter("id"))) {
					
					contNext.add(new ItemMovieTicket(pi));
				}
				
				session.setAttribute("contNext", contNext);
			}
				
			request.getRequestDispatcher("toMovieTicket.jsp").forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MovieTicketModel mtm=new MovieTicketModel();
		HttpSession session =request.getSession();
			List<ItemMovieTicket> contNext=new ArrayList<ItemMovieTicket>();
			for(MovieTicket pi:mtm.findAll()) {
					contNext.add(new ItemMovieTicket(pi));
				session.setAttribute("contNext", contNext);
			}
				
			request.getRequestDispatcher("toMovieTicket1.jsp").forward(request, response);
	}

}
