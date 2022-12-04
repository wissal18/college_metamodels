package main;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;


import MyCollege.*;
import MyCollege.College;

public class CollegeManipulation {
	public void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du mod�le : "+e);
		      e.printStackTrace();
		   }
		}
	
	public Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du mod�le : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}
	
	public College getCollegeInModel(String modelFile) {
		Resource resource = chargerModele(modelFile,MyCollege.MyCollegePackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du mod�le");
			return null;
		}

		TreeIterator it = resource.getAllContents();

		College col = null;
		while(it.hasNext()) {
		   EObject obj = (EObject) it.next();
		   if (obj instanceof College) {
		      col = (College) obj;
		      break;
		   }
		}
		return col;
	}
	public void printCollege(College col) {
		for (Departement a : col.getDepartements()) {
			System.out.println("Département "+a.getNom()+":");
		
			for(Matiere b : a.getMatieres()) {
				
			System.out.println("Matière de "+b.getNom()+" suivi par les étudiants: ");
				for (Etudiant c: b.getEtudiants()) {
					System.out.println(c.getPrenom()+" "+c.getNom());
				}
			}
		}
	
	}
	
	public void ajoutDepartement(String nom,String modelFile,College col) {
		
		Departement nouvelle = MyCollegeFactory.eINSTANCE.createDepartement();
		nouvelle.setNom(nom);
		col.getDepartements().add(nouvelle);
		
	}
	
	
	public void matieresEtudiants(String nom,String prenom,College col) {
		System.out.println("Les matières suivis par: "+ prenom+" "+nom+" sont:");
		for (Departement a : col.getDepartements()) {
			for(Matiere b : a.getMatieres()) {
				for (Etudiant c: b.getEtudiants()) {
					if(c.getPrenom().equalsIgnoreCase(prenom) && c.getNom().equalsIgnoreCase(nom)) {
						System.out.println(b.getNom());
					
					}
					
				}
			}
		}
	}
	
	
	
	
	
	
	public static void main(String argv[]) {
		
CollegeManipulation manip = new CollegeManipulation();
			
			College col = manip.getCollegeInModel("model/College.xmi");
			
			System.out.println(" * modéle chargé * ");
			
			manip.printCollege(col);
			
			System.out.println(" ******** ");
			manip.matieresEtudiants("Hamdi", "Jamila", col);
			
			System.out.println(" ******** ");
			
			//manip.ajoutDepartement("Mécanique", "model/College.xmi", col);
			}
	
	
	}
