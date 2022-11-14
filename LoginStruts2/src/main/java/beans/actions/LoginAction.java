package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {

	private String usuario;
	private String password;
	private String error;

	Logger log = LogManager.getLogger(LoginAction.class);

	public String execute() {

		if((this.usuario==null || this.usuario.isEmpty())) {
			
			return LOGIN;
		}
		
		if((this.getUsuario().equals("admin")) && (this.getPassword().equals("admin"))) {
			return SUCCESS;	
		}
		
		
		return ERROR;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFormUsuario() {
		return getText("form.usuario");
	}

	public String getFormPassword() {
		return getText("form.password");
	}

	public String getFormBoton() {
		return getText("form.botao");
	}

	public String getFormTitulo() {
		return getText("form.titulo");
	}

	public String getFormValores() {
		return getText("form.valores");
	}
	
	public String getErroLogin() {
		return error;
	}

	
}



