package com.infotel.TpMavenSpring26AVRIL.metier;

import org.springframework.stereotype.Component;

@Component ("formation")
public class Formation {
	private int idFormation;
	private String nomFormation;
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", nomFormation=" + nomFormation + "]";
	}
	

}
