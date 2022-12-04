/**
 */
package MyCollege;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.Etudiant#getFiliere <em>Filiere</em>}</li>
 *   <li>{@link MyCollege.Etudiant#getDate_entree <em>Date entree</em>}</li>
 * </ul>
 *
 * @see MyCollege.MyCollegePackage#getEtudiant()
 * @model
 * @generated
 */
public interface Etudiant extends Personne {
	/**
	 * Returns the value of the '<em><b>Filiere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filiere</em>' attribute.
	 * @see #setFiliere(String)
	 * @see MyCollege.MyCollegePackage#getEtudiant_Filiere()
	 * @model required="true"
	 * @generated
	 */
	String getFiliere();

	/**
	 * Sets the value of the '{@link MyCollege.Etudiant#getFiliere <em>Filiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filiere</em>' attribute.
	 * @see #getFiliere()
	 * @generated
	 */
	void setFiliere(String value);

	/**
	 * Returns the value of the '<em><b>Date entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date entree</em>' attribute.
	 * @see #setDate_entree(Date)
	 * @see MyCollege.MyCollegePackage#getEtudiant_Date_entree()
	 * @model required="true"
	 * @generated
	 */
	Date getDate_entree();

	/**
	 * Sets the value of the '{@link MyCollege.Etudiant#getDate_entree <em>Date entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date entree</em>' attribute.
	 * @see #getDate_entree()
	 * @generated
	 */
	void setDate_entree(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Personne creer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getMoyenne();

} // Etudiant
