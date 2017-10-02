package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import func.Unternehmen;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
	
	/**
	 * Initiierung der für das Spiel benötigten Instanzen
	 */
	Unternehmen u[] = new Unternehmen[4];
	// Markt markt = new Markt;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * Hier kommt mein Code hin
		 */
		if (request.getParameter("startbtn") != null) {

			// Entscheiden welcher spieler ausgewählt ist
			
			// Ermitteln der Spieleranzahl
			int spielerAnz = Integer.parseInt(request.getParameter("spielerAnzahl"));
			
			// Erzeugen der Unternehmen/Spieler
			for(int i = 0; i < spielerAnz; i++) {
				u[i] = new Unternehmen("Spieler " + (i+1));
				System.out.println("Unternehmensname: " + u[i].getName());
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");

			dispatcher.forward(request, response);
			
		}
        

	}

}
