package aula1.padrao_factory.conexaoBanco.problema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Problema: A linha que cria a conex�o: DriverManager.getConnection()
 * possui muitas informa��es importantes: tipo de banco de dados,
 * endere�o do banco, nome do banco, usu�rio e senha.
 * 
 * Imagine que vamos utilizar essa linha em todo lugar que precisa
 * de uma conex�o com o banco de dados. O que aconteceria se 
 * precis�ssemos trocar, por exemplo, o endere�o do banco de
 * dados? Precisar�amos propagar a mudan�a para todos os pontos
 * que pedem uma conex�o. 
 * 
 * Solu��o: Para resolver esse problema, podemos isolar esse processo
 * de cria��o do banco de dados em uma classe espec�fica, que s� faz
 * isso.
 * 
 * 
 */
public class MeuAplicativo {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","usario","senha");
		PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// Restante do c�digo
	}
}
