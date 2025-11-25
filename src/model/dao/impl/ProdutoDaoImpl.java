package model.dao.impl;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: implementação da interface DAO para entidade Produto.

import java.sql.PreparedStatement;

import model.entidade.Produto;


public class ProdutoDaoImpl {

		private static final String INSERT = "INSERT INTO produtos (nome_produto, qt_estoque) values (?,?) ";
		
		private static final String UPDATE = "UPDATE produtos SET qt_estoque =? WHERE id_produto = ?";
		
		private static final String EXCLUIR = "DELETE FROM produtos WHERE id_produto = ?";
		
		private static final String LISTAR_TODOS = "SELECT * FROM produtos";
		
		private static final String BUSCAR_POR_ID = "SELECT * FROM produtos WHERE id_produto = ?";
		
		
		public void salvarProduto(Produto produto) {
			try (PreparedStatement ps = Conexao.getInstance().getConnection().prepareStatement(INSERT)) {
				ps.setString(1, produto.getNome());
				ps.setInt(2, produto.getQuantidade());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
		public void alterarProduto(Produto produto) {
			try (PreparedStatement ps = Conexao.getInstance().getConnection().prepareStatement(UPDATE)) {
				ps.setInt(1, produto.getQuantidade());
				ps.setInt(2, produto.getCodigo());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
		
}
