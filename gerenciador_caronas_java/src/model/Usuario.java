package model;

public class Usuario {

    private Long id;
    private String nome, email, telefone, senha;

    public Long getId() {
        return id;
    }

    public void setId(Long v) {
        id = v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String v) {
        nome = v;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String v) {
        email = v;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String v) {
        telefone = v;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String v) {
        senha = v;
    }
}
