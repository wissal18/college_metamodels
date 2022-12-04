/**
 */
package MyCollege;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.Enseignant#getDate_emploie <em>Date emploie</em>}</li>
 *   <li>{@link MyCollege.Enseignant#getGrade <em>Grade</em>}</li>
 *   <li>{@link MyCollege.Enseignant#getEnseigne <em>Enseigne</em>}</li>
 * </ul>
 *
 * @see MyCollege.MyCollegePackage#getEnseignant()
 * @model
 * @generated
 */
public interface Enseignant extends Personne {
	/**
	 * Returns the value of the '<em><b>Date emploie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date emploie</em>' attribute.
	 * @see #setDate_emploie(Date)
	 * @see MyCollege.MyCollegePackage#getEnseignant_Date_emploie()
	 * @model required="true"
	 * @generated
	 */
	Date getDate_emploie();

	/**
	 * Sets the value of the '{@link MyCollege.Enseignant#getDate_emploie <em>Date emploie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date emploie</em>' attribute.
	 * @see #getDate_emploie()
	 * @generated
	 */
	void setDate_emploie(Date value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see MyCollege.MyCollegePackage#getEnseignant_Grade()
	 * @model required="true"
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link MyCollege.Enseignant#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Enseigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseigne</em>' reference.
	 * @see #setEnseigne(Matiere)
	 * @see MyCollege.MyCollegePackage#getEnseignant_Enseigne()
	 * @model required="true"
	 * @generated
	 */
	Matiere getEnseigne();

	/**
	 * Sets the value of the '{@link MyCollege.Enseignant#getEnseigne <em>Enseigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enseigne</em>' reference.
	 * @see #getEnseigne()
	 * @generated
	 */
	void setEnseigne(Matiere value);

} // Enseignant
