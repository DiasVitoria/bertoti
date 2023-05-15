public class Conexao {
  
  private Conexao instance;
  
  private Conexao(){
  }
  
  public getInstance(){
    if(instance == null){
      instance = new Conexao();
      return instance;
    }
    return instance;
  }
}
