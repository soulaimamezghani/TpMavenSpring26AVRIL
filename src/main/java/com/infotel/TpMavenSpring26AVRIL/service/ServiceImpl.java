package com.infotel.TpMavenSpring26AVRIL.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpring26AVRIL.dao.Idao;
import com.infotel.TpMavenSpring26AVRIL.metier.Dev;
import com.infotel.TpMavenSpring26AVRIL.metier.Etudiant;
@Service ("service")
public class ServiceImpl implements Iservice {
	@Autowired
	private Idao dao;
	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		 return dao.ajouterEtudiant(e); 
	}

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		return dao.ajouterDev(d);
	}

	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

}
