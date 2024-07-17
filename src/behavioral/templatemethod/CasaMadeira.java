package behavioral.templatemethod;

//Subclasse que implementa os passos específicos para construir uma casa de madeira
public class CasaMadeira extends ConstrucaoCasa {

 @Override
 public void construirEstrutura() {
     System.out.println("Construindo estrutura de madeira");
 }

 @Override
 public void adicionarParedes() {
     System.out.println("Adicionando paredes de madeira");
 }

 @Override
 public void adicionarTelhado() {
     System.out.println("Adicionando telhado de madeira");
 }
}
