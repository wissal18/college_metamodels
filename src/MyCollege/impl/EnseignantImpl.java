/**
 */
package MyCollege.impl;

import MyCollege.Enseignant;
import MyCollege.Matiere;
import MyCollege.MyCollegePackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.EnseignantImpl#getDate_emploie <em>Date emploie</em>}</li>
 *   <li>{@link MyCollege.impl.EnseignantImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link MyCollege.impl.EnseignantImpl#getEnseigne <em>Enseigne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnseignantImpl extends PersonneImpl implements Enseignant {
	/**
	 * The default value of the '{@link #getDate_emploie() <em>Date emploie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_emploie()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EMPLOIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_emploie() <em>Date emploie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_emploie()
	 * @generated
	 * @ordered
	 */
	protected Date date_emploie = DATE_EMPLOIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseigne() <em>Enseigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseigne()
	 * @generated
	 * @ordered
	 */
	protected Matiere enseigne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnseignantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.ENSEIGNANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_emploie() {
		return date_emploie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_emploie(Date newDate_emploie) {
		Date oldDate_emploie = date_emploie;
		date_emploie = newDate_emploie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.ENSEIGNANT__DATE_EMPLOIE, oldDate_emploie, date_emploie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(String newGrade) {
		String oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.ENSEIGNANT__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere getEnseigne() {
		if (enseigne != null && enseigne.eIsProxy()) {
			InternalEObject oldEnseigne = (InternalEObject)enseigne;
			enseigne = (Matiere)eResolveProxy(oldEnseigne);
			if (enseigne != oldEnseigne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyCollegePackage.ENSEIGNANT__ENSEIGNE, oldEnseigne, enseigne));
			}
		}
		return enseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere basicGetEnseigne() {
		return enseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnseigne(Matiere newEnseigne) {
		Matiere oldEnseigne = enseigne;
		enseigne = newEnseigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.ENSEIGNANT__ENSEIGNE, oldEnseigne, enseigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyCollegePackage.ENSEIGNANT__DATE_EMPLOIE:
				return getDate_emploie();
			case MyCollegePackage.ENSEIGNANT__GRADE:
				return getGrade();
			case MyCollegePackage.ENSEIGNANT__ENSEIGNE:
				if (resolve) return getEnseigne();
				return basicGetEnseigne();
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
			case MyCollegePackage.ENSEIGNANT__DATE_EMPLOIE:
				setDate_emploie((Date)newValue);
				return;
			case MyCollegePackage.ENSEIGNANT__GRADE:
				setGrade((String)newValue);
				return;
			case MyCollegePackage.ENSEIGNANT__ENSEIGNE:
				setEnseigne((Matiere)newValue);
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
			case MyCollegePackage.ENSEIGNANT__DATE_EMPLOIE:
				setDate_emploie(DATE_EMPLOIE_EDEFAULT);
				return;
			case MyCollegePackage.ENSEIGNANT__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case MyCollegePackage.ENSEIGNANT__ENSEIGNE:
				setEnseigne((Matiere)null);
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
			case MyCollegePackage.ENSEIGNANT__DATE_EMPLOIE:
				return DATE_EMPLOIE_EDEFAULT == null ? date_emploie != null : !DATE_EMPLOIE_EDEFAULT.equals(date_emploie);
			case MyCollegePackage.ENSEIGNANT__GRADE:
				return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
			case MyCollegePackage.ENSEIGNANT__ENSEIGNE:
				return enseigne != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (date_emploie: ");
		result.append(date_emploie);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //EnseignantImpl
