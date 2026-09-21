package model;

import java.time.*;
import java.util.*;

public class Carona {

    private Long id;
    private Usuario motorista;
    private String origem, destino;
    private LocalDate data;
    private LocalTime horario;
    private int vagasTotais, vagasDisponiveis;
    private double valorPorPessoa;
    private StatusCarona status;
    private List<MetodoPagamento> metodosPagamento = new ArrayList<>();

    public void adicionarPassageiro() {
        if (vagasDisponiveis <= 0) {
            throw new IllegalStateException("Carona lotada");
        }
        vagasDisponiveis--;
        if (vagasDisponiveis == 0) {
            status = StatusCarona.LOTADA;
        }
    }

    public void removerPassageiro() {
        if (vagasDisponiveis < vagasTotais) {
            vagasDisponiveis++;
        }
        if (status == StatusCarona.LOTADA) {
            status = StatusCarona.DISPONIVEL;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long v) {
        id = v;
    }

    public Usuario getMotorista() {
        return motorista;
    }

    public void setMotorista(Usuario v) {
        motorista = v;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String v) {
        origem = v;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String v) {
        destino = v;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate v) {
        data = v;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime v) {
        horario = v;
    }

    public int getVagasTotais() {
        return vagasTotais;
    }

    public void setVagasTotais(int v) {
        vagasTotais = v;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int v) {
        vagasDisponiveis = v;
    }

    public double getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void setValorPorPessoa(double v) {
        valorPorPessoa = v;
    }

    public StatusCarona getStatus() {
        return status;
    }

    public void setStatus(StatusCarona v) {
        status = v;
    }

    public List<MetodoPagamento> getMetodosPagamento() {
        return metodosPagamento;
    }
}
