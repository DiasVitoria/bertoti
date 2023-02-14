
<section align="center">

# VICTORIA MARTO DIAS - 1460482121022
# 4º Semestre
## 2023

</section>

> ES3 - Engenharia de Software 3

<div align="center">

## Estratégia
  
</div>

<div align="justify">

* O Strategy (ou Estratégia) é um padrão de projeto comportamental que permite definir uma família de algoritmos, colocando-os em classes separadas, e fazendo os objetos intercambiáveis.

* Este padrão sugere que você pegue uma classe que faz algo específico em diversas maneiras diferentes e extraindo todos esses algoritmos para classes separadas chamadas estratégias.

 </div>
 
 > Exemplo de UML de colaboradores (Contexto) e funções (Estratégia)

<div align="center">

![funções drawio](https://user-images.githubusercontent.com/80860267/218763101-b3f73134-33ef-4568-a51b-897603764a10.png)

</div>

![Colaborador](https://user-images.githubusercontent.com/80860267/218763405-2c033810-2c8a-475e-8ba9-0a98432c6686.png)

```JAVA

public class Colaborador{
  private Funcao funcao;
  private String nomeCompleto;
  private double salario;
  private int numIdentificador;
  
  public void SetFuncao(Funcao funcao){
    this.funcao = funcao;
  }
  
  public void RealizarFuncao(){
    funcao.Executar();
  }
}

```

![interface](https://user-images.githubusercontent.com/80860267/218605588-ea16f110-647b-4c53-b0ec-72f2ab0ba882.png)

```JAVA

public interface Funcao{
  	public void Executar();
}

```

![operario](https://user-images.githubusercontent.com/80860267/218605925-a866cf17-4960-42f9-b022-c37840e0554a.png)

```JAVA

public class Operario implements Funcao{
    public void OperarMaquina(){
     
    };
    public void MontarPecas(){
     
    };
    public void Executar(){
     
    };
}

```

![lider](https://user-images.githubusercontent.com/80860267/218605939-68453d21-ca41-417f-a1ac-20cb2cc1016d.png)

```JAVA

public class Lider implements Funcao{
    public void DelegarTarefas(){
     
    };
    public void FiscalizarProducao(){
     
    };
    public void Executar(){
    
    };
}

```

![qualidade](https://user-images.githubusercontent.com/80860267/218605952-6caa6d1c-75ce-4884-9d74-9716d4c7834c.png)

```JAVA

public class Qualidade implements Funcao{
    public void RevisarPadroes(){
     
    };
    public void AcompanharProjetos(){
     
    };
    public void Executar(){
    
    };
}

```

```JAVA
public class Main{
  public static void main(String[] args) {
    Colaborador colaborador = new Colaborador();
    colaborador.SetFuncao(new Qualidade());
    colaborador.Funcao.Executar();
}

