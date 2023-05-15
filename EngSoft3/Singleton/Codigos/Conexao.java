public class Conexao {
  
  private Conexao instance;
  
  private Conexao(){
  }
  
  public static getInstance(){
    if(instance == null){
      instance = new Conexao();
      return instance;
    }
    return instance;
  }
}
