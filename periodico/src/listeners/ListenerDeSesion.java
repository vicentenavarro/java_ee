package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class ListenerDeSesion
 *
 */
@WebListener
public class ListenerDeSesion implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerDeSesion() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	ServletContext contexto=se.getSession().getServletContext();
        synchronized(contexto){
        	Integer numeroUsuarios=(Integer)contexto.getAttribute("numeroUsuarios");
        	numeroUsuarios++;
        	contexto.setAttribute("numeroUsuarios",numeroUsuarios);
        }
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
         // TODO Auto-generated method stub
    }
	
}
