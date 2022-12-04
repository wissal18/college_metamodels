/**
 */
package MyCollege.util;

import MyCollege.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MyCollege.MyCollegePackage
 * @generated
 */
public class MyCollegeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyCollegePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyCollegeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MyCollegePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyCollegeSwitch<Adapter> modelSwitch =
		new MyCollegeSwitch<Adapter>() {
			@Override
			public Adapter caseCollege(College object) {
				return createCollegeAdapter();
			}
			@Override
			public Adapter caseDepartement(Departement object) {
				return createDepartementAdapter();
			}
			@Override
			public Adapter casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			@Override
			public Adapter caseEnseignant(Enseignant object) {
				return createEnseignantAdapter();
			}
			@Override
			public Adapter caseEtudiant(Etudiant object) {
				return createEtudiantAdapter();
			}
			@Override
			public Adapter caseMatiere(Matiere object) {
				return createMatiereAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.College <em>College</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.College
	 * @generated
	 */
	public Adapter createCollegeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.Departement
	 * @generated
	 */
	public Adapter createDepartementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.Enseignant
	 * @generated
	 */
	public Adapter createEnseignantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.Etudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.Etudiant
	 * @generated
	 */
	public Adapter createEtudiantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MyCollege.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MyCollege.Matiere
	 * @generated
	 */
	public Adapter createMatiereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MyCollegeAdapterFactory
