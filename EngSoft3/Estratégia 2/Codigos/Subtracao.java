import java.util.List;

public class Subtracao implements OperacaoMatematica {
  
  public double calcular(List<double> lista){
    double resultado = 0;
    if(lista.size() > 0){
      resultado = lista.get(0);
    }

    lista.stream().forEach((k) -> {
      resultado -= k;
    });

    return resultado;
  }
  
}
