package com.infotel.TpMavenSpring26AVRIL.service;

import com.infotel.TpMavenSpring26AVRIL.metier.Dev;
import com.infotel.TpMavenSpring26AVRIL.metier.Etudiant;

public interface Iservice {
	public int ajouterEtudiant(Etudiant e);
	public int ajouterDev(Dev d);

}
