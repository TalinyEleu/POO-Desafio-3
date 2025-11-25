package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.api.ProdutoController;
import controller.impl.ProdutoControllerImpl;
import model.entidade.Produto;

@SuppressWarnings("serial")
public class ListagemView extends JFrame {
	
	
	private JPanel panel;
	private JList<Produto> listProdutos;
	private DefaultListModel<Produto> listProdutosModel;
		
	private ProdutoController produtoController;
	
	
	
	public ListagemView() {
		setTitle("ListagemView de estoque");
		setLayout(new FlowLayout());
		
		produtoController = new ProdutoControllerImpl();
		
		this.panel = new JPanel();
		this.panel.setLayout(new FlowLayout());
		this.panel.setPreferredSize(new Dimension(500,500));
		add(this.panel);
		

		criarBotao("Voltar", new ButtonVoltarHandler());

		
		criarLista();
		
		List<Produto> listaDeProdutos = produtoController.listarTodos();
		listProdutosModel.addAll(listaDeProdutos);
		
		setSize(new Dimension(500, 800));
		setPreferredSize(new Dimension(500, 800));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}	
	
	
	private void criarBotao(String label, ActionListener handler) {
		JButton button = new JButton(label);
		button.addActionListener(handler);
		button.setPreferredSize(new Dimension(300, 80));
		this.panel.add(button);
	}
	
	
	private void criarLista() {
		listProdutosModel = new DefaultListModel<Produto>();
		listProdutos = new JList<Produto>(listProdutosModel);
		JScrollPane scrollPane = new JScrollPane(listProdutos);
		scrollPane.setPreferredSize(new Dimension(400, 300));
		panel.add(scrollPane);
	}
	

	private class ButtonVoltarHandler implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
				}
	}
	
}
