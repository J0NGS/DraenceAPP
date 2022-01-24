package MODEL.VO;

public class EstadioVO {
    public String nome;
    public String cidade;
    public Integer capacidade;
    public Long dono;
    private Long Id_estadio;

    
    //GETTERS E SETTERS


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Long getDono() {
        return this.dono;
    }

    public void setDono(Long dono) {
        this.dono = dono;
    }

    public Long getId_estadio() {
        return this.Id_estadio;
    }

    public void setId_estadio(Long Id_estadio) {
        this.Id_estadio = Id_estadio;
    }

}
