package br.com.impacta;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PreparaBean
 */
@WebServlet(name = "preparaBean", urlPatterns = { "/preparaBean" })
public class PreparaBean extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		UsuarioBean usuario = new UsuarioBean(nome,login,senha);
		request.setAttribute("bean", usuario); //poderia ser session ou servletContext (application)
		
		//redireciona para a pagina que exibe os dados do bean
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/processo-form-1.jsp");
		dispatcher.forward(request, response);
	
	}

}
