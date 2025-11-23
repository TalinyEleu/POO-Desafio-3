import java.io.Serializable; // Essa biblioteca Serializable permite que a exportação de bináro

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
