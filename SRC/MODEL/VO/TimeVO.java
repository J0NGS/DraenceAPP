package MODEL.VO;

public class TimeVO {
    private Long Id_time;
    public String nome;
    public Integer anoFund;
    public String cidade;

    //GETTERS E SETTERS


    public Long getId_time() {
        return this.Id_time;
    }

    public void setId_time(Long Id_time) {
        this.Id_time = Id_time;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoFund() {
        return this.anoFund;
    }

    public void setAnoFund(Integer anoFund) {
        this.anoFund = anoFund;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
