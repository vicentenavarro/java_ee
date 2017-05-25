package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dao.DaoProductos;
import modelos.Producto;

/**
 * Application Lifecycle Listener implementation class ListenerAplicacion
 *
 */
@WebListener
public class ListenerAplicacion implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerAplicacion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext contexto=sce.getServletContext();
         DaoProductos dao=new DaoProductos();
         Producto oferta=dao.getProducto(1);
         contexto.setAttribute("oferta",oferta);
    }
	
}
