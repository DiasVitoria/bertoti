
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

![funções drawio](https://user-images.githubusercontent.com/80860267/218602790-8d48676b-e31b-498e-83cf-c148c693fd6e.png)

</div>

![Colaborador](https://user-images.githubusercontent.com/80860267/218604116-d97f6e1b-fea3-457f-b665-550b9d914bee.png) 

```JAVA

public class Colaborador{
  Private Colaborador: colaborador
  Private nomeCompleto: String
  Private salario: double
  Private numIdentificador: int
  
  public void SetFuncao(Colaborador colaborador){
    colaborador = colaborador;
  }
  
  public void RealizarFuncao(){
    colaborador.Executar();
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

public implements Funcao{
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

public implements Funcao{
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

public implements Funcao{
    public void RevisarPadroes(){
     
    };
    public void AcompanharProjetos(){
     
    };
    public void Executar(){
    
    };
}

```


