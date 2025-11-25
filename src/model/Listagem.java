package model;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe java para listagem de dados

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.entidade.Produto;



public class Listagem extends JFrame {
	
	private JPanel panel;
	private JList<Produto> listProdutos;
	private DefaultListModel<Produto> listProdutosModel;
	
	
	
	public Listagem() {
		
		setTitle("ListagemView de estoque");
		setLayout(new FlowLayout());
		
		this.panel = new JPanel();
		this.panel.setLayout(new FlowLayout());
		this.panel.setPreferredSize(new Dimension(500,500));
		add(this.panel);
		
		
		criarBotao("Cadastrar", new ButtonCarregarDoBancoHandler());
		criarBotao("Voltar", new ButtonVoltarHandler());
		criarBotao("Criar Backup em texto plano", new ButtonBackupTextoHandler());		
		criarList();
		
		
		
		setSize(new Dimension(500,500));
		setPreferredSize(new Dimension(500,500));
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
	
	private void criarBotao(String label, ActionListener handler) {
		JButton button = new JButton(label);
		button.addActionListener(handler);
		button.setPreferredSize(new Dimension(300, 40));
		this.panel.add(button);
	}
	

	private void criarList() {
		listProdutosModel = new DefaultListModel<Produto>();
		listProdutos = new JList<Produto>(listProdutosModel);
		listProdutos.setPreferredSize(new Dimension(400,300));
		JScrollPane scrollPane = new JScrollPane(listProdutos);
		panel.add(scrollPane);
		
	}
	private class ButtonVoltarHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
	}
	
	private class ButtonCarregarDoBancoHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
		
	}
	
	private class ButtonBackupTextoHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			listProdutosModel.clear();
			
			setVisible(false);
		}
		
	}
}
