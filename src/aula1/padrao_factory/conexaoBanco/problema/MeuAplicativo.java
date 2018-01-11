package aula1.padrao_factory.conexaoBanco.problema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Problema: A linha que cria a conexão: DriverManager.getConnection()
 * possui muitas informações importantes: tipo de banco de dados,
 * endereço do banco, nome do banco, usuário e senha.
 * 
 * Imagine que vamos utilizar essa linha em todo lugar que precisa
 * de uma conexão com o banco de dados. O que aconteceria se 
 * precisàssemos trocar, por exemplo, o endereço do banco de
 * dados? Precisaríamos propagar a mudança para todos os pontos
 * que pedem uma conexão. 
 * 
 * Solução: Para resolver esse problema, podemos isolar esse processo
 * de criação do banco de dados em uma classe específica, que só faz
 * isso.
 * 
 * 
 */
public class MeuAplicativo {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","usario","senha");
		PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// Restante do código
	}
}
