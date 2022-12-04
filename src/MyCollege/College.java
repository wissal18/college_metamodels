/**
 */
package MyCollege;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>College</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.College#getSiteWeb <em>Site Web</em>}</li>
 *   <li>{@link MyCollege.College#getDepartements <em>Departements</em>}</li>
 * </ul>
 *
 * @see MyCollege.MyCollegePackage#getCollege()
 * @model
 * @generated
 */
public interface College extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Web</em>' attribute.
	 * @see #setSiteWeb(String)
	 * @see MyCollege.MyCollegePackage#getCollege_SiteWeb()
	 * @model
	 * @generated
	 */
	String getSiteWeb();

	/**
	 * Sets the value of the '{@link MyCollege.College#getSiteWeb <em>Site Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Web</em>' attribute.
	 * @see #getSiteWeb()
	 * @generated
	 */
	void setSiteWeb(String value);

	/**
	 * Returns the value of the '<em><b>Departements</b></em>' containment reference list.
	 * The list contents are of type {@link MyCollege.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departements</em>' containment reference list.
	 * @see MyCollege.MyCollegePackage#getCollege_Departements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Departement> getDepartements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	College creer();

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

} // College
