package com.infotel.TpMavenSpring26AVRIL.dao;


import com.infotel.TpMavenSpring26AVRIL.metier.Dev;
import com.infotel.TpMavenSpring26AVRIL.metier.Etudiant;

public interface Idao {
	public int ajouterEtudiant(Etudiant e);
	public int ajouterDev(Dev d);

}
