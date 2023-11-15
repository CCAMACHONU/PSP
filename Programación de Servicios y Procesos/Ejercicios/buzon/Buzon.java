package buzon;

public class Buzon {

	private Boolean hayMensaje;
	private String mensaje;

	public Buzon() {

		hayMensaje = false;
		mensaje = "Aips";

	}

	public Boolean getHayMensaje() {
		return hayMensaje;
	}

	public void setHayMensaje(Boolean hayMensaje) {
		this.hayMensaje = hayMensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
