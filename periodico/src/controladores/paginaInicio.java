package controladores;

import java.io.IOException;
import java.util.ArrayList;

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
import modelos.Anuncios;

/**
 * Servlet implementation class paginaInicio
 */
@WebServlet("/paginaInicio")
public class paginaInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paginaInicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ServletContext contexto=config.getServletContext();
		//Es para guardar los numeros de usuarios que estan conectados
		contexto.setAttribute("numeroUsuarios", new Integer(0));
		//Sirve para cuardar datos en el contexto de la aplicacion.
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion=request.getSession();
		
		ServletContext contexto=request.getServletContext();
		int numeroUsuarios=(int)contexto.getAttribute("numeroUsuarios");
		request.setAttribute("numeroUsuarios", numeroUsuarios);
		
		DAOAnuncio dao=new DAOAnuncio();
		int n=dao.contar();
		request.setAttribute("numeroAnuncios", n);
		
		//Manda a la pagina jsp.
		RequestDispatcher dispatcher = contexto.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request,response);
		System.out.println("*******************");//Para comprobar si vuelve
		
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
