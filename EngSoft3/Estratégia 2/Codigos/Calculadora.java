import java.util.List;

public class Calculadora {
  
  private Operacao operacao;
  private List<double> lista;
  
  public void setOperacao(Operacao operacao){
    this.operacao = operacao;
  }  

  public void setNumeros(List<double> lista){
    this.lista = lista;
  }
  
  public double calcular(){
    return this.operacao.calcular(this.lista);
  }
  
}
