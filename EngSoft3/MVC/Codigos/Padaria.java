public class Padaria implements Subject{
  private List<Bolo> bolos;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Bolo> l){
    this.observers.stream().forEach(ob -> {
      System.out.println("Novos bolos adicionados:");
      l.stream().forEach(p -> {
        System.out.println(". " + p.getSabor());
      });
    });
  }
  
  public void addBolo(Bolo p){
    this.bolos.add(p);
  }
 
  public Bolo buscarBolo(String nome){
    return this.bolos.stream().filter(r -> r.getSabor().equalsIgnoreCase(nome)).findFirst().get();
  }
}
  
