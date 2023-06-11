public class Bolo{
  private String sabor;
  private double preco;
  
  public Produto(String nome, double preco){
    this.sabor = nome;
    this.preco = preco;
  }
  
  public String getSabor(){
    return this.sabor;
  }
  
  public double getPreco(){
    return this.preco;
  }
  
}
