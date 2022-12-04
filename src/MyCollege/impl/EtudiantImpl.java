/**
 */
package MyCollege.impl;

import MyCollege.Etudiant;
import MyCollege.Matiere;
import MyCollege.MyCollegePackage;
import MyCollege.Personne;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.EtudiantImpl#getFiliere <em>Filiere</em>}</li>
 *   <li>{@link MyCollege.impl.EtudiantImpl#getDate_entree <em>Date entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtudiantImpl extends PersonneImpl implements Etudiant {
	/**
	 * The default value of the '{@link #getFiliere() <em>Filiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiliere()
	 * @generated
	 * @ordered
	 */
	protected static final String FILIERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiliere() <em>Filiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiliere()
	 * @generated
	 * @ordered
	 */
	protected String filiere = FILIERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_entree() <em>Date entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_entree()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ENTREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_entree() <em>Date entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_entree()
	 * @generated
	 * @ordered
	 */
	protected Date date_entree = DATE_ENTREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtudiantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.ETUDIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiliere() {
		return filiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiliere(String newFiliere) {
		String oldFiliere = filiere;
		filiere = newFiliere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.ETUDIANT__FILIERE, oldFiliere, filiere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_entree() {
		return date_entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_entree(Date newDate_entree) {
		Date oldDate_entree = date_entree;
		date_entree = newDate_entree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.ETUDIANT__DATE_ENTREE, oldDate_entree, date_entree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne creer() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Etudiant!creer()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getMoyenne() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Etudiant!getMoyenne()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyCollegePackage.ETUDIANT__FILIERE:
				return getFiliere();
			case MyCollegePackage.ETUDIANT__DATE_ENTREE:
				return getDate_entree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyCollegePackage.ETUDIANT__FILIERE:
				setFiliere((String)newValue);
				return;
			case MyCollegePackage.ETUDIANT__DATE_ENTREE:
				setDate_entree((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyCollegePackage.ETUDIANT__FILIERE:
				setFiliere(FILIERE_EDEFAULT);
				return;
			case MyCollegePackage.ETUDIANT__DATE_ENTREE:
				setDate_entree(DATE_ENTREE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyCollegePackage.ETUDIANT__FILIERE:
				return FILIERE_EDEFAULT == null ? filiere != null : !FILIERE_EDEFAULT.equals(filiere);
			case MyCollegePackage.ETUDIANT__DATE_ENTREE:
				return DATE_ENTREE_EDEFAULT == null ? date_entree != null : !DATE_ENTREE_EDEFAULT.equals(date_entree);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Personne.class) {
			switch (baseOperationID) {
				case MyCollegePackage.PERSONNE___CREER: return MyCollegePackage.ETUDIANT___CREER;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MyCollegePackage.ETUDIANT___CREER:
				return creer();
			case MyCollegePackage.ETUDIANT___GET_MOYENNE:
				getMoyenne();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (filiere: ");
		result.append(filiere);
		result.append(", date_entree: ");
		result.append(date_entree);
		result.append(')');
		return result.toString();
	}

} //EtudiantImpl
