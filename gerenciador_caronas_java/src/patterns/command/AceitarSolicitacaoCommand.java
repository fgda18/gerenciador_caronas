package patterns.command;

import model.Solicitacao;
import dao.SolicitacaoDAO;

public class AceitarSolicitacaoCommand implements Command {

    private final Solicitacao s;
    private final SolicitacaoDAO dao;

    public AceitarSolicitacaoCommand(Solicitacao s, SolicitacaoDAO dao) {
        this.s = s;
        this.dao = dao;
    }

    public void executar() {
        s.aceitar();
        dao.atualizar(s);
    }
}
