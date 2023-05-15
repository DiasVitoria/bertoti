import java.util.List;

public class Calculadora {
  
  private Operacao operacao;
  private List<double> lista;
  
  public setOperacao(Operacao operacao){
    this.operacao = operacao;
  }  

  public setNumeros(List<double> lista){
    this.lista = lista;
  }
  
  public double calcular(){
    return this.operacao.calcular(this.lista);
  }
  
}
