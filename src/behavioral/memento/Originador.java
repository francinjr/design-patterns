package behavioral.memento;

public class Originador {
	  private String estado;


	  public String getEstado() {
		  return estado;
	  }
	  
	  public void setEstado(String estado) {
	      this.estado = estado;
	  }


	  public Memento salvarEstado() {
	      return new Memento(estado);
	  }


	  public void restaurarEstado(Memento memento) {
	      estado = memento.getEstadoSalvo();
	  }
	}
