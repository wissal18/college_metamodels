/**
 */
package MyCollege.impl;

import MyCollege.MyCollegePackage;
import MyCollege.MyCollegeTables;
import MyCollege.Personne;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link MyCollege.impl.PersonneImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link MyCollege.impl.PersonneImpl#getNum_tel <em>Num tel</em>}</li>
 *   <li>{@link MyCollege.impl.PersonneImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link MyCollege.impl.PersonneImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonneImpl extends MinimalEObjectImpl.Container implements Personne {
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
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_tel() <em>Num tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_tel()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_TEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_tel() <em>Num tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_tel()
	 * @generated
	 * @ordered
	 */
	protected String num_tel = NUM_TEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.PERSONNE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.PERSONNE__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNum_tel() {
		return num_tel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_tel(String newNum_tel) {
		String oldNum_tel = num_tel;
		num_tel = newNum_tel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.PERSONNE__NUM_TEL, oldNum_tel, num_tel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.PERSONNE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.PERSONNE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne creer() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Personne!creer()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifier() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Personne!modifier()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficher() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Personne!afficher()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRapport() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Personne!getRapport()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean idUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Personne::idUnique";
		try {
			/**
			 *
			 * inv idUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Personne.allInstances()->one(p | p.ID = self.ID)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MyCollegePackage.Literals.PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MyCollegeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_MyCollege_c_c_Personne = idResolver.getClass(MyCollegeTables.CLSSid_Personne, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, MyCollegeTables.SET_CLSSid_Personne, TYP_MyCollege_c_c_Personne);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Personne p = (Personne)ITERATOR_p.next();
					/**
					 * p.ID = self.ID
					 */
					final /*@NonInvalid*/ String ID = p.getID();
					final /*@NonInvalid*/ String ID_0 = this.getID();
					final /*@NonInvalid*/ boolean eq = ID.equals(ID_0);
					//
					if (eq) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, MyCollegeTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyCollegePackage.PERSONNE__NOM:
				return getNom();
			case MyCollegePackage.PERSONNE__PRENOM:
				return getPrenom();
			case MyCollegePackage.PERSONNE__NUM_TEL:
				return getNum_tel();
			case MyCollegePackage.PERSONNE__EMAIL:
				return getEmail();
			case MyCollegePackage.PERSONNE__ID:
				return getID();
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
			case MyCollegePackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case MyCollegePackage.PERSONNE__PRENOM:
				setPrenom((String)newValue);
				return;
			case MyCollegePackage.PERSONNE__NUM_TEL:
				setNum_tel((String)newValue);
				return;
			case MyCollegePackage.PERSONNE__EMAIL:
				setEmail((String)newValue);
				return;
			case MyCollegePackage.PERSONNE__ID:
				setID((String)newValue);
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
			case MyCollegePackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MyCollegePackage.PERSONNE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case MyCollegePackage.PERSONNE__NUM_TEL:
				setNum_tel(NUM_TEL_EDEFAULT);
				return;
			case MyCollegePackage.PERSONNE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case MyCollegePackage.PERSONNE__ID:
				setID(ID_EDEFAULT);
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
			case MyCollegePackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MyCollegePackage.PERSONNE__PRENOM:
				return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
			case MyCollegePackage.PERSONNE__NUM_TEL:
				return NUM_TEL_EDEFAULT == null ? num_tel != null : !NUM_TEL_EDEFAULT.equals(num_tel);
			case MyCollegePackage.PERSONNE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case MyCollegePackage.PERSONNE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MyCollegePackage.PERSONNE___CREER:
				return creer();
			case MyCollegePackage.PERSONNE___MODIFIER:
				modifier();
				return null;
			case MyCollegePackage.PERSONNE___AFFICHER:
				afficher();
				return null;
			case MyCollegePackage.PERSONNE___GET_RAPPORT:
				getRapport();
				return null;
			case MyCollegePackage.PERSONNE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return idUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", num_tel: ");
		result.append(num_tel);
		result.append(", email: ");
		result.append(email);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
