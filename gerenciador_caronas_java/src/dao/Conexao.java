package dao;

import java.sql.*;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/gerenciador_caronas";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
