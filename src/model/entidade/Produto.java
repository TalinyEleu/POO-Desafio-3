package model.entidade;


// CURSO: GRADS | STDC
// UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
// DESAFIO: 3 Gerenciamento de Estoque
// GRUPO: Nº 16
// INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
// Arquivo: classe java para produto.

import java.io.Serializable;

public class Produto implements Serializable {
	private int codigo;
	private String nome;
	private int quantidade;
	
	public Produto(String nome, float quantidade) {
		 // construtor com Validação 
        if (nome == null || nome.trim().isEmpty()) {
        	throw new IllegalArgumentException("Nome inválido ou não informado");
        }
        if (quantidade < 0) {
        	throw new IllegalArgumentException("Quantidade inválida ou não informada");
        }
        
		this.nome = nome ;
		this.quantidade = quantidade;
	}
	
	public void atualizarQuantidade(float quantidade) {
		this.quantidade += quantidade;
	}
	
	public void excluirEstoque(float quantidade) {
		//desenvolver codigo;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidadeEstoque(float quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return this.codigo + " - " +  this.nome  + " - " + this.quantidade;

	}
}