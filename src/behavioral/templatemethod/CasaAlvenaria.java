package behavioral.templatemethod;

//Subclasse que implementa os passos específicos para construir uma casa de alvenaria
public class CasaAlvenaria extends ConstrucaoCasa {

 @Override
 public void construirEstrutura() {
     System.out.println("Construindo estrutura de alvenaria");
 }

 @Override
 public void adicionarParedes() {
     System.out.println("Adicionando paredes de alvenaria");
 }

 @Override
 public void adicionarTelhado() {
     System.out.println("Adicionando telhado de telhas");
 }
}
