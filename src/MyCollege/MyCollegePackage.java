/**
 */
package MyCollege;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MyCollege.MyCollegeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MyCollegePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyCollege";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform;/resource/college/metamodels/MyCollege.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MyCollege";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyCollegePackage eINSTANCE = MyCollege.impl.MyCollegePackageImpl.init();

	/**
	 * The meta object id for the '{@link MyCollege.impl.CollegeImpl <em>College</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.CollegeImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getCollege()
	 * @generated
	 */
	int COLLEGE = 0;

	/**
	 * The feature id for the '<em><b>Site Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE__SITE_WEB = 0;

	/**
	 * The feature id for the '<em><b>Departements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE__DEPARTEMENTS = 1;

	/**
	 * The number of structural features of the '<em>College</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE___CREER = 0;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE___MODIFIER = 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE___AFFICHER = 2;

	/**
	 * The number of operations of the '<em>College</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLEGE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link MyCollege.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.DepartementImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Enseignants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__ENSEIGNANTS = 1;

	/**
	 * The feature id for the '<em><b>Matieres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__MATIERES = 2;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___CREER = 0;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___MODIFIER = 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AFFICHER = 2;

	/**
	 * The operation id for the '<em>Get Rapport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___GET_RAPPORT = 3;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link MyCollege.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.PersonneImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Num tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NUM_TEL = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__ID = 4;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___CREER = 0;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___MODIFIER = 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___AFFICHER = 2;

	/**
	 * The operation id for the '<em>Get Rapport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___GET_RAPPORT = 3;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link MyCollege.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.EnseignantImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Num tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NUM_TEL = PERSONNE__NUM_TEL;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__EMAIL = PERSONNE__EMAIL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ID = PERSONNE__ID;

	/**
	 * The feature id for the '<em><b>Date emploie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__DATE_EMPLOIE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__GRADE = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enseigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ENSEIGNE = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___CREER = PERSONNE___CREER;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___MODIFIER = PERSONNE___MODIFIER;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___AFFICHER = PERSONNE___AFFICHER;

	/**
	 * The operation id for the '<em>Get Rapport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___GET_RAPPORT = PERSONNE___GET_RAPPORT;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MyCollege.impl.EtudiantImpl <em>Etudiant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.EtudiantImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getEtudiant()
	 * @generated
	 */
	int ETUDIANT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Num tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NUM_TEL = PERSONNE__NUM_TEL;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__EMAIL = PERSONNE__EMAIL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__ID = PERSONNE__ID;

	/**
	 * The feature id for the '<em><b>Filiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__FILIERE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__DATE_ENTREE = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___MODIFIER = PERSONNE___MODIFIER;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___AFFICHER = PERSONNE___AFFICHER;

	/**
	 * The operation id for the '<em>Get Rapport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___GET_RAPPORT = PERSONNE___GET_RAPPORT;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___CREER = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Moyenne</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___GET_MOYENNE = PERSONNE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link MyCollege.impl.MatiereImpl <em>Matiere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyCollege.impl.MatiereImpl
	 * @see MyCollege.impl.MyCollegePackageImpl#getMatiere()
	 * @generated
	 */
	int MATIERE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Enseigne par</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__ENSEIGNE_PAR = 2;

	/**
	 * The feature id for the '<em><b>Etudiants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__ETUDIANTS = 3;

	/**
	 * The number of structural features of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___CREER = 0;

	/**
	 * The operation id for the '<em>Modifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___MODIFIER = 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___AFFICHER = 2;

	/**
	 * The operation id for the '<em>Get Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___GET_PLAN = 3;

	/**
	 * The operation id for the '<em>Code Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE___CODE_UNIQUE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link MyCollege.College <em>College</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>College</em>'.
	 * @see MyCollege.College
	 * @generated
	 */
	EClass getCollege();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.College#getSiteWeb <em>Site Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Web</em>'.
	 * @see MyCollege.College#getSiteWeb()
	 * @see #getCollege()
	 * @generated
	 */
	EAttribute getCollege_SiteWeb();

	/**
	 * Returns the meta object for the containment reference list '{@link MyCollege.College#getDepartements <em>Departements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departements</em>'.
	 * @see MyCollege.College#getDepartements()
	 * @see #getCollege()
	 * @generated
	 */
	EReference getCollege_Departements();

	/**
	 * Returns the meta object for the '{@link MyCollege.College#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see MyCollege.College#creer()
	 * @generated
	 */
	EOperation getCollege__Creer();

	/**
	 * Returns the meta object for the '{@link MyCollege.College#modifier() <em>Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modifier</em>' operation.
	 * @see MyCollege.College#modifier()
	 * @generated
	 */
	EOperation getCollege__Modifier();

	/**
	 * Returns the meta object for the '{@link MyCollege.College#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see MyCollege.College#afficher()
	 * @generated
	 */
	EOperation getCollege__Afficher();

	/**
	 * Returns the meta object for class '{@link MyCollege.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see MyCollege.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MyCollege.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link MyCollege.Departement#getEnseignants <em>Enseignants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enseignants</em>'.
	 * @see MyCollege.Departement#getEnseignants()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Enseignants();

	/**
	 * Returns the meta object for the containment reference list '{@link MyCollege.Departement#getMatieres <em>Matieres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matieres</em>'.
	 * @see MyCollege.Departement#getMatieres()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Matieres();

	/**
	 * Returns the meta object for the '{@link MyCollege.Departement#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see MyCollege.Departement#creer()
	 * @generated
	 */
	EOperation getDepartement__Creer();

	/**
	 * Returns the meta object for the '{@link MyCollege.Departement#modifier() <em>Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modifier</em>' operation.
	 * @see MyCollege.Departement#modifier()
	 * @generated
	 */
	EOperation getDepartement__Modifier();

	/**
	 * Returns the meta object for the '{@link MyCollege.Departement#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see MyCollege.Departement#afficher()
	 * @generated
	 */
	EOperation getDepartement__Afficher();

	/**
	 * Returns the meta object for the '{@link MyCollege.Departement#getRapport() <em>Get Rapport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rapport</em>' operation.
	 * @see MyCollege.Departement#getRapport()
	 * @generated
	 */
	EOperation getDepartement__GetRapport();

	/**
	 * Returns the meta object for class '{@link MyCollege.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see MyCollege.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MyCollege.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see MyCollege.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Personne#getNum_tel <em>Num tel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num tel</em>'.
	 * @see MyCollege.Personne#getNum_tel()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Num_tel();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Personne#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see MyCollege.Personne#getEmail()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Email();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Personne#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see MyCollege.Personne#getID()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_ID();

	/**
	 * Returns the meta object for the '{@link MyCollege.Personne#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see MyCollege.Personne#creer()
	 * @generated
	 */
	EOperation getPersonne__Creer();

	/**
	 * Returns the meta object for the '{@link MyCollege.Personne#modifier() <em>Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modifier</em>' operation.
	 * @see MyCollege.Personne#modifier()
	 * @generated
	 */
	EOperation getPersonne__Modifier();

	/**
	 * Returns the meta object for the '{@link MyCollege.Personne#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see MyCollege.Personne#afficher()
	 * @generated
	 */
	EOperation getPersonne__Afficher();

	/**
	 * Returns the meta object for the '{@link MyCollege.Personne#getRapport() <em>Get Rapport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rapport</em>' operation.
	 * @see MyCollege.Personne#getRapport()
	 * @generated
	 */
	EOperation getPersonne__GetRapport();

	/**
	 * Returns the meta object for the '{@link MyCollege.Personne#idUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique</em>' operation.
	 * @see MyCollege.Personne#idUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPersonne__IdUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link MyCollege.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enseignant</em>'.
	 * @see MyCollege.Enseignant
	 * @generated
	 */
	EClass getEnseignant();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Enseignant#getDate_emploie <em>Date emploie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date emploie</em>'.
	 * @see MyCollege.Enseignant#getDate_emploie()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Date_emploie();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Enseignant#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see MyCollege.Enseignant#getGrade()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Grade();

	/**
	 * Returns the meta object for the reference '{@link MyCollege.Enseignant#getEnseigne <em>Enseigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enseigne</em>'.
	 * @see MyCollege.Enseignant#getEnseigne()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Enseigne();

	/**
	 * Returns the meta object for class '{@link MyCollege.Etudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etudiant</em>'.
	 * @see MyCollege.Etudiant
	 * @generated
	 */
	EClass getEtudiant();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Etudiant#getFiliere <em>Filiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filiere</em>'.
	 * @see MyCollege.Etudiant#getFiliere()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Filiere();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Etudiant#getDate_entree <em>Date entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date entree</em>'.
	 * @see MyCollege.Etudiant#getDate_entree()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Date_entree();

	/**
	 * Returns the meta object for the '{@link MyCollege.Etudiant#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see MyCollege.Etudiant#creer()
	 * @generated
	 */
	EOperation getEtudiant__Creer();

	/**
	 * Returns the meta object for the '{@link MyCollege.Etudiant#getMoyenne() <em>Get Moyenne</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moyenne</em>' operation.
	 * @see MyCollege.Etudiant#getMoyenne()
	 * @generated
	 */
	EOperation getEtudiant__GetMoyenne();

	/**
	 * Returns the meta object for class '{@link MyCollege.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matiere</em>'.
	 * @see MyCollege.Matiere
	 * @generated
	 */
	EClass getMatiere();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Matiere#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see MyCollege.Matiere#getNom()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Nom();

	/**
	 * Returns the meta object for the attribute '{@link MyCollege.Matiere#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MyCollege.Matiere#getCode()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Code();

	/**
	 * Returns the meta object for the reference list '{@link MyCollege.Matiere#getEnseigne_par <em>Enseigne par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseigne par</em>'.
	 * @see MyCollege.Matiere#getEnseigne_par()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Enseigne_par();

	/**
	 * Returns the meta object for the containment reference list '{@link MyCollege.Matiere#getEtudiants <em>Etudiants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etudiants</em>'.
	 * @see MyCollege.Matiere#getEtudiants()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Etudiants();

	/**
	 * Returns the meta object for the '{@link MyCollege.Matiere#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see MyCollege.Matiere#creer()
	 * @generated
	 */
	EOperation getMatiere__Creer();

	/**
	 * Returns the meta object for the '{@link MyCollege.Matiere#modifier() <em>Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modifier</em>' operation.
	 * @see MyCollege.Matiere#modifier()
	 * @generated
	 */
	EOperation getMatiere__Modifier();

	/**
	 * Returns the meta object for the '{@link MyCollege.Matiere#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see MyCollege.Matiere#afficher()
	 * @generated
	 */
	EOperation getMatiere__Afficher();

	/**
	 * Returns the meta object for the '{@link MyCollege.Matiere#getPlan() <em>Get Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Plan</em>' operation.
	 * @see MyCollege.Matiere#getPlan()
	 * @generated
	 */
	EOperation getMatiere__GetPlan();

	/**
	 * Returns the meta object for the '{@link MyCollege.Matiere#codeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Code Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Code Unique</em>' operation.
	 * @see MyCollege.Matiere#codeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMatiere__CodeUnique__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyCollegeFactory getMyCollegeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MyCollege.impl.CollegeImpl <em>College</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.CollegeImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getCollege()
		 * @generated
		 */
		EClass COLLEGE = eINSTANCE.getCollege();

		/**
		 * The meta object literal for the '<em><b>Site Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLEGE__SITE_WEB = eINSTANCE.getCollege_SiteWeb();

		/**
		 * The meta object literal for the '<em><b>Departements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLEGE__DEPARTEMENTS = eINSTANCE.getCollege_Departements();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLEGE___CREER = eINSTANCE.getCollege__Creer();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLEGE___MODIFIER = eINSTANCE.getCollege__Modifier();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLEGE___AFFICHER = eINSTANCE.getCollege__Afficher();

		/**
		 * The meta object literal for the '{@link MyCollege.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.DepartementImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Enseignants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__ENSEIGNANTS = eINSTANCE.getDepartement_Enseignants();

		/**
		 * The meta object literal for the '<em><b>Matieres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__MATIERES = eINSTANCE.getDepartement_Matieres();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___CREER = eINSTANCE.getDepartement__Creer();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___MODIFIER = eINSTANCE.getDepartement__Modifier();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AFFICHER = eINSTANCE.getDepartement__Afficher();

		/**
		 * The meta object literal for the '<em><b>Get Rapport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___GET_RAPPORT = eINSTANCE.getDepartement__GetRapport();

		/**
		 * The meta object literal for the '{@link MyCollege.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.PersonneImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Num tel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NUM_TEL = eINSTANCE.getPersonne_Num_tel();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__EMAIL = eINSTANCE.getPersonne_Email();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__ID = eINSTANCE.getPersonne_ID();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___CREER = eINSTANCE.getPersonne__Creer();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___MODIFIER = eINSTANCE.getPersonne__Modifier();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___AFFICHER = eINSTANCE.getPersonne__Afficher();

		/**
		 * The meta object literal for the '<em><b>Get Rapport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___GET_RAPPORT = eINSTANCE.getPersonne__GetRapport();

		/**
		 * The meta object literal for the '<em><b>Id Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPersonne__IdUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link MyCollege.impl.EnseignantImpl <em>Enseignant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.EnseignantImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getEnseignant()
		 * @generated
		 */
		EClass ENSEIGNANT = eINSTANCE.getEnseignant();

		/**
		 * The meta object literal for the '<em><b>Date emploie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__DATE_EMPLOIE = eINSTANCE.getEnseignant_Date_emploie();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__GRADE = eINSTANCE.getEnseignant_Grade();

		/**
		 * The meta object literal for the '<em><b>Enseigne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__ENSEIGNE = eINSTANCE.getEnseignant_Enseigne();

		/**
		 * The meta object literal for the '{@link MyCollege.impl.EtudiantImpl <em>Etudiant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.EtudiantImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getEtudiant()
		 * @generated
		 */
		EClass ETUDIANT = eINSTANCE.getEtudiant();

		/**
		 * The meta object literal for the '<em><b>Filiere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__FILIERE = eINSTANCE.getEtudiant_Filiere();

		/**
		 * The meta object literal for the '<em><b>Date entree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__DATE_ENTREE = eINSTANCE.getEtudiant_Date_entree();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___CREER = eINSTANCE.getEtudiant__Creer();

		/**
		 * The meta object literal for the '<em><b>Get Moyenne</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___GET_MOYENNE = eINSTANCE.getEtudiant__GetMoyenne();

		/**
		 * The meta object literal for the '{@link MyCollege.impl.MatiereImpl <em>Matiere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyCollege.impl.MatiereImpl
		 * @see MyCollege.impl.MyCollegePackageImpl#getMatiere()
		 * @generated
		 */
		EClass MATIERE = eINSTANCE.getMatiere();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__NOM = eINSTANCE.getMatiere_Nom();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__CODE = eINSTANCE.getMatiere_Code();

		/**
		 * The meta object literal for the '<em><b>Enseigne par</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__ENSEIGNE_PAR = eINSTANCE.getMatiere_Enseigne_par();

		/**
		 * The meta object literal for the '<em><b>Etudiants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__ETUDIANTS = eINSTANCE.getMatiere_Etudiants();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___CREER = eINSTANCE.getMatiere__Creer();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___MODIFIER = eINSTANCE.getMatiere__Modifier();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___AFFICHER = eINSTANCE.getMatiere__Afficher();

		/**
		 * The meta object literal for the '<em><b>Get Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___GET_PLAN = eINSTANCE.getMatiere__GetPlan();

		/**
		 * The meta object literal for the '<em><b>Code Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATIERE___CODE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMatiere__CodeUnique__DiagnosticChain_Map();

	}

} //MyCollegePackage
