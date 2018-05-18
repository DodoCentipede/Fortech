package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.MoviePlaceEntity;
import entities.MovieTicket;
import model.MoviePlaceEntityModel;
import model.MovieTicketModel;

/**
 * Servlet implementation class DeleteEntityMovieTicket
 */
@WebServlet("/DeleteEntityMovieTicket")
public class DeleteEntityMovieTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEntityMovieTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idUserT");
		MovieTicketModel mtm=new MovieTicketModel();
		MovieTicket mt=new MovieTicket();
		mt.setIdUser(Integer.parseInt(id));
		mtm.delete(mt);
		request.getRequestDispatcher("adminpanel.html").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
