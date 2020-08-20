//esta classe esta conectando o java ao banco de dados

package br.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

	public static Connection receberConexao() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/banco_turmaccvl?useSSL=false","root","root");
			System.out.println("banco de dados conectado com sucesso!!!");
		}catch (SQLException | ClassNotFoundException e) {
			System.err.println("erro ao conectar");
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}
