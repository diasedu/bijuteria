package conexao;

import java.sql.*;

public class Conectar {
    private static final String url = "jdbc:mysql://localhost:3306/bijuteria";
    private static final String usuario = "bijuteria";
    private static final String senha = "bijuteria";

    private static Connection conn;

    public static Connection getConexao() {
        conn = null;
        try {
            if ( conn == null ) {
                conn = DriverManager.getConnection(url, usuario, senha);
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return conn;
    }
    
}