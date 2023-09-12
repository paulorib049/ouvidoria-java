package atendimento;

import java.util.ArrayList;

public class Ouvidoria {
	private String curso;
	private int matricula;
	private String nome;
	
	private ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();
	private ArrayList<Manifestacao> reclamacoes = new ArrayList<Manifestacao>();
	private ArrayList<Manifestacao> sugestoes = new ArrayList<Manifestacao>();
	private ArrayList<Manifestacao> elogios = new ArrayList<Manifestacao>();
	
	
		public ArrayList<Manifestacao> getReclamacoes() {
		return reclamacoes;
	}

	public void setReclamacoes(ArrayList<Manifestacao> reclamacoes) {
		this.reclamacoes = reclamacoes;
	}

	public ArrayList<Manifestacao> getSugestoes() {
		return sugestoes;
	}

	public void setSugestoes(ArrayList<Manifestacao> sugestoes) {
		this.sugestoes = sugestoes;
	}

	public ArrayList<Manifestacao> getElogios() {
		return elogios;
	}

	public void setElogios(ArrayList<Manifestacao> elogios) {
		this.elogios = elogios;
	}

		public ArrayList<Manifestacao> getManifestacoes() {
		return manifestacoes;
	}

	public void setManifestacoes(ArrayList<Manifestacao> manifestacoes) {
		this.manifestacoes = manifestacoes;
	}

		public Ouvidoria() {
		super();
	}

		public Ouvidoria(String curso, int matricula, String nome) {
		super();
		this.curso = curso;
		this.matricula = matricula;
		this.nome = nome;
	}
		
		public void adicionarReclamacao(Manifestacao novaManifestacao) {
			reclamacoes.add(novaManifestacao);}
		
		public void adicionarElogio(Manifestacao novaManifestacao) {
			elogios.add(novaManifestacao);}
		
		public void adicionarSugestao(Manifestacao novaManifestacao) {
			sugestoes.add(novaManifestacao);}
	
	public void criarManifestacoes(Manifestacao novaManifestacao) {
		manifestacoes.add(novaManifestacao);
	}
	public void listarManifestacoes() {
		for(Manifestacao manifestacao : manifestacoes) {
			System.out.printf(
			"Código: " + manifestacao.getCodigo() + "%n" + 
			"Tipo:" + manifestacao.getTipo() + "%n" +  
			"Título: " + manifestacao.getTitulo() + "%n" + 
			"Descricao: " + manifestacao.getDescricao() + "%n");
		}
	}
	public void listarReclamacoes() {
		for(Manifestacao manifestacao : reclamacoes) {
			System.out.printf(
			"Código: " + manifestacao.getCodigo() + "%n" + 
			"Tipo:" + manifestacao.getTipo() + "%n" +  
			"Título: " + manifestacao.getTitulo() + "%n" + 
			"Descricao: " + manifestacao.getDescricao() + "%n"); }}
	public void listarElogios() {
		for(Manifestacao manifestacao : elogios) {
			System.out.printf(
			"Código: " + manifestacao.getCodigo() + "%n" + 
			"Tipo:" + manifestacao.getTipo() + "%n" +  
			"Título: " + manifestacao.getTitulo() + "%n" + 
			"Descricao: " + manifestacao.getDescricao() + "%n"); }}
	public void listarSugestoes() {
		for(Manifestacao manifestacao : sugestoes) {
			System.out.printf(
			"Código: " + manifestacao.getCodigo() + "%n" + 
			"Tipo:" + manifestacao.getTipo() + "%n" +  
			"Título: " + manifestacao.getTitulo() + "%n" + 
			"Descricao: " + manifestacao.getDescricao() + "%n"); }}
	
	public Manifestacao pesquisarManifestacoes(int codigo){
	return manifestacoes.get(codigo - 1);
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
