package model;
import abstracts.Evento;
import abstracts.Gerenciador;

public class Desafio extends Evento {
    public Desafio(Gerenciador criador, String titulo, String descricao) {
        super(criador, titulo, descricao);
    }
}
