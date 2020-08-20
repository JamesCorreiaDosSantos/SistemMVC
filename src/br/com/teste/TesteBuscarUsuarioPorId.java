package br.com.teste;

import br.com.modelo.Usuario;
import br.com.modelo.UsuarioDao;

public class TesteBuscarUsuarioPorId {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuarioDoBanco = usuarioDao.buscarPorId(5);
		
		System.out.println(usuarioDoBanco.getId());
		System.out.println(usuarioDoBanco.getNome());
		System.out.println(usuarioDoBanco.getLogin());
		System.out.println(usuarioDoBanco.getSenha());
	}

}