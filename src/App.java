import entity.Bijuteria;
import DAO.BijuteriaDAO;

public class App {
    public static void main(String[] args) throws Exception {
        Bijuteria u = new Bijuteria();
        u.setNm_biju("Teste");
        u.setDt_inclusao("02/12/2024");
        u.setPreco_biju(20.00);
        u.setEstoque_biju("S");

        new BijuteriaDAO().cadastrar(u);
    }
}
