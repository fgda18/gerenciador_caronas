package model;

import java.time.LocalDateTime;

public class Solicitacao {

    private Long id;
    private Carona carona;
    private Usuario passageiro;
    private LocalDateTime dataSolicitacao;
    private StatusSolicitacao status = StatusSolicitacao.PENDENTE;

    public void aceitar() {
        if (status != StatusSolicitacao.PENDENTE) {
            throw new IllegalStateException("Solicitação inválida");
        }
        carona.adicionarPassageiro();
        status = StatusSolicitacao.ACEITA;
    }

    public void recusar() {
        if (status == StatusSolicitacao.PENDENTE) {
            status = StatusSolicitacao.RECUSADA;
        }
    }

    public void cancelar() {
        if (status == StatusSolicitacao.ACEITA) {
            carona.removerPassageiro();
        }
        status = StatusSolicitacao.CANCELADA;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long v) {
        id = v;
    }

    public Carona getCarona() {
        return carona;
    }

    public void setCarona(Carona v) {
        carona = v;
    }

    public Usuario getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Usuario v) {
        passageiro = v;
    }

    public StatusSolicitacao getStatus() {
        return status;
    }
}
