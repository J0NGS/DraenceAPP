package MODEL.VO;

public class PlantelVO {
    public Integer quantJogadores;
    public Long jogadores[] = new Long[quantJogadores];
    private Long time;


    //GETTERS E SETTERS



    public Integer getQuantJogadores() {
        return this.quantJogadores;
    }

    public void setQuantJogadores(Integer quantJogadores) {
        this.quantJogadores = quantJogadores;
    }

    public Long getJogadores(int jogador){
        return this.jogadores[jogador];
    }

    public void setJogadores(Long jogadores) {
        this.jogadores[];
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    
}
