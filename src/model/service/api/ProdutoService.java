package model.service.api;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: interface serviço para entidade Produto.

import java.util.List;
import model.entidade.Produto;

public interface ProdutoService {
	
	
	public void salvar(Produto produto);
	
	public void excluir(int id);
	
	public List<Produto> listarTodos();
	
	public Produto buscarPorId(int id);

		
}
