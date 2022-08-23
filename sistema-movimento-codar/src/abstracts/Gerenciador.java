package abstracts;
import model.Reuniao;

public abstract class Gerenciador extends Participante {

   private String cargo;

   public Gerenciador(String nome, String sobrenome, String cargo) {
      super(nome, sobrenome);
      this.cargo = cargo;
   }

   public String getCargo() {
      return cargo;
   }

   public void adicionarReuniao(Reuniao reuniao) {
      MovimentoCodar.listaReuniao.add(reuniao);
   }

}