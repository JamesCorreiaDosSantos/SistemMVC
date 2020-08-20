package br.com.teste;

import java.util.List;

import br.com.modelo.Usuario;
import br.com.modelo.UsuarioDao;

public class TesteMostrarTodosUsuario {

	public static void main(String[] args) {
	
		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> usuariosDoBanco = usuarioDao.mostrarTodosUsuarios();
		
		for(Usuario usuario:usuariosDoBanco) {
			
			System.out.println(usuario.getId() + " - " + usuario.getNome() + " - " + usuario.getLogin() + " - " + usuario.getSenha());
			
		}

	}

}
