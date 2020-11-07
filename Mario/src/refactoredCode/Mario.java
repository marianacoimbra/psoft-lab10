package refactoredCode;

import code.SituacaoMario;

public class Mario {
	private SituacaoMenager situacao;

	public Mario() {
		this.situacao = new SituacaoMenager();
	}

	public void pegarCogumelo() {
		this.situacao.pegarCogumelo();
	}

	public void levarDano() {
		this.situacao.levarDano();
	}

	public void pegarFlor() {
		this.situacao.pegarFlor();
	}

}
