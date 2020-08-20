
// esta clase esta fazendo conexao com o a clase usuario e 
//o mySql ela quem ira pedir a classe conexao para gravar 
//os dados no mySql
package br.com.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.Conexao;

public class UsuarioDao {

	public void cadastrar(Usuario usuario) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "INSERT INTO usuario(nome,login,senha)VALUES(?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1,usuario.getNome());
			preparador.setString(2,usuario.getLogin());
			preparador.setString(3,usuario.getSenha());
			
			preparador.execute();
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Usuario> mostrarTodosUsuarios(){

		
		Connection con = Conexao.receberConexao();
		String sql = "SELECT * from usuario";
		List<Usuario> usuarios = new ArrayList<>();
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				
				usuarios.add(usuario);
			}
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
		
	}


	public void excluir(int id) {
		
		Connection con = Conexao.receberConexao();
		
	try {
		String sql = "DELETE from usuario WHERE id = ?";
		
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1,id);
		
		preparador.execute();
		con.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	public Usuario buscarPorId(int id) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "SELECT * from usuario WHERE id=?";
		Usuario usuario = null;
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);
			
			ResultSet resultado = preparador.executeQuery();
		
			if(resultado.next()) {
				usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				
			}
			
		con.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public void alterar(Usuario usuario) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE id=?";
		
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			
			preparador.execute();
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}


