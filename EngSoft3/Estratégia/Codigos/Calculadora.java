public class Calculadora {
  
  private Operacao operacao;
  
  public setOperacao(Operacao operacao){
    this.operacao = operacao;
  }
  
  public double calcular(double a, double b){
    return this.operacao.calcular(a, b);
  }
  
}
