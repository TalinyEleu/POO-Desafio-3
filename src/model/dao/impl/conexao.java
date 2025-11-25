package model.dao.impl;
//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe contrutor privado de conexao ao banco pdrao singleton/dao

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
	private static Conexao conexaoSingleton;
	private Connection connection;
	private Conexao() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			//this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/produto" , "root", "00Ybt26$");
			Class.forName("org.mariadb.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3308/estoque", "root", "00Ybt26$" );
			
			
			//
		} catch (SQLException sqlE) {
			 //tratamento de erro de excecao de dirver SQL com dump em console para debug
			throw new IllegalArgumentException("Erro ao conectar ao banco, ver console para info.");
			//sqlE.printStackTrace();
			//
					
			//tratamento de erro de excecao de classe 
		} catch (ClassNotFoundException classE) {
			throw new IllegalArgumentException("Erro ao carregar a classe de conexão!");
		}
	}
	public static Conexao getInstance(){
		if (conexaoSingleton == null ) {
			conexaoSingleton = new Conexao();
		}
		return conexaoSingleton;

	}
	public Connection getConnection(){
		return connection;
	}
}
