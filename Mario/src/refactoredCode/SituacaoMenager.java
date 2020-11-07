package refactoredCode;

public class SituacaoMenager {

	private Acoes situacao;

	public SituacaoMenager() {
		this.situacao = new Pequeno(0);
	}

	public void pegarCogumelo() {
		this.situacao = this.situacao.pegarCogumelo();
	}

	public void levarDano() {
		this.situacao = this.situacao.levarDano();
	}

	public void pegarFlor() {
		this.situacao = this.situacao.pegarFlor();
	}

}
