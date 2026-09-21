package dao;

import model.Solicitacao;
import java.util.*;

public class SolicitacaoDAO implements DAO<Solicitacao> {

    private final Map<Long, Solicitacao> dados = new HashMap<>();

    public void salvar(Solicitacao e) {
        dados.put(e.getId(), e);
    }

    public Solicitacao buscarPorId(Long id) {
        return dados.get(id);
    }

    public void atualizar(Solicitacao e) {
        dados.put(e.getId(), e);
    }

    public void remover(Long id) {
        dados.remove(id);
    }

    public List<Solicitacao> listar() {
        return new ArrayList<>(dados.values());
    }
}
