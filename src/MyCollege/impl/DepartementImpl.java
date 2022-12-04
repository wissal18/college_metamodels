/**
 */
package MyCollege.impl;

import MyCollege.Departement;
import MyCollege.Enseignant;
import MyCollege.Matiere;
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
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.DepartementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link MyCollege.impl.DepartementImpl#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link MyCollege.impl.DepartementImpl#getMatieres <em>Matieres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends MinimalEObjectImpl.Container implements Departement {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseignants() <em>Enseignants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignants()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> enseignants;

	/**
	 * The cached value of the '{@link #getMatieres() <em>Matieres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatieres()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> matieres;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.DEPARTEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.DEPARTEMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectContainmentEList<Enseignant>(Enseignant.class, this, MyCollegePackage.DEPARTEMENT__ENSEIGNANTS);
		}
		return enseignants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getMatieres() {
		if (matieres == null) {
			matieres = new EObjectContainmentEList<Matiere>(Matiere.class, this, MyCollegePackage.DEPARTEMENT__MATIERES);
		}
		return matieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement creer() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Departement!creer()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifier() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Departement!modifier()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficher() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Departement!afficher()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRapport() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Departement!getRapport()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyCollegePackage.DEPARTEMENT__ENSEIGNANTS:
				return ((InternalEList<?>)getEnseignants()).basicRemove(otherEnd, msgs);
			case MyCollegePackage.DEPARTEMENT__MATIERES:
				return ((InternalEList<?>)getMatieres()).basicRemove(otherEnd, msgs);
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
			case MyCollegePackage.DEPARTEMENT__NOM:
				return getNom();
			case MyCollegePackage.DEPARTEMENT__ENSEIGNANTS:
				return getEnseignants();
			case MyCollegePackage.DEPARTEMENT__MATIERES:
				return getMatieres();
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
			case MyCollegePackage.DEPARTEMENT__NOM:
				setNom((String)newValue);
				return;
			case MyCollegePackage.DEPARTEMENT__ENSEIGNANTS:
				getEnseignants().clear();
				getEnseignants().addAll((Collection<? extends Enseignant>)newValue);
				return;
			case MyCollegePackage.DEPARTEMENT__MATIERES:
				getMatieres().clear();
				getMatieres().addAll((Collection<? extends Matiere>)newValue);
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
			case MyCollegePackage.DEPARTEMENT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MyCollegePackage.DEPARTEMENT__ENSEIGNANTS:
				getEnseignants().clear();
				return;
			case MyCollegePackage.DEPARTEMENT__MATIERES:
				getMatieres().clear();
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
			case MyCollegePackage.DEPARTEMENT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MyCollegePackage.DEPARTEMENT__ENSEIGNANTS:
				return enseignants != null && !enseignants.isEmpty();
			case MyCollegePackage.DEPARTEMENT__MATIERES:
				return matieres != null && !matieres.isEmpty();
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
			case MyCollegePackage.DEPARTEMENT___CREER:
				return creer();
			case MyCollegePackage.DEPARTEMENT___MODIFIER:
				modifier();
				return null;
			case MyCollegePackage.DEPARTEMENT___AFFICHER:
				afficher();
				return null;
			case MyCollegePackage.DEPARTEMENT___GET_RAPPORT:
				getRapport();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //DepartementImpl
