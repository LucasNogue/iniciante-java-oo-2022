package model;
import abstracts.Evento;
import abstracts.Gerenciador;

public class Reuniao extends Evento {
    public Reuniao(Gerenciador criador, String titulo, String descricao) {
        super(criador, titulo, descricao);
    }
}