package model;
import abstracts.Participante;
import interfaces.AdicionavelAprendiz;

public class Aprendiz extends Participante implements AdicionavelAprendiz {
    public Aprendiz(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    @Override
    public void adicionarDuvida(Duvida duvida) {
        listaDuvida.add(duvida);
    }

    @Override
    public void adicionarResultado(Resultado resultado) {
        listaResultado.add(resultado);
    }
}