package controller.api;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: interface api controller para produto .

import java.util.List;

import model.entidade.Produto;

public interface ProdutoController {
	
	public void salvar(Produto produto);
	
	public void excluir(int id) throws IllegalArgumentException;
	
	public List<Produto> listarTodos();
	
	public Produto buscarPorId(int id);


}
