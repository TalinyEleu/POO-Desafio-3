import java.io.Serializable; // Essa biblioteca Serializable permite que seja exportado o estado atual do objeto em arquivo binário

public class EstoqueDeProdutos implements Serializable {
	private int codigo;
	private String nome;
	private int quantidade;
	
	//Construtor padrão
 	public EstoqueDeProdutos () {}  
 	 	
 	//Construtor com todos os atributos como parâmetro
 	public EstoqueDeProdutos (int codigo, String nome, int quantidade) {
 		this.codigo = codigo;
 		this.nome = nome;
 		this.quantidade = quantidade;
 	} 
 	
 	

}

