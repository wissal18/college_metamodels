/**
 */
package MyCollege;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.Matiere#getNom <em>Nom</em>}</li>
 *   <li>{@link MyCollege.Matiere#getCode <em>Code</em>}</li>
 *   <li>{@link MyCollege.Matiere#getEnseigne_par <em>Enseigne par</em>}</li>
 *   <li>{@link MyCollege.Matiere#getEtudiants <em>Etudiants</em>}</li>
 * </ul>
 *
 * @see MyCollege.MyCollegePackage#getMatiere()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='codeUnique'"
 * @generated
 */
public interface Matiere extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see MyCollege.MyCollegePackage#getMatiere_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link MyCollege.Matiere#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see MyCollege.MyCollegePackage#getMatiere_Code()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link MyCollege.Matiere#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Enseigne par</b></em>' reference list.
	 * The list contents are of type {@link MyCollege.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseigne par</em>' reference list.
	 * @see MyCollege.MyCollegePackage#getMatiere_Enseigne_par()
	 * @model required="true"
	 * @generated
	 */
	EList<Enseignant> getEnseigne_par();

	/**
	 * Returns the value of the '<em><b>Etudiants</b></em>' containment reference list.
	 * The list contents are of type {@link MyCollege.Etudiant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiants</em>' containment reference list.
	 * @see MyCollege.MyCollegePackage#getMatiere_Etudiants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etudiant> getEtudiants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Matiere creer();

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
	void getPlan();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Matiere.allInstances()-&gt;one(m:Matiere | m.code=self.code)'"
	 * @generated
	 */
	boolean codeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Matiere
