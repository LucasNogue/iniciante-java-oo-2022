import model.*;

public class Main {
    public static void main(String[] args) {

        //CRIANDO APRENDIZES, MENTORES E ORGANIZADORES
        Aprendiz lucas = new Aprendiz("Lucas","Nogueira");
        Aprendiz giulio = new Aprendiz("Giulio","Bernadi");
        Mentor gabriel = new Mentor("Gabriel","Cestaro", "Desenvolvedor");
        Mentor vinicius = new Mentor("Vinicius","Ueda", "Desenvolvedor");
        Mentor eduardo = new Mentor("Eduardo", "Branquinho", "Desenvolvedor");
        Mentor camila = new Mentor("Camila", "Maejima", "Desenvolvedora");
        Mentor ismael = new Mentor("Ismael", "Costa", "Desenvolvedor");

        Organizador jessica = new Organizador("Jessica", "Cestaro", "RH");

        //ADICIONANDO E EXIBINDO REUNIÕES
        Reuniao primeiraReuniao = new Reuniao(gabriel, "Curiosidades do Java", "Iremos debater sobre as curiosidade do java");
        Reuniao segundaReuniao = new Reuniao(gabriel, "Novidades da nova versão do Java", "Será apresentado as novidades");
        gabriel.adicionarReuniao(primeiraReuniao);
        gabriel.adicionarReuniao(segundaReuniao);
        jessica.getListaDeReuniao();

        //ADICIONANDO E EXIBINDO DÚVIDAS
        Duvida duvidaPoo = new Duvida(lucas, "O que é um método em POO?", "Quando utilizar método?");
        Duvida duvidaCss  = new Duvida(giulio, "ID no CSS", "Como funciona ID no CSS?");
        lucas.adicionarDuvida(duvidaPoo);
        lucas.adicionarDuvida(duvidaCss);
        lucas.getListaDeDuvida();

        //ADICIONADO E EXIBINDO DESAFIOS
        Desafio desafioFront = new Desafio(vinicius, "Desafio FrontEnd", "Criar uma página com CSS e HTML");
        Desafio desafioBack = new Desafio(gabriel, "Desafio BackEnd", "Criar uma aplicação Java");
        vinicius.adicionarDesafio(desafioFront);
        gabriel.adicionarDesafio(desafioBack);
        vinicius.getListaDeDesafio();

        //ADICIONANDO E EXIBINDO RESULTADOS
        Resultado resultadoFront = new Resultado(giulio, "Resultado do desafio FrontEnd", "Projeto do desafio FrontEnd");
        Resultado resultadoBack = new Resultado(lucas, "Resultado do desafio BackEnd", "Projeto do desafio BanckEnd");
        giulio.adicionarResultado(resultadoFront);
        lucas.adicionarResultado(resultadoBack);
        giulio.getListaDeResultado();

    }

}

