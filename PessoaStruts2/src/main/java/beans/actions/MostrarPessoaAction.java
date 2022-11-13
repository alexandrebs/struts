package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class MostrarPessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String nome;
	
	Logger log = LogManager.getLogger(MostrarPessoaAction.class);

	public String execute() {
		
		log.info("O nome da classe é: "+ this.nome);
		return SUCCESS;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
