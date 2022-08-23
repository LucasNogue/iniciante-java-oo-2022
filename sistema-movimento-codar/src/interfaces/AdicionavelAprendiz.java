package interfaces;
import model.Duvida;
import model.Resultado;

public interface AdicionavelAprendiz {
    void adicionarDuvida(Duvida duvida);
    void adicionarResultado(Resultado resultado);
}