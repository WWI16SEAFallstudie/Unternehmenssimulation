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
		
		// Start des Spiels mit der ausgewählten Anzahl an Spielern
		if (request.getParameter("startbtn") != null) {

			// Entscheiden welcher spieler ausgewählt ist
			
			// Ermitteln der Spieleranzahl
			int spielerAnz = Integer.parseInt(request.getParameter("spielerAnzahl"));
			
			// Erzeugen der Unternehmen/Spieler
			for(int i = 0; i < spielerAnz; i++) {
				u[i] = new Unternehmen("Spieler " + (i+1));
				System.out.println("Unternehmensname: " + u[i].getName());
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/segment.jsp");
			dispatcher.forward(request, response);
			
		}
		
		// Auswahl der Sparte zu Spielbeginn
		
			// Wahl der Ökosparte
			if (request.getParameter("selectoeko") != null) {
				
				u[0].erforscheUhr("Oeko");// u[0] muss noch gegen den aktuellen Spieler ausgetauscht werden
				System.out.println("Uhr erstellt: ");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				dispatcher.forward(request, response);
			}
			
			// Wahl der Luxussparte
			if (request.getParameter("selectluxus") != null) {
				
				u[0].erforscheUhr("Luxus");// u[0] muss noch gegen den aktuellen Spieler ausgetauscht werden
				System.out.println("Uhr erstellt: ");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				dispatcher.forward(request, response);
			}
						
			// Wahl der sparte
			if (request.getParameter("selectbillig") != null) {
				
				u[0].erforscheUhr("Billig");// u[0] muss noch gegen den aktuellen Spieler ausgetauscht werden
				System.out.println("Uhr erstellt: ");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				dispatcher.forward(request, response);
			}
        
		// Beenden der aktuellen Runde
		if (request.getParameter("nextRound") != null) {
			
			System.out.println("Runde beendet.");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/next.jsp");
			dispatcher.forward(request, response);
		}
	}

}
