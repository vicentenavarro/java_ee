package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class listenerUsuarios
 *
 */
@WebListener
public class listenerUsuarios implements  HttpSessionListener {

    /**
     * Default constructor. 
     */
    public listenerUsuarios() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         HttpSession sesion=se.getSession();
         ServletContext contexto=sesion.getServletContext();
         
         /**
          * Con synchonized le doy prioridad
          */
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
