package com.infotel.TpMavenSpring26AVRIL.service.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpring26AVRIL.metier.Dev;
import com.infotel.TpMavenSpring26AVRIL.metier.Etudiant;
import com.infotel.TpMavenSpring26AVRIL.metier.Formation;
import com.infotel.TpMavenSpring26AVRIL.service.Iservice;
import com.infotel.TpMavenSpring26AVRIL.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.context.xml");
        Etudiant e=context.getBean("etudiant", Etudiant.class);
        e.setNom("Toto");
        e.setPrenom("tata");
        e.setId(23);
         System.out.println(e);
         
         Formation f=context.getBean("formation", Formation.class);
          f.setIdFormation(5);
          f.setNomFormation("anglais");
         System.out.println(f);
         
         Dev d=context.getBean("dev1", Dev.class);
         System.out.println(d);
         

         Iservice service=context.getBean("service",ServiceImpl.class);
         service.ajouterEtudiant(e);
       
         context.close();
     }
}
