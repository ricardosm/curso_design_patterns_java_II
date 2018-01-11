package aula1.padrao_factory.conexaoBanco.solucaoExercicioPratico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Solu��o: Para resolver esse problema, podemos isolar esse processo
 * de cria��o do banco de dados em uma classe espec�fica, que s� faz
 * isso: ConnectionFactory
 * 
 * Se precisarmos mudar a string de conex�o, basta agora mudar na 
 * classe que escrevemos, e a mudan�a ser� automaticamente propagada. 
 * Muito mais f�cil!
 * 
 */

public class MeuAplicativo {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().getConnection();
		PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// Restante do c�digo
	}
}
