package estoque;


//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe java pra exibição da tela inicial do app

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaInicial  extends JFrame {

		private JPanel panel;
		
		public TelaInicial() {
			setTitle("Sistema de Gestão de Estoque");
			setLayout(new FlowLayout());
			
			this.panel = new JPanel();
			this.panel.setLayout(new FlowLayout());
			this.panel.setPreferredSize(new Dimension(500, 800));
			add(this.panel);
			
			//criando botoes na interface
			criarBotao("Cadastrar", new ButtonCadastrarHandler());
			criarBotao("Listar", new ButtonListarHandler());
			criarBotao("Excluir", new ButtonExcluirrHandler());
			criarBotao("Exportar", new ButtonExportarHandler());
			criarBotao("Sair", new ButtonSairHandler());
			
			
			setSize(new Dimension(500, 800));
			setPreferredSize(new Dimension(500, 800));
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			
	}
		private void criarBotao(String label, ActionListener handler) {
			JButton button = new JButton(label);
			button.addActionListener(handler);
			button.setPreferredSize(new Dimension(300, 80));
			this.panel.add(button);
		}

    /* ================================
              HANDLERS DOS BOTÕES
       ================================  */
		
		private class ButtonCadastrarHandler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Cadastro();
			}
		}
				
		private class ButtonListarHandler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Listagem();
			}
		}
		
		private class ButtonExcluirrHandler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Excluir();
			}
		}
		
		private class ButtonExportarHandler implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Exportar();
			}
		}
		
		private class ButtonSairHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}	
}
	

