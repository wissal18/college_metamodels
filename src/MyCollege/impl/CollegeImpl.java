/**
 */
package MyCollege.impl;

import MyCollege.College;
import MyCollege.Departement;
import MyCollege.MyCollegePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>College</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.CollegeImpl#getSiteWeb <em>Site Web</em>}</li>
 *   <li>{@link MyCollege.impl.CollegeImpl#getDepartements <em>Departements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollegeImpl extends MinimalEObjectImpl.Container implements College {
	/**
	 * The default value of the '{@link #getSiteWeb() <em>Site Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteWeb()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_WEB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteWeb() <em>Site Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteWeb()
	 * @generated
	 * @ordered
	 */
	protected String siteWeb = SITE_WEB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartements() <em>Departements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartements()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> departements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.COLLEGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteWeb() {
		return siteWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteWeb(String newSiteWeb) {
		String oldSiteWeb = siteWeb;
		siteWeb = newSiteWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.COLLEGE__SITE_WEB, oldSiteWeb, siteWeb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getDepartements() {
		if (departements == null) {
			departements = new EObjectContainmentEList<Departement>(Departement.class, this, MyCollegePackage.COLLEGE__DEPARTEMENTS);
		}
		return departements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public College creer() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!College!creer()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifier() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!College!modifier()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficher() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!College!afficher()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyCollegePackage.COLLEGE__DEPARTEMENTS:
				return ((InternalEList<?>)getDepartements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyCollegePackage.COLLEGE__SITE_WEB:
				return getSiteWeb();
			case MyCollegePackage.COLLEGE__DEPARTEMENTS:
				return getDepartements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyCollegePackage.COLLEGE__SITE_WEB:
				setSiteWeb((String)newValue);
				return;
			case MyCollegePackage.COLLEGE__DEPARTEMENTS:
				getDepartements().clear();
				getDepartements().addAll((Collection<? extends Departement>)newValue);
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
			case MyCollegePackage.COLLEGE__SITE_WEB:
				setSiteWeb(SITE_WEB_EDEFAULT);
				return;
			case MyCollegePackage.COLLEGE__DEPARTEMENTS:
				getDepartements().clear();
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
			case MyCollegePackage.COLLEGE__SITE_WEB:
				return SITE_WEB_EDEFAULT == null ? siteWeb != null : !SITE_WEB_EDEFAULT.equals(siteWeb);
			case MyCollegePackage.COLLEGE__DEPARTEMENTS:
				return departements != null && !departements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MyCollegePackage.COLLEGE___CREER:
				return creer();
			case MyCollegePackage.COLLEGE___MODIFIER:
				modifier();
				return null;
			case MyCollegePackage.COLLEGE___AFFICHER:
				afficher();
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
		result.append(" (siteWeb: ");
		result.append(siteWeb);
		result.append(')');
		return result.toString();
	}

} //CollegeImpl
