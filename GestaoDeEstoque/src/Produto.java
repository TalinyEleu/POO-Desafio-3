package estoque;


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
	private float quantidadeEstoque;
	
	public Produto(String nome, float quantidade) {
		 // construtor com Validação 
        if (nome == null || nome.trim().isEmpty()) {
        	throw new IllegalArgumentException("Nome inválido ou não informado");
        }
        if (quantidade < 0) {
        	throw new IllegalArgumentException("Quantidade inválida ou não informada");
        }
        
		this.nome = nome ;
		this.quantidadeEstoque = quantidade;
	}
	
	public void atualizarQuantidade(float quantidade) {
		this.quantidadeEstoque += quantidade;
	}
	
	public void excluirEstoque(float quantidade) {
		//desenvolver codigo;
	}

	public float getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(float quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void imprimirRelatorio() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Quantidade: " + this.quantidadeEstoque);
	}
}