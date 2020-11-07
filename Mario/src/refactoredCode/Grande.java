package refactoredCode;

public class Grande extends Situacao {

	public Grande(long pontuacao) {
		super(pontuacao, SituacaoEnum.GRANDE);
	}

	@Override
	public Acoes pegarCogumelo() {
		return new Grande(this.getPontuacao() + 1000);
	}

	@Override
	public Acoes levarDano() {
		return new Pequeno(this.getPontuacao());
	}

	@Override
	public Acoes pegarFlor() {
		return new Fogo(this.getPontuacao());
	}

}
