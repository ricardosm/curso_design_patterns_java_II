package aula1.padrao_factory.conexaoBanco.solucao.exercicioPratico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Connection conexao = null;
			String banco = System.getenv("tipoBanco");
			if(banco.equals("mysql")) {
				conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
			} 
			else if(banco.equals("postgres")) {
				conexao = DriverManager.getConnection("jdbc:postgres://localhost:3306/banco", "usuario", "senha");
			}
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
