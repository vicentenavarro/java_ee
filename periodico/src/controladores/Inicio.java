package controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOAnuncio;

/**
 * Servlet implementation class inicio
 */
@WebServlet("/inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Inicio() {
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext contexto=config.getServletContext();
		
		Integer numeroUsuarios=new Integer(0);
		contexto.setAttribute("numeroUsuarios", numeroUsuarios);
	
		DAOAnuncio dao=new DAOAnuncio();
		int n=dao.contar();
		contexto.setAttribute("numeroAnuncios", n);
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion=request.getSession();
		ServletContext contexto=request.getServletContext();
		
		RequestDispatcher dispatcher=contexto.getRequestDispatcher("/inicio.jps");
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
