package patterns.builder;

import model.*;
import java.time.*;

public class CaronaBuilder {

    private final Carona c = new Carona();

    public CaronaBuilder motorista(Usuario v) {
        c.setMotorista(v);
        return this;
    }

    public CaronaBuilder origem(String v) {
        c.setOrigem(v);
        return this;
    }

    public CaronaBuilder destino(String v) {
        c.setDestino(v);
        return this;
    }

    public CaronaBuilder data(LocalDate v) {
        c.setData(v);
        return this;
    }

    public CaronaBuilder horario(LocalTime v) {
        c.setHorario(v);
        return this;
    }

    public CaronaBuilder vagas(int v) {
        c.setVagasTotais(v);
        c.setVagasDisponiveis(v);
        c.setStatus(v > 0 ? StatusCarona.DISPONIVEL : StatusCarona.LOTADA);
        return this;
    }

    public CaronaBuilder valor(double v) {
        c.setValorPorPessoa(v);
        return this;
    }

    public CaronaBuilder pagamento(MetodoPagamento v) {
        c.getMetodosPagamento().add(v);
        return this;
    }

    public Carona build() {
        return c;
    }
}
