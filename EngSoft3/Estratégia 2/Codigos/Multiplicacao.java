import java.util.List;

public class Multiplicacao implements OperacaoMatematica {
  
  public double calcular(List<double> lista){
    double resultado = 0;

    lista.stream().forEach((k) -> {
      resultado = resultado * k;
    })

    return resultado;
  }
  
}
