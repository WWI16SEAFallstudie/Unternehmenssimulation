package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.UnionTypeReference;

import com.sun.xml.internal.txw2.Document;

import func.Unternehmen;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
	
	int param[] = {0,1,2,3,4,5};
	Unternehmen u[] = new Unternehmen[4];
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Mein Text ");
		request.setAttribute("Name", "Temp");
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
			
			for(int i = 0; i < spielerAnz; i++) {
				u[i] = new Unternehmen("Uhrii " + i);
				System.out.println("Unternehmensname: " + u[i].getName());
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");

			dispatcher.forward(request, response);
			
		}
        

		
		//doGet(request, response);
	}

}
