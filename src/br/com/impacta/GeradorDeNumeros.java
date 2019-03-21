package br.com.impacta;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "geradorDeNumeros", urlPatterns = { "/geradorDeNumeros" })
public class GeradorDeNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		    int pQuantidade = Integer.parseInt(request.getParameter("quantidade"));	
			int pValorInicial = Integer.parseInt(request.getParameter("inicial"));
			int pValorFinal = Integer.parseInt(request.getParameter("final"));
			
			GeradorBean gerador = new GeradorBean(pQuantidade,pValorInicial,pValorFinal);
			request.setAttribute("random",gerador);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/sorteio.jsp");
			dispatcher.forward(request, response);
		
	}

}
