package refactoredCode;

public class Pequeno extends Situacao{

	public Pequeno(long pontuacao) {
		super(pontuacao, SituacaoEnum.PEQUENO);
	}

	@Override
	public Acoes pegarCogumelo() {
		return new Grande(this.getPontuacao());
	}

	@Override
	public Acoes levarDano() {
		throw new RuntimeException("Mario morreu");
	}

	@Override
	public Acoes pegarFlor() {
		return new Fogo(this.getPontuacao());
	}

}
