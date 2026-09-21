package dao;

import model.Carona;
import java.util.*;

public class CaronaDAO implements DAO<Carona> {

    private final Map<Long, Carona> dados = new HashMap<>();

    public void salvar(Carona e) {
        dados.put(e.getId(), e);
    }

    public Carona buscarPorId(Long id) {
        return dados.get(id);
    }

    public void atualizar(Carona e) {
        dados.put(e.getId(), e);
    }

    public void remover(Long id) {
        dados.remove(id);
    }

    public List<Carona> listar() {
        return new ArrayList<>(dados.values());
    }
}
