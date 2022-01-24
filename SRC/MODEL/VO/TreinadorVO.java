package MODEL.VO;

public class TreinadorVO extends UsuarioVO {
    public int idade;
    private Long id_treinador;

    
    //GETTERS E SETTERS


    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Long getId_treinador() {
        return this.id_treinador;
    }

    public void setId_treinador(Long id_treinador) {
        this.id_treinador = id_treinador;
    }
}
