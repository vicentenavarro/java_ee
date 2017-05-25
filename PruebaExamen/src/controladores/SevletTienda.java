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
import javax.servlet.http.HttpSession;

import modelos.Producto;
import sun.rmi.server.Dispatcher;
import dao.DaoProductos;

/**
 * Servlet implementation class SevletTienda
 */
@WebServlet("/SevletTienda")
public class SevletTienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletTienda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion=request.getParameter("opcion");
		ServletContext constexto=request.getServletContext();
		String vista="opcionNoreconocida.jsp";
		HttpSession sesion=request.getSession();//Conecta la sesion
		ArrayList<Producto> carrito=(ArrayList<Producto>)sesion.getAttribute("carrito");
		if(carrito==null){
			carrito=new ArrayList<Producto>();
			sesion.setAttribute("carrito", carrito);
		}
		
		if(opcion!=null && opcion.equals("1")){
			
			DaoProductos dao=new DaoProductos();
			ArrayList<Producto> lista=dao.listar();
			request.setAttribute("lista",lista);
			Producto productoOferta=(Producto)contexto.getAttribute("oferta");
			String textoOferta="Producto ofecta del mes "
			vista="/mostrarTodos.jsp";
			
			RequestDispatcher dispatcher=contexto.getRequesDispatcher("/mostrarTodos.jsp");
			dispatcher.forward(request, response);
			
			
		}
		if(opcion!=null && opcion.equals("2")){
			
			try{
			DaoProductos dao=new DaoProductos();
			String stIdProducto=request.getParameter("idProducto");
			request.setAttribute("producto",p);
			vista="/mostrarProducto.jsp";
			}
			
		
			catch(NumberFormatException nfe){
				vista="/datosincorrectos.jsp";
				}
		}
		
		if(opcion!=null && opcion.equals("3")){
			String stIdProducto=request.getParameter("idProducto");
			int idProducto=Integer.parseInt(stIdProducto);
			DaoProductos dao=new DaoProductos();//Se podria instanciar fuera
			Producto p=dao.getProducto(idProducto);
			carrito.add(p);
			request.setAttribute("carrito", carrito);
			
			/*
			 * Calcular precio total
			 */
			
			double precioTotal=0;
			for(Producto prod : carrito){
				precioTotal+=prod.getPrecio();
			}
			request.setAttribute("precioTotal", precioTotal);
			vista="/mostrarCarrito.jsp";
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
