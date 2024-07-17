package behavioral.templatemethod;

//Classe abstrata que define o template method
public abstract class ConstrucaoCasa {

 // O template method que define o algoritmo
 public final void construirCasa() {
     prepararTerreno();
     construirEstrutura();
     adicionarParedes();
     adicionarTelhado();
     decorarCasa();
 }

 // Métodos abstratos a serem implementados pelas subclasses
 // Esses passos vão depender do tipo de casa que está sendo construida
 public abstract void construirEstrutura();
 public abstract void adicionarParedes();
 public abstract void adicionarTelhado();

 // Métodos comuns a todas as subclasses
 // Perceba que não interessa o tipo de casa, elas vão possuir esses passos
 public void prepararTerreno() {
     System.out.println("Preparando terreno");
 }

public void decorarCasa() {
     System.out.println("Decorando a casa");
 }
}
