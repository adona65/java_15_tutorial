package tutorial_000.languageNewFeatures;

public class _000_SealedClasses {

	public static void main(String[] args) {
		/*
		 * Sealed Classes are a preview feature that allow to control inheritance in Java. This new feature works as follow :
		 * - A sealed class is declared using "sealed" keyword.
		 * - A sealed class allow to declare which class can inherit from it using "permits" keyword.
		 * - A class extending a sealed class must be declared as "sealed", "non-sealed" (another new keyword) or "final".
		 * 
		 * This behavior helps to finally manage a finite and determinable hierarchy of classes in inheritance tree. Let see bellow examples :
		 * 
		 	// Here, we define that "Person" class may be inherited only by "Employee" or "Manager" classes.
		 	abstract sealed class Person permits Employee, Manager {}
		 	
		 	// Here, "Employee" can inherit from "Person". We defined it as final because we must.
		 	final class Employee extends Person {}
		 	
		 	// Another example of allowed inheritance of "Person" class, for a non-sealed class.
		 	non-sealed class Manager extends Person {}
		 *
		 */
	}
}
