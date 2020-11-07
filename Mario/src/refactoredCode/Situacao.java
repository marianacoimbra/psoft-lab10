package refactoredCode;

public abstract class Situacao implements Acoes {
	public SituacaoEnum situacao;
	public long pontuacao;

	
	public Situacao(long pontuacao, SituacaoEnum situacao) {
		this.pontuacao = pontuacao;
		this.situacao = situacao;
	}
	
	public long getPontuacao() {
		return this.pontuacao;
	}
	
	public SituacaoEnum getSituacao() {
		return this.situacao;
	}
	
}
