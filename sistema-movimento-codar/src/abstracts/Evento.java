package abstracts;

public abstract class Evento extends MovimentoCodar {

    private String criador;
    public String titulo;
    private String descricao;

    public Evento(Participante criador, String titulo, String descricao) {
        this.criador = criador.getNome();
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCriador() {
        return this.criador;
    }

}
