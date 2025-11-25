package model.dao.api;
//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: interface API generica DAO.

import java.util.List;

public interface DAO <T>{
	
	public void salvar(T t);
	
	public void excluir(int id);
	
	public void List<T> listarProdutos();

	
}
