package refactoredCode;

public class Fogo extends Situacao {


	public Fogo(long pontuacao) {
		super(pontuacao, SituacaoEnum.FOGO);
	}

	@Override
	public Acoes pegarCogumelo() {
		return new Fogo(this.getPontuacao() + 1000);
	}

	@Override
	public Acoes levarDano() {
		return new Grande(this.getPontuacao());
	}

	@Override
	public Acoes pegarFlor() {
		return new Fogo(this.getPontuacao() + 1000);
	}

}
