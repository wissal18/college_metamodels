/**
 */
package MyCollege.impl;

import MyCollege.Enseignant;
import MyCollege.Etudiant;
import MyCollege.Matiere;
import MyCollege.MyCollegePackage;
import MyCollege.MyCollegeTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * An implementation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyCollege.impl.MatiereImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link MyCollege.impl.MatiereImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MyCollege.impl.MatiereImpl#getEnseigne_par <em>Enseigne par</em>}</li>
 *   <li>{@link MyCollege.impl.MatiereImpl#getEtudiants <em>Etudiants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatiereImpl extends MinimalEObjectImpl.Container implements Matiere {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseigne_par() <em>Enseigne par</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseigne_par()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> enseigne_par;

	/**
	 * The cached value of the '{@link #getEtudiants() <em>Etudiants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiants()
	 * @generated
	 * @ordered
	 */
	protected EList<Etudiant> etudiants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatiereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyCollegePackage.Literals.MATIERE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.MATIERE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyCollegePackage.MATIERE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEnseigne_par() {
		if (enseigne_par == null) {
			enseigne_par = new EObjectResolvingEList<Enseignant>(Enseignant.class, this, MyCollegePackage.MATIERE__ENSEIGNE_PAR);
		}
		return enseigne_par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Etudiant> getEtudiants() {
		if (etudiants == null) {
			etudiants = new EObjectContainmentEList<Etudiant>(Etudiant.class, this, MyCollegePackage.MATIERE__ETUDIANTS);
		}
		return etudiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere creer() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Matiere!creer()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifier() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Matiere!modifier()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficher() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Matiere!afficher()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPlan() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented platform;/resource/college/metamodels/MyCollege.ecore!Matiere!getPlan()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean codeUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Matiere::codeUnique";
		try {
			/**
			 *
			 * inv codeUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Matiere.allInstances()
			 *         ->one(m | m.code = self.code)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, MyCollegePackage.Literals.MATIERE___CODE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, MyCollegeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_MyCollege_c_c_Matiere = idResolver.getClass(MyCollegeTables.CLSSid_Matiere, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, MyCollegeTables.SET_CLSSid_Matiere, TYP_MyCollege_c_c_Matiere);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_m = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Matiere m = (Matiere)ITERATOR_m.next();
					/**
					 * m.code = self.code
					 */
					final /*@NonInvalid*/ String code = m.getCode();
					final /*@NonInvalid*/ String code_0 = this.getCode();
					final /*@NonInvalid*/ boolean eq = code.equals(code_0);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyCollegePackage.MATIERE__ETUDIANTS:
				return ((InternalEList<?>)getEtudiants()).basicRemove(otherEnd, msgs);
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
			case MyCollegePackage.MATIERE__NOM:
				return getNom();
			case MyCollegePackage.MATIERE__CODE:
				return getCode();
			case MyCollegePackage.MATIERE__ENSEIGNE_PAR:
				return getEnseigne_par();
			case MyCollegePackage.MATIERE__ETUDIANTS:
				return getEtudiants();
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
			case MyCollegePackage.MATIERE__NOM:
				setNom((String)newValue);
				return;
			case MyCollegePackage.MATIERE__CODE:
				setCode((String)newValue);
				return;
			case MyCollegePackage.MATIERE__ENSEIGNE_PAR:
				getEnseigne_par().clear();
				getEnseigne_par().addAll((Collection<? extends Enseignant>)newValue);
				return;
			case MyCollegePackage.MATIERE__ETUDIANTS:
				getEtudiants().clear();
				getEtudiants().addAll((Collection<? extends Etudiant>)newValue);
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
			case MyCollegePackage.MATIERE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MyCollegePackage.MATIERE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case MyCollegePackage.MATIERE__ENSEIGNE_PAR:
				getEnseigne_par().clear();
				return;
			case MyCollegePackage.MATIERE__ETUDIANTS:
				getEtudiants().clear();
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
			case MyCollegePackage.MATIERE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MyCollegePackage.MATIERE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case MyCollegePackage.MATIERE__ENSEIGNE_PAR:
				return enseigne_par != null && !enseigne_par.isEmpty();
			case MyCollegePackage.MATIERE__ETUDIANTS:
				return etudiants != null && !etudiants.isEmpty();
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
			case MyCollegePackage.MATIERE___CREER:
				return creer();
			case MyCollegePackage.MATIERE___MODIFIER:
				modifier();
				return null;
			case MyCollegePackage.MATIERE___AFFICHER:
				afficher();
				return null;
			case MyCollegePackage.MATIERE___GET_PLAN:
				getPlan();
				return null;
			case MyCollegePackage.MATIERE___CODE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return codeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //MatiereImpl
