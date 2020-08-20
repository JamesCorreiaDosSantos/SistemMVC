package br.com.teste;

import br.com.modelo.UsuarioDao;

public class TesteExcluirUsuario {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.excluir(39);
		
		System.out.println("executado");

	}

}
