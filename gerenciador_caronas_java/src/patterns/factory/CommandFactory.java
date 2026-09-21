package patterns.factory;

import model.Solicitacao;
import dao.SolicitacaoDAO;
import patterns.command.*;

public class CommandFactory {

    public static Command criar(String tipo, Solicitacao s, SolicitacaoDAO dao) {
        if (tipo.equalsIgnoreCase("ACEITAR")) {
            return new AceitarSolicitacaoCommand(s, dao);
        }
        if (tipo.equalsIgnoreCase("CANCELAR")) {
            return new CancelarSolicitacaoCommand(s, dao);
        }
        throw new IllegalArgumentException("Comando desconhecido");
    }
}
