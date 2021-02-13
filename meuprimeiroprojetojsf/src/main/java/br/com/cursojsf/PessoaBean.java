package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean(name="pessoaBean")
@ViewScoped
public class PessoaBean {

	private String nome;

	private HtmlCommandButton commandButton;
	
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		if(nomes.size() > 3) {
			commandButton.setDisabled(true);
			return "paginanavegada"; // null ou vazio fica na mesma pagina = outcome
		}
		return "";
	}
	
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
