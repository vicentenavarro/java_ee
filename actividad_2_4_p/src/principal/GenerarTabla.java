package principal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerarTabla
 */
@WebServlet("/GenerarTabla")
public class GenerarTabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GenerarTabla() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String recibirNumero=request.getParameter("inputNumero");
		String vista;
		
		try{
			Integer a=new Integer(recibirNumero);
			request.setAttribute("a", a);
			vista="mostrarTabla.jsp";
		}
		catch(NumberFormatException nfe){
			vista="error.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/"+vista);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
