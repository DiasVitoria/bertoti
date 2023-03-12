
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
 
 > Exemplo de UML de gerenciamento de estoque.

<div align="center">

![gerenciamento](https://user-images.githubusercontent.com/80860267/224574160-bde5d4bd-4637-4c08-9c22-21346860e473.png)

</div>


```JAVA

public class ItemDeEstoque {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
}

```


```JAVA

public class ListaDeEstoque {
    private Map<Integer, ItemDeEstoque> itensDeEstoque;
}

```


```JAVA

public class GerenteDeEstoque {
    private EstrategiaDeGerenciamentoDeEstoque estrategia;
    private ListaDeEstoque listaDeEstoque;
    
    public void setListaDeEstoque(ListaDeEstoque listaDeEstoque) {
        this.listaDeEstoque = listaDeEstoque;
    }
    
    public void setEstrategia(EstrategiaDeGerenciamentoDeEstoque estrategia) {
        this.estrategia = estrategia;
    }
    
    public void gerenciarEstoque() {
        this.estrategia.executar();
    }
}

```


```JAVA

public interface EstrategiaDeGerenciamentoDeEstoque {
    void executar();
}

```


```JAVA

public class EstrategiaBasica implements EstrategiaDeGerenciamentoDeEstoque {
    public void executar() {
    }
}

```

```JAVA

public class EstrategiaAvancada implements EstrategiaDeGerenciamentoDeEstoque {
    public void executar() {
    }
}

```

```JAVA

public class EstrategiaPremium implements EstrategiaDeGerenciamentoDeEstoque {
    public void executar() {
    }
}

```


