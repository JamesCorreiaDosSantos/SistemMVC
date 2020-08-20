package br.com.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Usuario;
import br.com.modelo.UsuarioDao;

@WebServlet("/mostrarusuarios")
public class MostrarTodosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> usuarios = usuarioDao.mostrarTodosUsuarios();
		
		request.setAttribute("listaDeUsuarios", usuarios);
		request.getRequestDispatcher("mostrartodos.jsp").forward(request, response);
		
	}

}
