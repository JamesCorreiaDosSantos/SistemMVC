package br.com.teste;

import br.com.modelo.Usuario;
import br.com.modelo.UsuarioDao;

public class TesteCadastrarUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.setNome("laura brasil");
		usuario.setLogin("janeiro");
		usuario.setSenha("janeiro123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.cadastrar(usuario);
		
	}

}

