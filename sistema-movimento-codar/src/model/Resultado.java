package model;
import abstracts.Evento;

public class Resultado extends Evento {

    public Resultado(Aprendiz criador, String titulo, String descricao) {
        super(criador, titulo, descricao);
    }
}
