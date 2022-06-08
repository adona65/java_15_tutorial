package tutorial_000.languageNewFeatures;

public class _003_Records {

	public static void main(String[] args) {
		/*
		 * Java 14 introduced Records as a preview feature. For reminder, it allow developers to easily create POJO classes.
		 * 
		 * For example :
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	record SingleRecord(){}
			record RecordWithParameters (String name, String topic) {}
		 *
		 * And for instantiate it, we use classical java, as for any other objects :
		 * 
		   // Commented in order to avoid compilation error if preview features are not activated.
		   RecordWithParameters myRecord = new RecordWithParameters("Toto", "This is a record");
		 * 
		 * Records are still a preview feature in Java 15, but some additions are done :
		 * - native methods cannot be declared in records.
		 * - implicit fields of record are not final and modification using reflection will throw IllegalAccessException.
		 * 
		 * Records may also works with the "sealed" preview feature. As records are final by default and can extend interfaces, we are
		 * allowed to define sealed interfaces then let record implement them :
		 * 
		 	// Commented in order to avoid compilation error if preview features are not activated.
		 	sealed interface MyInterface permits RecordWithParameters {
			   int id();
			   String name();
			}
			
			record RecordWithParameters(int id, String name) implements MyInterface {}
		 */
	}
}
