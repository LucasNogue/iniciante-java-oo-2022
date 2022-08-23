package model;
import abstracts.Evento;
import abstracts.Participante;

public class Duvida extends Evento {
    public Duvida(Participante criador, String titulo, String descricao) {
        super(criador, titulo, descricao);
    }
}