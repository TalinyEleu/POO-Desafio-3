package model.dao.api;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: interface DAO para entidade Produto.


import model.entidade.Produto;

public interface ProdutoDAO extends DAO<Produto>{
	
		public Produto buscarPorId(int id);	
}


