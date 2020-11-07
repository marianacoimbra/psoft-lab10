package refactoredCode;


public interface Acoes {
	public Acoes pegarCogumelo();
//		if (situacao == SituacaoMario.MARIO_PEQUENO) {
//			situacao = SituacaoMario.MARIO_GRANDE;
//		} else if (situacao == SituacaoMario.MARIO_GRANDE || situacao == SituacaoMario.MARIO_FOGO) {
//			pontuacao+=1000;
//		}
	
	public Acoes levarDano();
//		if (situacao == SituacaoMario.MARIO_PEQUENO) {
//			throw new Exception("Mario morreu.");
//		} else if (situacao == SituacaoMario.MARIO_GRANDE) {
//			situacao = SituacaoMario.MARIO_PEQUENO;
//		}else if (situacao == SituacaoMario.MARIO_FOGO) {
//			situacao = SituacaoMario.MARIO_GRANDE;
//		}
	
	public Acoes pegarFlor();
//		if (situacao == SituacaoMario.MARIO_PEQUENO || situacao == SituacaoMario.MARIO_GRANDE) {
//			situacao = SituacaoMario.MARIO_FOGO;
//		} else if (situacao == SituacaoMario.MARIO_FOGO) {
//			pontuacao+=1000;
//		}
//	}
}

