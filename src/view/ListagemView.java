package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.api.ProdutoController;
import controller.impl.ProdutoControllerImpl;
import model.entidade.Produto;
import model.Listagem.*;

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
		
		this.JPanel = new JPanel();
		this.panel.setLayout(new FlowLayout());
		this.panel.setPreferredSize(new Dimension(500,500));
		add(this.panel);
		

		criarBotao("Voltar", new ButtonVoltarHandler());

		
		criarList();
		
		

		
	}

	private class ButtonVoltarHandler implements AcionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
				}
	}
	
}
