package model;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.entidade.Produto;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe interface grafica para o cadastro de produtos




public class Cadastro {

	private JPanel panel;
	private JTextField textFieldNome;
	private JTextField textFieldQuantidade;
	
	public Cadastro() {
		
		setTitle("Cadastro de produtos");
		setLayout(new FlowLayout());
		
		this.panel = new JPanel();
		this.panel.setLayout(new FlowLayout());
		this.panel.setPreferredSize(new Dimension(500,500));
		this.add(panel);
		
		criarTextFieldNome("Nome do produto");
		criarTextFieldQuantidade("Quantidada em estoque");
		
		setSize(new Dimension(500,500));
		setPreferredSize(new Dimension(500,500));
		
		
	}
	
	private void criarLabel(String texto) {
		JLabel label = new JLabel(texto);
		label.setPreferredSize(new Dimension(400,40));
		this.panel.add(label);
	}
	
	private void criarTextFieldNome(String texto) {
		criarLabel(texto);
		this.textFieldNome = new JTextField();
		this.textFieldNome.setPreferredSize(new Dimension(400,40));
		this.panel.add(this.textFieldNome );
		
	}
	
	private void criarTextFieldQuantidade(String texto) {
		criarLabel(texto);
		this.textFieldQuantidade = new JTextField();
		this.textFieldQuantidade.setPreferredSize(new Dimension(400,40));
		this.panel.add(this.textFieldQuantidade );
		
	}
	
	private void criarBotao(String label, ActionListener handler) {
		JButton button = new JButton(label);
		button.addActionListener(handler);
		button.setPreferredSize(new Dimension(300, 80));
		this.panel.add(button);
	}
	
	private Produto criarProduto() {
		Produto produto = new Prodduto()(texto);
		this.textFieldQuantidade = new JTextField();
		this.textFieldQuantidade.setPreferredSize(new Dimension(400,40));
		this.panel.add(this.textFieldQuantidade );
	
}

