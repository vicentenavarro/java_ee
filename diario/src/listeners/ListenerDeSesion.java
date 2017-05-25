package listeners;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

/**
 * Servlet Filter implementation class ListenerDeSesion
 */
@WebFilter("/ListenerDeSesion")
public class ListenerDeSesion implements Filter {

    /**
     * Default constructor. 
     */
    public ListenerDeSesion() {
        // TODO Auto-generated constructor stub
    }
    
    public void sessionCreated(HttpSessionEvent se){
    	HttpSession sesion=se.getSession();
    	ServletContext contexto=sesion.getServletContext();
    	synchronized(contexto){
    		Integer n=(Integer)contexto.getAttribute("numeroUsuarios");
    		n++;
    		contexto.setAttribute("numeroUsuarios", n);
    	}
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
