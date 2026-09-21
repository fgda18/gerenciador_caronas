package dao;

import java.util.List;

public interface DAO<T> {

    void salvar(T e);

    T buscarPorId(Long id);

    void atualizar(T e);

    void remover(Long id);

    List<T> listar();
}
