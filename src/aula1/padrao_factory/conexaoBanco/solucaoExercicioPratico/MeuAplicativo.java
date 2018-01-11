package aula1.padrao_factory.conexaoBanco.solucaoExercicioPratico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Solução: Para resolver esse problema, podemos isolar esse processo
 * de criação do banco de dados em uma classe específica, que só faz
 * isso: ConnectionFactory
 * 
 * Se precisarmos mudar a string de conexão, basta agora mudar na 
 * classe que escrevemos, e a mudança será automaticamente propagada. 
 * Muito mais fácil!
 * 
 */

public class MeuAplicativo {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().getConnection();
		PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// Restante do código
	}
}
