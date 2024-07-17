package behavioral.memento;

public class Memento {
	  private String estadoSalvo;


	  public Memento(String estado) {
	      estadoSalvo = estado;
	  }


	  public String getEstadoSalvo() {
	      return estadoSalvo;
	  }
	}
