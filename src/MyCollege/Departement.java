/**
 */
package MyCollege;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link MyCollege.Departement#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link MyCollege.Departement#getMatieres <em>Matieres</em>}</li>
 * </ul>
 *
 * @see MyCollege.MyCollegePackage#getDepartement()
 * @model
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see MyCollege.MyCollegePackage#getDepartement_Nom()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link MyCollege.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' containment reference list.
	 * The list contents are of type {@link MyCollege.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' containment reference list.
	 * @see MyCollege.MyCollegePackage#getDepartement_Enseignants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Enseignant> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Matieres</b></em>' containment reference list.
	 * The list contents are of type {@link MyCollege.Matiere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matieres</em>' containment reference list.
	 * @see MyCollege.MyCollegePackage#getDepartement_Matieres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matiere> getMatieres();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Departement creer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void afficher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getRapport();

} // Departement
