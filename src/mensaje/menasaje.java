/**
 * 
 */
/**
 * @author zoe_e
 *
 */
package mensaje;
public class menasaje {
	private String name;
	private String mensaje;
	
	public menasaje() {
	}

	public menasaje(String mensaje) {
		this.setMensaje(mensaje);
	}
	public String nombre() {
		return name;
	}

	public void nombre(String name) {
		this.name = name;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}

