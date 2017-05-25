package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOContactos;
import modelos.Contactos;
/**
 * Servlet implementation class Principal
 */
@WebServlet("/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Principal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario=request.getParameter("usuario");
		String telefono=request.getParameter("telefono");
		
		DAOContactos dao=new DAOContactos();
		
		if(usuario!=null && telefono!=null){
			usuario=usuario.trim();
			telefono=telefono.trim();
			if(!usuario.equals("") && !telefono.equals("")){
				Contactos c=new Contactos(usuario,telefono);
				
				dao.update(c);
			}
		}
		
		ArrayList<Contactos> listado=dao.listar();
		request.setAttribute("listado",listado);
		
		ServletContext contexto=request.getServletContext();
		RequestDispatcher dispatcher=contexto.getRequestDispatcher("/Principal");
		dispatcher.forward(request, response);
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
}
