package model.dao.impl;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: implementação da interface DAO para entidade Produto.

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.dao.api.ProdutoDAO;
import model.entidade.Produto;
import java.sql.SQLException;

public class ProdutoDaoImpl implements ProdutoDAO {

		private static final String INSERT = "INSERT INTO produtos (nome_produto, qt_estoque) values (?,?) ";
		
		private static final String UPDATE = "UPDATE produtos SET qt_estoque =? WHERE id_produto = ?";
		
		private static final String EXCLUIR = "DELETE FROM produtos WHERE id_produto = ?";
		
		private static final String LISTAR_TODOS = "SELECT * FROM produtos";
		
		private static final String BUSCAR_POR_ID = "SELECT * FROM produtos WHERE id_produto = ?";
		
		

		public void salvar(Produto produto) {
			if (produto != null && produto.getCodigo()==0){
				this.salvarProduto(produto);
			
			} else {
				this.alterarProduto(produto);	
			} 		
		}
		
		
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
		
		public void excluir(Produto produto) {
			try (PreparedStatement ps = Conexao.getInstance().getConnection().prepareStatement(EXCLUIR)) {
				ps.setInt(1, produto.getCodigo());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		
		public List<Produto> listarTodos() {
			List<Produto> produtos = new ArrayList<Produto>();
			//prepara e executa a query armazena dados em resultset
			try (PreparedStatement ps = Conexao.getInstance().getConnection().prepareStatement(LISTAR_TODOS);
				ResultSet resultSet = ps.executeQuery();
					) {
				
				//percorre o resultset retornado adicioando os elementos à lista
				while (resultSet.next()) {
					Produto produto = new Produto(resultSet.getString("nome_produto"), resultSet.getInt("qt_estoque"));
					produto.setCodigo(resultSet.getInt("id_produto"));
					produtos.add(produto);
				}

				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return produtos;
		}


		@Override
		public void excluir(int id) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public Produto buscarPorId(int id) {
		Produto produto =null;
		try (
			PreparedStatement ps = Conexao.getInstance().getConnection().prepareStatement(BUSCAR_POR_ID);
			){	
			ps.setInt(1, id);
			try(
				ResultSet resultSet = ps.executeQuery();
				){
				while (resultSet.next()) {
					produto = new Produto(resultSet.getString("nome_produto"), resultSet.getInt("qt_estoque"));
					produto.setCodigo(resultSet.getInt("id_produto"));
					
				}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception			
			}
		} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return produto;
		
		}

}

