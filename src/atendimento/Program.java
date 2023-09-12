package atendimento;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		System.out.println("seja bem vindo ao Racha PR");
		Manifestacao manifestacao1 = new Manifestacao(1 , 1, "jogador ruim" , "não sabe chutar nem correr" );
		Ouvidoria comentario = new Ouvidoria();
		int opcao = 3;
		while (opcao != 5) {

			String respostaString = JOptionPane.showInputDialog("Digite: 1-listar comentarios sobre os jogadores, 2-inserir um novo comentario, 3-pesquisar por codigo de comentario, 4-listar por tipo ou 5- sair ");
			opcao = Integer.parseInt(respostaString);

			if (opcao == 1) {
				comentario.listarManifestacoes();
			} else if (opcao == 2) {

				respostaString = JOptionPane.showInputDialog("Digite 1 para reclamação sobre o jogador, 2 para elogio ou 3 para sugestão: ");
				int tipo = Integer.parseInt(respostaString);
				
				String titulo = JOptionPane.showInputDialog("Digite o titulo do comentario: ");
				
				String descricao = JOptionPane.showInputDialog("Digite a descrição do comentario: ");

				Manifestacao novaManifestacao = new Manifestacao(tipo, titulo, descricao);
				comentario.criarManifestacoes(novaManifestacao);
				
				if (tipo == 1) {
					comentario.adicionarReclamacao(novaManifestacao);
				}
				else if (tipo == 2) {
					comentario.adicionarElogio(novaManifestacao);
				}
				else if (tipo == 3) {
					comentario.adicionarSugestao(novaManifestacao);
				}
				else {
					JOptionPane.showInputDialog(null , "opção inválida");
				}

			} else if (opcao == 3) {
				
				respostaString = JOptionPane.showInputDialog("Digite o codigo: ");
				int codigo = Integer.parseInt(respostaString);
				
				Manifestacao contaPesquisada = comentario.pesquisarManifestacoes(codigo);
				
				
				System.out.println(
						"O código da conta pesquisada é: " + codigo + 
						". O tipo do comentario é: " + contaPesquisada.getTipo() + 
						". O titulo do comentario é: " + contaPesquisada.getTitulo() + 
						". A descrição é: " + contaPesquisada.getDescricao());} 
		
		else if (opcao == 4) {
			int opcaot = 4;
			String respostaString2 = JOptionPane.showInputDialog("Digite 1 para listar reclamções \n2 para listar elogios \n 3 para listar sugestões: ");
			opcaot = Integer.parseInt(respostaString2);
			if (opcaot == 1) {
				comentario.listarReclamacoes();
				}
			else if (opcaot == 2) {
				comentario.listarElogios();
			}
			else if (opcaot == 3) {
				comentario.listarSugestoes();
			}
			else {
				JOptionPane.showMessageDialog(null, "opção inválida");
			}
		}}
		if (opcao == 5) {
			JOptionPane.showMessageDialog(null, "Obrigado por usar o racha PR!");
		}
			
		
		
		
		

	}

}
