package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.api.ProdutoController;
import controller.impl.ProdutoControllerImpl;
import model.entidade.Produto;

//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe interface grafica para o cadastro de produtos


@SuppressWarnings("serial")
public class CadastroProduto extends JFrame {
	private JPanel panel;
	private JTextField textFieldNome;
	private JTextField textFieldQuantidade;
	
	private ProdutoController produtoController;
	
	public CadastroProduto() {
		
		setTitle("Cadastro de produtos");
		setLayout(new FlowLayout());
		
		produtoController = new ProdutoControllerImpl();
		
		this.panel = new JPanel();
		this.panel.setLayout(new FlowLayout());
		this.panel.setPreferredSize(new Dimension(500,800));
		this.add(panel);
		
		criarTextFieldNome("Nome do produto");
		criarTextFieldQuantidade("Quantidada em estoque");
		
		
		criarBotao("Salvar", new ButtonSalvarHandler());
		criarBotao("Excluir", new ButtonExcluirHandler());
		criarBotao("Buscar por Id", new ButtonBuscarPorIdHandler());
		criarBotao("Listar Todos", new ButtonListarHandler());
		 
		
		
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
	
	
	private Produto criarObjetProduto() {
		if(!textFieldNome.getText().isEmpty()){
			Produto produto = new Produto(textFieldNome.getText(), Integer.parseInt(textFieldQuantidade.getText()) ); 
			return produto;
		}
		return null;
	
		
	}
	

	private void limparCampos() {
		textFieldNome.setText("");
		textFieldQuantidade.setText("");

		
	}
	
	private class ButtonSalvarHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Produto produto = criarObjetProduto();
			produtoController.salvar(produto);
			limparCampos();
			JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucess");
			
		}

	}
	
	private class ButtonExcluirHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			produtoController.excluir(Integer.parseInt(textFieldQuantidade.getText()));
			limparCampos();
			JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucess");
			
		}

	}
	
	public static void main(String[] args) {
		new CadastroProduto();
	}
	}
	

