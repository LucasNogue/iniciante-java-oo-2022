package model;
import abstracts.Gerenciador;
import interfaces.AdicionavelMentor;

public class Mentor extends Gerenciador implements AdicionavelMentor {
    public Mentor(String nome, String sobrenome, String cargo) {
        super(nome, sobrenome, cargo);
    }

    public void adicionarDesafio(Desafio desafio) {
        listaDesafio.add(desafio);
    }

}


