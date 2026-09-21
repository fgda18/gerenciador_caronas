package patterns.command;

import model.Solicitacao;
import dao.SolicitacaoDAO;

public class CancelarSolicitacaoCommand implements Command {

    private final Solicitacao s;
    private final SolicitacaoDAO dao;

    public CancelarSolicitacaoCommand(Solicitacao s, SolicitacaoDAO dao) {
        this.s = s;
        this.dao = dao;
    }

    public void executar() {
        s.cancelar();
        dao.atualizar(s);
    }
}
