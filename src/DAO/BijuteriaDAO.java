package DAO;

import entity.Bijuteria;
import conexao.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BijuteriaDAO {
    public void cadastrar( Bijuteria usuario ) {
        String sql = """
            INSERT INTO usuario (
                id_biju,
                nm_biju,
                preco_biju,
                estoque_biju,
                dt_inclusao
            ) VALUES (
                SELECT max(id_biju) FROM bijuteria,
                ?,
                ?,
                ?,
                ?
            )
        """;

        PreparedStatement ps = null;

        try {
            ps = Conectar.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNm_biju());
            ps.setDouble(2, usuario.getPreco_biju());
            ps.setString(3, usuario.getEstoque_biju());
            ps.setString(4, usuario.getDt_inclusao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
