package abstracts;

import abstracts.MovimentoCodar;

public abstract class Participante extends MovimentoCodar {
    private String nome;
    private String sobrenome;

    public Participante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void getListaDeDuvida() {
        System.out.println("-------------Dúvidas---------------");
        for (int i = 0; i < listaDuvida.size(); i++) {
            System.out.println("titulo: " + listaDuvida.get(i).getTitulo());
            System.out.println("descrição: " + listaDuvida.get(i).getDescricao());
            System.out.println("------------------------------------");
        }
    }

    public void getListaDeResultado() {
        System.out.println("-----Resultados compartilhados------");
        for (int i = 0; i < listaResultado.size(); i++) {
            System.out.println("titulo: " + listaResultado.get(i).getTitulo());
            System.out.println("descrição: " + listaResultado.get(i).getDescricao());
            System.out.println("--------------------------------------");
        }
    }

    public void getListaDeDesafio() {
        System.out.println("---------Desafios criados-----------");
        for (int i = 0; i < listaDesafio.size(); i++) {
            System.out.println("titulo: " + listaDesafio.get(i).getTitulo());
            System.out.println("descrição: " + listaDesafio.get(i).getDescricao());
            System.out.println("------------------------------------");
        }
    }

    public void getListaDeReuniao() {
        System.out.println("---------Reuniões marcadas---------");
        for (int i = 0; i < listaReuniao.size(); i++) {
            System.out.println("titulo: " + listaReuniao.get(i).getTitulo());
            System.out.println("descrição: " + listaReuniao.get(i).getDescricao());
            System.out.println("------------------------------------");
        }
    }

}
