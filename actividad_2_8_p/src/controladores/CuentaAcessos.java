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

import dao.DAOPeticion;
import dao.DAOSesion;
import dao.DAOUsuario;
import dao.ResultadoCRUD;
import modelos.Peticion;
import modelos.Sesion;
import modelos.Usuario;

/**
 * Servlet implementation class CuentaAcessos
 */
@WebServlet(name = "CuentaAccesos", urlPatterns = { "/CuentaAccesos" })
public class CuentaAcessos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String strServer;
    /**
     * Default constructor. 
     */
    public CuentaAcessos() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ServletContext contex =config.getServletContext();
		 strServer = "Servidor: "+contex.getServerInfo()+ "Servlet: "+config.getServletName();
		 contex.setAttribute("servidor", strServer);
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context =request.getServletContext();
		Peticion p = new Peticion();
		DAOPeticion daop=new DAOPeticion();
		daop.update(p);
		request.setAttribute("totalPeticiones", p.getN());
		
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		String vista="error.jsp";
		
		HttpSession sesion=request.getSession();
		
		if(sesion.getAttribute("usuario")!= null){
			Usuario u=(Usuario)sesion.getAttribute("usuario");
			incrementarSesion(sesion,request);
			vista="muestraCuenta.jsp";
		} else {
			if (usuario != null && password != null) {
				usuario = usuario.trim();
				Usuario u = new Usuario(usuario);
				DAOUsuario daou = new DAOUsuario();
				ResultadoCRUD r = daou.comprobar(u, password);

				switch (r) {
				case OK:
					sesion.setAttribute("usuario", u);
					incrementarSesion(sesion,request);
					vista="muestraCuenta.jsp";
					break;

				case NO_EXISTE:
					vista = "usuarioNoExiste.jsp";
					request.setAttribute("totalPeticiones", p.getN());
					break;
				}
			}
			else{
				vista = "usuarioNoExiste.jsp";
				request.setAttribute("totalPeticiones", p.getN());
				
			}
		}

		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/" + vista);
		dispatcher.forward(request, response);
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void incrementarSesion(HttpSession sesion,HttpServletRequest request){
		Sesion s=new Sesion(sesion.getId());
		DAOSesion dao = new DAOSesion();
		ResultadoCRUD r = dao.update(s);
		switch (r) {
		case OK:
			request.setAttribute("id", s.getId());
			request.setAttribute("nSesion", s.getN());
			
			break;

		}
	}
}


