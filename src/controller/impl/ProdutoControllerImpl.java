package controller.impl;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: implementacao da api controller para produto .

import java.util.List;

import controller.api.ProdutoController;
import model.entidade.Produto;
import model.service.api.ProdutoService;
import model.service.impl.ProdutoServiceImpl;

public class ProdutoControllerImpl implements ProdutoController {

	
	private ProdutoService produtoService;
	
	public ProdutoControllerImpl() {
		this.produtoService = new ProdutoServiceImpl();
	}
	
	
	@Override
	public void salvar(Produto produto) {
		this.produtoService.salvar(produto);
		
	}

	@Override
	public void excluir(int id) throws IllegalArgumentException {
		this.produtoService.excluir(id);
	}



	@Override
	public Produto buscarPorId(int id) {
		return this.produtoService.buscarPorId(id);
	}


	@Override
	public List<Produto> listarTodos() {
		return this.produtoService.listarTodos();
	}
	
	
	
	

}

