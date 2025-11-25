
package model.service.impl;


//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: imlementacao em serviço .

import java.util.List;

import model.dao.api.ProdutoDAO;
import model.entidade.Produto;

import model.service.api.ProdutoService;


public class ProdutoServiceImpl implements ProdutoService {

	private ProdutoDAO produtoDao;
	
	
	@Override
	public void salvar(Produto produto) {
		//executa a funcao salvar apenas se o nome do produto não exceder o comprimento maximo  60caracteres
		String name = produto.getNome();
		if (name.length() <= 60)
			{ this.produtoDao.salvar(produto);
			
		} else { throw new IllegalArgumentException("Comprimento de Nome excede o limite do campo");
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(int id) {
		//verifica se o produto existe no banco antes de tentar excluir
		Produto prodExcluir = this.buscarPorId(id);
		if (prodExcluir != null) {
			this.produtoDao.excluir(id);
		} else { throw new IllegalArgumentException("Produto inexistente na base de dados, exclusão cancelada");
		
		}
		
	}

	@Override
	public List<Produto> listarTodos() {
		// encaminha para a camada DAO e retorna a lista com todos os produtos
		return this.listarTodos();
	}

	@Override
	public Produto buscarPorId(int id) {
		// encaminha para a camada DAO e retorna a busca por id como instancia de produto
		return this.buscarPorId(id);
		 
		} 
		
	}
	
	
