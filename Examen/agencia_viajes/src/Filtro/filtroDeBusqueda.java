package Filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class filtroDeBusqueda
 */
@WebFilter("/Buscar")
public class filtroDeBusqueda implements Filter {

    /**
     * Default constructor. 
     */
    public filtroDeBusqueda() {
        // TODO Auto-generated constructor stub
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
		ServletContext contexto=request.getServletContext();
		
		String busqueda=request.getParameter("busqueda");
		
		if(busqueda!=null){
			busqueda=busqueda.trim();//Elimina los espacios
			if(!busqueda.equals("")){
				request.setAttribute("busqueda", busqueda);
				chain.doFilter(request, response);
			}
			/**
			 * Si no cumple el if(no es nulo y es distinto de vacio envia
			 * a la p�gina de error.
			 */
			else{
				
				RequestDispatcher dispatcher=contexto.getRequestDispatcher("/paginaError.jsp");
				dispatcher.forward(request, response);
			}
		}
		/**
		 * Idem anterior
		 */
		else{
			RequestDispatcher dispatcher=contexto.getRequestDispatcher("/paginaError.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
