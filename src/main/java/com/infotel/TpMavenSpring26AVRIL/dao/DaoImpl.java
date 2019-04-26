package com.infotel.TpMavenSpring26AVRIL.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpMavenSpring26AVRIL.metier.Dev;
import com.infotel.TpMavenSpring26AVRIL.metier.Etudiant;
@Repository("dao")
public class DaoImpl  implements Idao {

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		System.out.println("l'etudiant"+""+"bien ajoutée");
		return e.getId();
	}

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		System.out.println("le Dev"+""+"bien ajoutée");
		return d.getId();
	}

}
