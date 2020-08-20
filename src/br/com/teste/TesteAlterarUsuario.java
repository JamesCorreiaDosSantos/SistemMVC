package br.com.teste;

import br.com.modelo.Usuario;
import br.com.modelo.UsuarioDao;

public class TesteAlterarUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setId(5);
		usuario.setNome("james");
		usuario.setLogin("google");
		usuario.setSenha("123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.alterar(usuario);
		
		System.out.println("Alteração Efetivada");

	}

}