/**
 */
package MyCollege.util;

import MyCollege.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MyCollege.MyCollegePackage
 * @generated
 */
public class MyCollegeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MyCollegeValidator INSTANCE = new MyCollegeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MyCollege";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique' of 'Personne'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSONNE__ID_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Code Unique' of 'Matiere'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATIERE__CODE_UNIQUE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyCollegeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MyCollegePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MyCollegePackage.COLLEGE:
				return validateCollege((College)value, diagnostics, context);
			case MyCollegePackage.DEPARTEMENT:
				return validateDepartement((Departement)value, diagnostics, context);
			case MyCollegePackage.PERSONNE:
				return validatePersonne((Personne)value, diagnostics, context);
			case MyCollegePackage.ENSEIGNANT:
				return validateEnseignant((Enseignant)value, diagnostics, context);
			case MyCollegePackage.ETUDIANT:
				return validateEtudiant((Etudiant)value, diagnostics, context);
			case MyCollegePackage.MATIERE:
				return validateMatiere((Matiere)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollege(College college, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(college, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(departement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(personne, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personne, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_idUnique(personne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idUnique constraint of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne_idUnique(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return personne.idUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnseignant(Enseignant enseignant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enseignant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_idUnique(enseignant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtudiant(Etudiant etudiant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(etudiant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonne_idUnique(etudiant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatiere(Matiere matiere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(matiere, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(matiere, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatiere_codeUnique(matiere, diagnostics, context);
		return result;
	}

	/**
	 * Validates the codeUnique constraint of '<em>Matiere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatiere_codeUnique(Matiere matiere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return matiere.codeUnique(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MyCollegeValidator
