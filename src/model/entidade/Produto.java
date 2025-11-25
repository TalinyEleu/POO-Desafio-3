package model.entidade;


// CURSO: GRADS | STDC
// UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
// DESAFIO: 3 Gerenciamento de Estoque
// GRUPO: Nº 16
// INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
// Arquivo: classe java para produto.

import java.io.Serializable;
 
@SuppressWarnings("serial")
public class Produto implements Serializable {
	private int codigo;
	private String nome;
	private int quantidade;
	
	public Produto() {
		 // construtor com Validação 
    //    if (nome == null || nome.trim().isEmpty()) {
        	//throw new IllegalArgumentException("Nome inválido ou não informado");
    //    }
   //     if (quantidade < 0) {
    //    	throw new IllegalArgumentException("Quantidade inválida ou não informada");
 
        
	//this.nome = nome ;
	//	this.quantidade = quantidade;
}
	
	public void atualizarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void excluirEstoque(int quantidade) {
		//desenvolver codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int c) {
		this.codigo = c;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	@Override
	public String toString() {
		return this.codigo + " - " +  this.nome  + " - " + this.quantidade;

	}
}