# Victoria Marto Dias - RA 1460482121022

## Ciclo de vida do desenvolvimento de Softwares (Plataforma de Ensino)

### 📓Requisitos

> Funcionais: (Caso de uso)
<br>

São as funcionalidades de um sistema, é o que define o que o sistema fará;

<div align="center">
  
![casoDeUso](https://user-images.githubusercontent.com/80860267/158988883-e978e652-455e-4a2d-a1e2-a96e8470d2fc.jpg)
  
</div>

> Não funcionais: (Heuristics)
<br>

São todas as necessidades que não podem ser atendidas através de funcionalidades, as qualidades de um sistema;

<div align="center">

</div>  

### 📓Projeto

> Classes 

<div align="center">
  
  ![projeto](https://user-images.githubusercontent.com/80860267/158989972-0a186999-e4e2-4031-8cc6-c862cfc8ed14.jpg)

</div>

### 📓Desenvolvimento

> Classes e JAVA
<br>

#### Classe PlataformaEnsino

![platEnsino](https://user-images.githubusercontent.com/80860267/158992625-4c03ac45-5dae-42a1-8bc3-5dc7506bae0f.png)

> Código em JAVA

```JAVA

import java.util.LinkedList;
import java.util.List;

public class PlataformaEnsino {

     private List<Pessoa> pessoas= new LinkedList<Pessoa>();

     public void cadastrarPessoa(Pessoa pessoa){
          pessoas.add(pessoa);
     }

     public List<Pessoa> buscarPessoaPorNome(String nome){
           List<Pessoa> nomesEncontrados = new LinkedList<Pessoa>();
           for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome)) nomesEncontrados.add(pessoa);
           }
           return nomesEncontrados;
     }

     public Pessoa buscarPessoaPorMatricula(String matricula){
          for(Pessoa pessoa:pessoas){
               if(pessoa.getMatricula().equals(matricula)) return matricula; 
          }
          return null;
     }

     public List<Pessoa> getPessoas(){
           return pessoas;
     }
}
```
<br>
<br>

#### Classe Pessoa

![classPessoa](https://user-images.githubusercontent.com/80860267/158992637-da45db01-75bf-4e31-82ac-d91e78fe17b9.png)

> Código em JAVA

```JAVA
public class Pessoa {
	
	private String nome;
	private String matricula;
	private String tipo;
	
	public Pessoa(String nome, String matricula, String tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		nome = novoNome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		matricula = novaMatricula;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		tipo = novoTipo;
	}

}
```
<br>
<br>

#### Classe Disciplina

![classDisciplina](https://user-images.githubusercontent.com/80860267/158992659-b6a2e892-759b-4702-b5a4-b761123f436e.png)

> Código em JAVA

```JAVA
public class Disciplina{
	
	private String nomeDisciplina;
	private String nomeProfessor;
	private String semestre;
	
	public Pessoa(String nomeDisciplina, String nomeProfessor, String semestre) {
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.semestre = semestre;
	}

	public String getNomeDisciplina(){
		return nomeDisciplina;
	}
	
	public void setNomeDisciplina(String novoNomeDisciplina){
		nomeDisciplina = novoNomeDisciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setMatricula(String nomeProfessor) {
		nomeProfessor = novoNomeProfessor;
	}
	
	public String getSemestre(){
		return semestre;
	}
	
	public void setTipo(String semestre){
		semestre = novoSemestre;
	}

}
```

