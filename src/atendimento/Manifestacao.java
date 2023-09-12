package atendimento;

public class Manifestacao {
	private int codigo;
	private int tipo;
	private String titulo;
	private String descricao;
	public Manifestacao(int codigo, int tipo, String titulo, String descricao) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public Manifestacao(int tipo, String titulo, String descricao) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
