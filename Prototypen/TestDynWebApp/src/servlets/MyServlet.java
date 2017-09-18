package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import func.MyClass;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
	
	int param[] = {0,1,2,3,4,5};
	
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
		MyClass myClass = new MyClass();
		if (request.getParameter("button1") != null) {
            int test[] = myClass.method1(param);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
			request.setAttribute("li1", "Wert aus Array[0] => "+test[0]); // set your String value in the attribute
			request.setAttribute("li2", "Wert aus Array[1] => "+test[1]); // set your String value in the attribute
			request.setAttribute("li3", "Wert aus Array[2] => "+test[2]); // set your String value in the attribute
			request.setAttribute("li4", "Wert aus Array[3] => "+test[3]); // set your String value in the attribute
			request.setAttribute("li5", "Wert aus Array[4] => "+test[4]); // set your String value in the attribute
			request.setAttribute("li6", "Wert aus Array[5] => "+test[5]); // set your String value in the attribute
			dispatcher.forward( request, response );
        }
        

		
		//doGet(request, response);
	}

}
