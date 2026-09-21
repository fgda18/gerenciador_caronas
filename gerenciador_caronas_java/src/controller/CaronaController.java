package controller;

import model.*;
import dao.*;
import patterns.builder.CaronaBuilder;
import patterns.factory.CommandFactory;
import java.time.*;

public class CaronaController {

    private final CaronaDAO caronaDAO = new CaronaDAO();
    private final SolicitacaoDAO solicitacaoDAO = new SolicitacaoDAO();

    public Carona cadastrarCarona(Usuario u, String origem, String destino, LocalDate data, LocalTime hora, int vagas, double valor, MetodoPagamento pagamento) {
        Carona c = new CaronaBuilder().motorista(u).origem(origem).destino(destino).data(data).horario(hora).vagas(vagas).valor(valor).pagamento(pagamento).build();
        caronaDAO.salvar(c);
        return c;
    }

    public void aceitarSolicitacao(Long id) {
        Solicitacao s = solicitacaoDAO.buscarPorId(id);
        CommandFactory.criar("ACEITAR", s, solicitacaoDAO).executar();
        caronaDAO.atualizar(s.getCarona());
    }

    public void cancelarSolicitacao(Long id) {
        Solicitacao s = solicitacaoDAO.buscarPorId(id);
        CommandFactory.criar("CANCELAR", s, solicitacaoDAO).executar();
        caronaDAO.atualizar(s.getCarona());
    }
}
