/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /college/MyCollege.ecore
 * using:
 *   /college/MyCollege.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package MyCollege;

// import MyCollege.MyCollegePackage;
// import MyCollege.MyCollegeTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * MyCollegeTables provides the dispatch tables for the MyCollege for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MyCollegeTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MyCollegePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore = IdManager.getNsURIPackageId("platform;/resource/college/metamodels/MyCollege.ecore", null, MyCollegePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = MyCollegeTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_College = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("College", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enseignant = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("Enseignant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Etudiant = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("Etudiant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Matiere = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("Matiere", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Personne = MyCollegeTables.PACKid_platform_59_s_resource_s_college_s_metamodels_s_MyCollege_ecore.getClassId("Personne", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = MyCollegeTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Enseignant = TypeId.BAG.getSpecializedId(MyCollegeTables.CLSSid_Enseignant);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Matiere = TypeId.BAG.getSpecializedId(MyCollegeTables.CLSSid_Matiere);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Departement = TypeId.ORDERED_SET.getSpecializedId(MyCollegeTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enseignant = TypeId.ORDERED_SET.getSpecializedId(MyCollegeTables.CLSSid_Enseignant);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Etudiant = TypeId.ORDERED_SET.getSpecializedId(MyCollegeTables.CLSSid_Etudiant);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Matiere = TypeId.ORDERED_SET.getSpecializedId(MyCollegeTables.CLSSid_Matiere);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Matiere = TypeId.SET.getSpecializedId(MyCollegeTables.CLSSid_Matiere);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Personne = TypeId.SET.getSpecializedId(MyCollegeTables.CLSSid_Personne);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MyCollegeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _College = new EcoreExecutorType(MyCollegePackage.Literals.COLLEGE, PACKAGE, 0);
		public static final EcoreExecutorType _Departement = new EcoreExecutorType(MyCollegePackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Enseignant = new EcoreExecutorType(MyCollegePackage.Literals.ENSEIGNANT, PACKAGE, 0);
		public static final EcoreExecutorType _Etudiant = new EcoreExecutorType(MyCollegePackage.Literals.ETUDIANT, PACKAGE, 0);
		public static final EcoreExecutorType _Matiere = new EcoreExecutorType(MyCollegePackage.Literals.MATIERE, PACKAGE, 0);
		public static final EcoreExecutorType _Personne = new EcoreExecutorType(MyCollegePackage.Literals.PERSONNE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_College,
			_Departement,
			_Enseignant,
			_Etudiant,
			_Matiere,
			_Personne
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _College__College = new ExecutorFragment(Types._College, MyCollegeTables.Types._College);
		private static final ExecutorFragment _College__OclAny = new ExecutorFragment(Types._College, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _College__OclElement = new ExecutorFragment(Types._College, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, MyCollegeTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enseignant__Enseignant = new ExecutorFragment(Types._Enseignant, MyCollegeTables.Types._Enseignant);
		private static final ExecutorFragment _Enseignant__OclAny = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enseignant__OclElement = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Enseignant__Personne = new ExecutorFragment(Types._Enseignant, MyCollegeTables.Types._Personne);

		private static final ExecutorFragment _Etudiant__Etudiant = new ExecutorFragment(Types._Etudiant, MyCollegeTables.Types._Etudiant);
		private static final ExecutorFragment _Etudiant__OclAny = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Etudiant__OclElement = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Etudiant__Personne = new ExecutorFragment(Types._Etudiant, MyCollegeTables.Types._Personne);

		private static final ExecutorFragment _Matiere__Matiere = new ExecutorFragment(Types._Matiere, MyCollegeTables.Types._Matiere);
		private static final ExecutorFragment _Matiere__OclAny = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Matiere__OclElement = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Personne__OclAny = new ExecutorFragment(Types._Personne, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Personne__OclElement = new ExecutorFragment(Types._Personne, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Personne__Personne = new ExecutorFragment(Types._Personne, MyCollegeTables.Types._Personne);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _College__afficher = new ExecutorOperation("afficher", TypeUtil.EMPTY_PARAMETER_TYPES, Types._College,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _College__creer = new ExecutorOperation("creer", TypeUtil.EMPTY_PARAMETER_TYPES, Types._College,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _College__modifier = new ExecutorOperation("modifier", TypeUtil.EMPTY_PARAMETER_TYPES, Types._College,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Departement__afficher = new ExecutorOperation("afficher", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Departement,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Departement__creer = new ExecutorOperation("creer", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Departement,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Departement__getRapport = new ExecutorOperation("getRapport", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Departement,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Departement__modifier = new ExecutorOperation("modifier", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Departement,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Etudiant__creer = new ExecutorOperation("creer", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Etudiant__getMoyenne = new ExecutorOperation("getMoyenne", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Matiere__afficher = new ExecutorOperation("afficher", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Matiere,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Matiere__creer = new ExecutorOperation("creer", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Matiere,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Matiere__getPlan = new ExecutorOperation("getPlan", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Matiere,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Matiere__modifier = new ExecutorOperation("modifier", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Matiere,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Personne__afficher = new ExecutorOperation("afficher", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Personne,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Personne__creer = new ExecutorOperation("creer", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Personne,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Personne__getRapport = new ExecutorOperation("getRapport", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Personne,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Personne__modifier = new ExecutorOperation("modifier", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Personne,
			3, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _College__departements = new EcoreExecutorProperty(MyCollegePackage.Literals.COLLEGE__DEPARTEMENTS, Types._College, 0);
		public static final ExecutorProperty _College__siteWeb = new EcoreExecutorProperty(MyCollegePackage.Literals.COLLEGE__SITE_WEB, Types._College, 1);

		public static final ExecutorProperty _Departement__enseignants = new EcoreExecutorProperty(MyCollegePackage.Literals.DEPARTEMENT__ENSEIGNANTS, Types._Departement, 0);
		public static final ExecutorProperty _Departement__matieres = new EcoreExecutorProperty(MyCollegePackage.Literals.DEPARTEMENT__MATIERES, Types._Departement, 1);
		public static final ExecutorProperty _Departement__nom = new EcoreExecutorProperty(MyCollegePackage.Literals.DEPARTEMENT__NOM, Types._Departement, 2);
		public static final ExecutorProperty _Departement__College__departements = new ExecutorPropertyWithImplementation("College", Types._Departement, 3, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.COLLEGE__DEPARTEMENTS));

		public static final ExecutorProperty _Enseignant__date_emploie = new EcoreExecutorProperty(MyCollegePackage.Literals.ENSEIGNANT__DATE_EMPLOIE, Types._Enseignant, 0);
		public static final ExecutorProperty _Enseignant__enseigne = new EcoreExecutorProperty(MyCollegePackage.Literals.ENSEIGNANT__ENSEIGNE, Types._Enseignant, 1);
		public static final ExecutorProperty _Enseignant__grade = new EcoreExecutorProperty(MyCollegePackage.Literals.ENSEIGNANT__GRADE, Types._Enseignant, 2);
		public static final ExecutorProperty _Enseignant__Departement__enseignants = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 3, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.DEPARTEMENT__ENSEIGNANTS));
		public static final ExecutorProperty _Enseignant__Matiere__enseigne_par = new ExecutorPropertyWithImplementation("Matiere", Types._Enseignant, 4, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.MATIERE__ENSEIGNE_PAR));

		public static final ExecutorProperty _Etudiant__date_entree = new EcoreExecutorProperty(MyCollegePackage.Literals.ETUDIANT__DATE_ENTREE, Types._Etudiant, 0);
		public static final ExecutorProperty _Etudiant__filiere = new EcoreExecutorProperty(MyCollegePackage.Literals.ETUDIANT__FILIERE, Types._Etudiant, 1);
		public static final ExecutorProperty _Etudiant__Matiere__etudiants = new ExecutorPropertyWithImplementation("Matiere", Types._Etudiant, 2, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.MATIERE__ETUDIANTS));

		public static final ExecutorProperty _Matiere__code = new EcoreExecutorProperty(MyCollegePackage.Literals.MATIERE__CODE, Types._Matiere, 0);
		public static final ExecutorProperty _Matiere__enseigne_par = new EcoreExecutorProperty(MyCollegePackage.Literals.MATIERE__ENSEIGNE_PAR, Types._Matiere, 1);
		public static final ExecutorProperty _Matiere__etudiants = new EcoreExecutorProperty(MyCollegePackage.Literals.MATIERE__ETUDIANTS, Types._Matiere, 2);
		public static final ExecutorProperty _Matiere__nom = new EcoreExecutorProperty(MyCollegePackage.Literals.MATIERE__NOM, Types._Matiere, 3);
		public static final ExecutorProperty _Matiere__Departement__matieres = new ExecutorPropertyWithImplementation("Departement", Types._Matiere, 4, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.DEPARTEMENT__MATIERES));
		public static final ExecutorProperty _Matiere__Enseignant__enseigne = new ExecutorPropertyWithImplementation("Enseignant", Types._Matiere, 5, new EcoreLibraryOppositeProperty(MyCollegePackage.Literals.ENSEIGNANT__ENSEIGNE));

		public static final ExecutorProperty _Personne__ID = new EcoreExecutorProperty(MyCollegePackage.Literals.PERSONNE__ID, Types._Personne, 0);
		public static final ExecutorProperty _Personne__email = new EcoreExecutorProperty(MyCollegePackage.Literals.PERSONNE__EMAIL, Types._Personne, 1);
		public static final ExecutorProperty _Personne__nom = new EcoreExecutorProperty(MyCollegePackage.Literals.PERSONNE__NOM, Types._Personne, 2);
		public static final ExecutorProperty _Personne__num_tel = new EcoreExecutorProperty(MyCollegePackage.Literals.PERSONNE__NUM_TEL, Types._Personne, 3);
		public static final ExecutorProperty _Personne__prenom = new EcoreExecutorProperty(MyCollegePackage.Literals.PERSONNE__PRENOM, Types._Personne, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _College =
			{
				Fragments._College__OclAny /* 0 */,
				Fragments._College__OclElement /* 1 */,
				Fragments._College__College /* 2 */
			};
		private static final int /*@NonNull*/ [] __College = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enseignant =
			{
				Fragments._Enseignant__OclAny /* 0 */,
				Fragments._Enseignant__OclElement /* 1 */,
				Fragments._Enseignant__Personne /* 2 */,
				Fragments._Enseignant__Enseignant /* 3 */
			};
		private static final int /*@NonNull*/ [] __Enseignant = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Etudiant =
			{
				Fragments._Etudiant__OclAny /* 0 */,
				Fragments._Etudiant__OclElement /* 1 */,
				Fragments._Etudiant__Personne /* 2 */,
				Fragments._Etudiant__Etudiant /* 3 */
			};
		private static final int /*@NonNull*/ [] __Etudiant = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Matiere =
			{
				Fragments._Matiere__OclAny /* 0 */,
				Fragments._Matiere__OclElement /* 1 */,
				Fragments._Matiere__Matiere /* 2 */
			};
		private static final int /*@NonNull*/ [] __Matiere = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Personne =
			{
				Fragments._Personne__OclAny /* 0 */,
				Fragments._Personne__OclElement /* 1 */,
				Fragments._Personne__Personne /* 2 */
			};
		private static final int /*@NonNull*/ [] __Personne = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._College.initFragments(_College, __College);
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Enseignant.initFragments(_Enseignant, __Enseignant);
			Types._Etudiant.initFragments(_Etudiant, __Etudiant);
			Types._Matiere.initFragments(_Matiere, __Matiere);
			Types._Personne.initFragments(_Personne, __Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _College__College = {
			MyCollegeTables.Operations._College__afficher /* afficher() */,
			MyCollegeTables.Operations._College__creer /* creer() */,
			MyCollegeTables.Operations._College__modifier /* modifier() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _College__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _College__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {
			MyCollegeTables.Operations._Departement__afficher /* afficher() */,
			MyCollegeTables.Operations._Departement__creer /* creer() */,
			MyCollegeTables.Operations._Departement__getRapport /* getRapport() */,
			MyCollegeTables.Operations._Departement__modifier /* modifier() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__Enseignant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__Personne = {
			MyCollegeTables.Operations._Personne__afficher /* afficher() */,
			MyCollegeTables.Operations._Personne__creer /* creer() */,
			MyCollegeTables.Operations._Personne__getRapport /* getRapport() */,
			MyCollegeTables.Operations._Personne__modifier /* modifier() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__Etudiant = {
			MyCollegeTables.Operations._Etudiant__creer /* creer() */,
			MyCollegeTables.Operations._Etudiant__getMoyenne /* getMoyenne() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__Personne = {
			MyCollegeTables.Operations._Personne__afficher /* afficher() */,
			MyCollegeTables.Operations._Etudiant__creer /* creer() */,
			MyCollegeTables.Operations._Personne__getRapport /* getRapport() */,
			MyCollegeTables.Operations._Personne__modifier /* modifier() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__Matiere = {
			MyCollegeTables.Operations._Matiere__afficher /* afficher() */,
			MyCollegeTables.Operations._Matiere__creer /* creer() */,
			MyCollegeTables.Operations._Matiere__getPlan /* getPlan() */,
			MyCollegeTables.Operations._Matiere__modifier /* modifier() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Personne__Personne = {
			MyCollegeTables.Operations._Personne__afficher /* afficher() */,
			MyCollegeTables.Operations._Personne__creer /* creer() */,
			MyCollegeTables.Operations._Personne__getRapport /* getRapport() */,
			MyCollegeTables.Operations._Personne__modifier /* modifier() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Personne__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Personne__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._College__College.initOperations(_College__College);
			Fragments._College__OclAny.initOperations(_College__OclAny);
			Fragments._College__OclElement.initOperations(_College__OclElement);

			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Enseignant__Enseignant.initOperations(_Enseignant__Enseignant);
			Fragments._Enseignant__OclAny.initOperations(_Enseignant__OclAny);
			Fragments._Enseignant__OclElement.initOperations(_Enseignant__OclElement);
			Fragments._Enseignant__Personne.initOperations(_Enseignant__Personne);

			Fragments._Etudiant__Etudiant.initOperations(_Etudiant__Etudiant);
			Fragments._Etudiant__OclAny.initOperations(_Etudiant__OclAny);
			Fragments._Etudiant__OclElement.initOperations(_Etudiant__OclElement);
			Fragments._Etudiant__Personne.initOperations(_Etudiant__Personne);

			Fragments._Matiere__Matiere.initOperations(_Matiere__Matiere);
			Fragments._Matiere__OclAny.initOperations(_Matiere__OclAny);
			Fragments._Matiere__OclElement.initOperations(_Matiere__OclElement);

			Fragments._Personne__OclAny.initOperations(_Personne__OclAny);
			Fragments._Personne__OclElement.initOperations(_Personne__OclElement);
			Fragments._Personne__Personne.initOperations(_Personne__Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _College = {
			MyCollegeTables.Properties._College__departements,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MyCollegeTables.Properties._College__siteWeb
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			MyCollegeTables.Properties._Departement__enseignants,
			MyCollegeTables.Properties._Departement__matieres,
			MyCollegeTables.Properties._Departement__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enseignant = {
			MyCollegeTables.Properties._Personne__ID,
			MyCollegeTables.Properties._Enseignant__date_emploie,
			MyCollegeTables.Properties._Personne__email,
			MyCollegeTables.Properties._Enseignant__enseigne,
			MyCollegeTables.Properties._Enseignant__grade,
			MyCollegeTables.Properties._Personne__nom,
			MyCollegeTables.Properties._Personne__num_tel,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MyCollegeTables.Properties._Personne__prenom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Etudiant = {
			MyCollegeTables.Properties._Personne__ID,
			MyCollegeTables.Properties._Etudiant__date_entree,
			MyCollegeTables.Properties._Personne__email,
			MyCollegeTables.Properties._Etudiant__filiere,
			MyCollegeTables.Properties._Personne__nom,
			MyCollegeTables.Properties._Personne__num_tel,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MyCollegeTables.Properties._Personne__prenom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Matiere = {
			MyCollegeTables.Properties._Matiere__code,
			MyCollegeTables.Properties._Matiere__enseigne_par,
			MyCollegeTables.Properties._Matiere__etudiants,
			MyCollegeTables.Properties._Matiere__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Personne = {
			MyCollegeTables.Properties._Personne__ID,
			MyCollegeTables.Properties._Personne__email,
			MyCollegeTables.Properties._Personne__nom,
			MyCollegeTables.Properties._Personne__num_tel,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MyCollegeTables.Properties._Personne__prenom
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._College__College.initProperties(_College);
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Enseignant__Enseignant.initProperties(_Enseignant);
			Fragments._Etudiant__Etudiant.initProperties(_Etudiant);
			Fragments._Matiere__Matiere.initProperties(_Matiere);
			Fragments._Personne__Personne.initProperties(_Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MyCollegeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new MyCollegeTables();
	}

	private MyCollegeTables() {
		super(MyCollegePackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		MyCollegePackage.Literals.MATIERE,
		MyCollegePackage.Literals.PERSONNE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
