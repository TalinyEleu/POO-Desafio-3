package model;


//CURSO: GRADS | STDC
//UC: GR POO - 2025/2 - 35761 - Programação Orientada a Objetos
//DESAFIO: 3 Gerenciamento de Estoque
//GRUPO: Nº 16
//INTEGRANTES:(Nataliny Eleutério da Silva / Jessé Oliveira de Jesus)
//Arquivo: classe java para gestao de arquivos.


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

import model.entidade.Produto;

import java.io.ObjectOutputStream;

//import java

public class ArquivoUtils {
//DEFINICAO DE CONSTANTES PARA OS NOMES DE ARQUIVOS
		private static final String NOME_ARQUIVO_TXT = "ESTOQUE.TXT";
		private static final String NOME_ARQUIVO_BINARIO = "ESTOQUE.BIN";
		
		public static void salvarTxt(Produto produto) {
			FileWriter fileWriter = null;
			try {
				File file = new File(NOME_ARQUIVO_TXT);
				fileWriter = new FileWriter(file, true);
				String valorParaSalvar = produto.getNome() + "##" + produto.getQuantidadeEstoque()  + "\n";
				fileWriter.write(valorParaSalvar);
			} catch (Exception e) {
				//JOptionPane.showmMessageDialog(null, "Dados lançados no arquivo");
		       //	throw new IllegalArgumentException("Nome inválido ou não informado");
		       	throw new Error("não foi possivel salvar o arquivo" + NOME_ARQUIVO_TXT);
			} finally {
				try {
					if (fileWriter != null) {
						fileWriter.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
					throw new Error("erro apos salvar o arquivo" + NOME_ARQUIVO_TXT);

				}
				
			}
	}
	
		public static void salvarBinario(Produto produto) {
			//serializador de salvamento binario
			OutputStream outputStream =null;
			ObjectOutputStream  objectStream = null;
			
			try {
				File file = new File(NOME_ARQUIVO_BINARIO);
				outputStream = new FileOutputStream(file);
				objectStream = new ObjectOutputStream(outputStream);
				objectStream.writeObject(produto);
			} catch (Exception e3) {
				// TODO: handle exception
				throw new Error("erro ao salvar o arquivo" + NOME_ARQUIVO_BINARIO);
			} finally {
				try {
					if (objectStream != null) {
						objectStream.close();
					}
					if (outputStream != null) {
						outputStream.close();
					}
				} catch (Exception e4) {
					// TODO: handle exception
					throw new Error("erro apos fechar o arquivo" + NOME_ARQUIVO_BINARIO);
				 }

			}
					
		}
}