/**
 */
package MyCollege.impl;

import MyCollege.College;
import MyCollege.Departement;
import MyCollege.Enseignant;
import MyCollege.Etudiant;
import MyCollege.Matiere;
import MyCollege.MyCollegeFactory;
import MyCollege.MyCollegePackage;
import MyCollege.Personne;

import MyCollege.util.MyCollegeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyCollegePackageImpl extends EPackageImpl implements MyCollegePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enseignantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etudiantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matiereEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MyCollege.MyCollegePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyCollegePackageImpl() {
		super(eNS_URI, MyCollegeFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MyCollegePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyCollegePackage init() {
		if (isInited) return (MyCollegePackage)EPackage.Registry.INSTANCE.getEPackage(MyCollegePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMyCollegePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MyCollegePackageImpl theMyCollegePackage = registeredMyCollegePackage instanceof MyCollegePackageImpl ? (MyCollegePackageImpl)registeredMyCollegePackage : new MyCollegePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMyCollegePackage.createPackageContents();

		// Initialize created meta-data
		theMyCollegePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMyCollegePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MyCollegeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMyCollegePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyCollegePackage.eNS_URI, theMyCollegePackage);
		return theMyCollegePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollege() {
		return collegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollege_SiteWeb() {
		return (EAttribute)collegeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollege_Departements() {
		return (EReference)collegeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollege__Creer() {
		return collegeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollege__Modifier() {
		return collegeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollege__Afficher() {
		return collegeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartement() {
		return departementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Nom() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Enseignants() {
		return (EReference)departementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Matieres() {
		return (EReference)departementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Creer() {
		return departementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Modifier() {
		return departementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Afficher() {
		return departementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__GetRapport() {
		return departementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Prenom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Num_tel() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Email() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_ID() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__Creer() {
		return personneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__Modifier() {
		return personneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__Afficher() {
		return personneEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__GetRapport() {
		return personneEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__IdUnique__DiagnosticChain_Map() {
		return personneEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnseignant() {
		return enseignantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Date_emploie() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Grade() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Enseigne() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtudiant() {
		return etudiantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Filiere() {
		return (EAttribute)etudiantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Date_entree() {
		return (EAttribute)etudiantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__Creer() {
		return etudiantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__GetMoyenne() {
		return etudiantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatiere() {
		return matiereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Nom() {
		return (EAttribute)matiereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Code() {
		return (EAttribute)matiereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Enseigne_par() {
		return (EReference)matiereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Etudiants() {
		return (EReference)matiereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__Creer() {
		return matiereEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__Modifier() {
		return matiereEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__Afficher() {
		return matiereEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__GetPlan() {
		return matiereEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatiere__CodeUnique__DiagnosticChain_Map() {
		return matiereEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyCollegeFactory getMyCollegeFactory() {
		return (MyCollegeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collegeEClass = createEClass(COLLEGE);
		createEAttribute(collegeEClass, COLLEGE__SITE_WEB);
		createEReference(collegeEClass, COLLEGE__DEPARTEMENTS);
		createEOperation(collegeEClass, COLLEGE___CREER);
		createEOperation(collegeEClass, COLLEGE___MODIFIER);
		createEOperation(collegeEClass, COLLEGE___AFFICHER);

		departementEClass = createEClass(DEPARTEMENT);
		createEAttribute(departementEClass, DEPARTEMENT__NOM);
		createEReference(departementEClass, DEPARTEMENT__ENSEIGNANTS);
		createEReference(departementEClass, DEPARTEMENT__MATIERES);
		createEOperation(departementEClass, DEPARTEMENT___CREER);
		createEOperation(departementEClass, DEPARTEMENT___MODIFIER);
		createEOperation(departementEClass, DEPARTEMENT___AFFICHER);
		createEOperation(departementEClass, DEPARTEMENT___GET_RAPPORT);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__PRENOM);
		createEAttribute(personneEClass, PERSONNE__NUM_TEL);
		createEAttribute(personneEClass, PERSONNE__EMAIL);
		createEAttribute(personneEClass, PERSONNE__ID);
		createEOperation(personneEClass, PERSONNE___CREER);
		createEOperation(personneEClass, PERSONNE___MODIFIER);
		createEOperation(personneEClass, PERSONNE___AFFICHER);
		createEOperation(personneEClass, PERSONNE___GET_RAPPORT);
		createEOperation(personneEClass, PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP);

		enseignantEClass = createEClass(ENSEIGNANT);
		createEAttribute(enseignantEClass, ENSEIGNANT__DATE_EMPLOIE);
		createEAttribute(enseignantEClass, ENSEIGNANT__GRADE);
		createEReference(enseignantEClass, ENSEIGNANT__ENSEIGNE);

		etudiantEClass = createEClass(ETUDIANT);
		createEAttribute(etudiantEClass, ETUDIANT__FILIERE);
		createEAttribute(etudiantEClass, ETUDIANT__DATE_ENTREE);
		createEOperation(etudiantEClass, ETUDIANT___CREER);
		createEOperation(etudiantEClass, ETUDIANT___GET_MOYENNE);

		matiereEClass = createEClass(MATIERE);
		createEAttribute(matiereEClass, MATIERE__NOM);
		createEAttribute(matiereEClass, MATIERE__CODE);
		createEReference(matiereEClass, MATIERE__ENSEIGNE_PAR);
		createEReference(matiereEClass, MATIERE__ETUDIANTS);
		createEOperation(matiereEClass, MATIERE___CREER);
		createEOperation(matiereEClass, MATIERE___MODIFIER);
		createEOperation(matiereEClass, MATIERE___AFFICHER);
		createEOperation(matiereEClass, MATIERE___GET_PLAN);
		createEOperation(matiereEClass, MATIERE___CODE_UNIQUE__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enseignantEClass.getESuperTypes().add(this.getPersonne());
		etudiantEClass.getESuperTypes().add(this.getPersonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(collegeEClass, College.class, "College", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollege_SiteWeb(), ecorePackage.getEString(), "siteWeb", null, 0, 1, College.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollege_Departements(), this.getDepartement(), null, "departements", null, 1, -1, College.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCollege__Creer(), this.getCollege(), "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCollege__Modifier(), null, "modifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCollege__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(departementEClass, Departement.class, "Departement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartement_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Enseignants(), this.getEnseignant(), null, "enseignants", null, 1, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Matieres(), this.getMatiere(), null, "matieres", null, 0, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDepartement__Creer(), this.getDepartement(), "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDepartement__Modifier(), null, "modifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDepartement__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDepartement__GetRapport(), null, "getRapport", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Num_tel(), ecorePackage.getEString(), "num_tel", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Email(), ecorePackage.getEString(), "email", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPersonne__Creer(), this.getPersonne(), "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPersonne__Modifier(), null, "modifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPersonne__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPersonne__GetRapport(), null, "getRapport", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPersonne__IdUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "idUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enseignantEClass, Enseignant.class, "Enseignant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnseignant_Date_emploie(), ecorePackage.getEDate(), "date_emploie", null, 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Grade(), ecorePackage.getEString(), "grade", null, 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Enseigne(), this.getMatiere(), null, "enseigne", null, 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etudiantEClass, Etudiant.class, "Etudiant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtudiant_Filiere(), ecorePackage.getEString(), "filiere", null, 1, 1, Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtudiant_Date_entree(), ecorePackage.getEDate(), "date_entree", null, 1, 1, Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEtudiant__Creer(), this.getMatiere(), "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEtudiant__GetMoyenne(), null, "getMoyenne", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matiereEClass, Matiere.class, "Matiere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatiere_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatiere_Code(), ecorePackage.getEString(), "code", null, 1, 1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Enseigne_par(), this.getEnseignant(), null, "enseigne_par", null, 1, -1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Etudiants(), this.getEtudiant(), null, "etudiants", null, 0, -1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMatiere__Creer(), this.getMatiere(), "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMatiere__Modifier(), null, "modifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMatiere__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMatiere__GetPlan(), null, "getPlan", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMatiere__CodeUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "codeUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (personneEClass,
		   source,
		   new String[] {
			   "constraints", "idUnique"
		   });
		addAnnotation
		  (matiereEClass,
		   source,
		   new String[] {
			   "constraints", "codeUnique"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPersonne__IdUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Personne.allInstances()->one(p:Personne | p.ID=self.ID)"
		   });
		addAnnotation
		  (getMatiere__CodeUnique__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Matiere.allInstances()->one(m:Matiere | m.code=self.code)"
		   });
	}

} //MyCollegePackageImpl
