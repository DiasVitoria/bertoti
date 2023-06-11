public class CafeExpresso implements Cafe{
  private View view;
  private Padaria padaria;
  
  public void ganharCafe(){
    System.out.println("Você ganhou um café expresso ao comprar um bolo!");
  }
  
  public void setView(View v){
    this.view = v;
  }
  
}
