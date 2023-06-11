public class View implements Observer{
  private Cafe cafeGratis;
  private List<Bolo> bolos;
  
  public void setCafeGratis(Cafe c){
    this.cafeGratis = c;
  }
  
  public void update(List<Bolo> l){
    this.bolos = l;
  }
  
}
