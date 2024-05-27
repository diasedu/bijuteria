package entity;

public class Bijuteria {
    private int id_biju;
    private String nm_biju;
    private Double preco_biju;
    private String estoque_biju;
    private String dt_inclusao;
    private String dt_modificacao;

    public int getId_biju() {
        return id_biju;
    }

    public void setId_biju(int id_biju) {
        this.id_biju = id_biju;
    }

    public String getNm_biju() {
        return nm_biju;
    }

    public void setNm_biju(String nm_biju) {
        this.nm_biju = nm_biju;
    }

    public Double getPreco_biju() {
        return preco_biju;
    }

    public void setPreco_biju(Double preco_biju) {
        this.preco_biju = preco_biju;
    }

    public String getEstoque_biju() {
        return estoque_biju;
    }

    public void setEstoque_biju(String estoque_biju) {
        this.estoque_biju = estoque_biju;
    }

    public String getDt_inclusao() {
        return dt_inclusao;
    }

    public void setDt_inclusao(String dt_inclusao) {
        this.dt_inclusao = dt_inclusao;
    }

    public String getDt_modificacao() {
        return dt_modificacao;
    }

    public void setDt_modificacao(String dt_modificacao) {
        this.dt_modificacao = dt_modificacao;
    }
}

