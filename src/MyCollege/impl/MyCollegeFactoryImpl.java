/**
 */
package MyCollege.impl;

import MyCollege.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyCollegeFactoryImpl extends EFactoryImpl implements MyCollegeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyCollegeFactory init() {
		try {
			MyCollegeFactory theMyCollegeFactory = (MyCollegeFactory)EPackage.Registry.INSTANCE.getEFactory(MyCollegePackage.eNS_URI);
			if (theMyCollegeFactory != null) {
				return theMyCollegeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyCollegeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyCollegeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyCollegePackage.COLLEGE: return createCollege();
			case MyCollegePackage.DEPARTEMENT: return createDepartement();
			case MyCollegePackage.PERSONNE: return createPersonne();
			case MyCollegePackage.ENSEIGNANT: return createEnseignant();
			case MyCollegePackage.ETUDIANT: return createEtudiant();
			case MyCollegePackage.MATIERE: return createMatiere();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public College createCollege() {
		CollegeImpl college = new CollegeImpl();
		return college;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement createDepartement() {
		DepartementImpl departement = new DepartementImpl();
		return departement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant createEnseignant() {
		EnseignantImpl enseignant = new EnseignantImpl();
		return enseignant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etudiant createEtudiant() {
		EtudiantImpl etudiant = new EtudiantImpl();
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere createMatiere() {
		MatiereImpl matiere = new MatiereImpl();
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyCollegePackage getMyCollegePackage() {
		return (MyCollegePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyCollegePackage getPackage() {
		return MyCollegePackage.eINSTANCE;
	}

} //MyCollegeFactoryImpl
