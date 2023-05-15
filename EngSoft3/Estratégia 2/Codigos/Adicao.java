import java.util.List;

public class Adicao implements OperacaoMatematica {
  
  public double calcular(List<double> lista){
    double resultado = 0;

    lista.stream().forEach((k) -> {
      resultado += k;
    });

    return resultado;
  }
}
