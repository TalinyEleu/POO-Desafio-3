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
 	
 	//Métodos getters e setters dos atributos codigo, nome e quantidade
 	public int getCodigo() {
 		return codigo;
 	}
 	
 	public void setCodigo(int codigo) {
 		this.codigo = codigo;
 	}
 	
 	public String getNome() {
 		return nome;
 	}
 	
 	public void setNome(String nome) { 
 		this.nome = nome;
 	}
 	
 	public int getQuantidade() {
 		return quantidade;
 	}
 	
 	public void setQuantidade(int quantidade) {
 		this.quantidade = quantidade;
 	}

}

