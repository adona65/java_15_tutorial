package tutorial_000.languageNewFeatures;

public class _002_TextBlocks {

	public static void main(String[] args) {
		/*
		 * Java 13 added Text Blocks as preview feature for working easily with multi-line Strings. It was still a preview feature
		 * with version 14 of Java. With Java 15, Text Block are finally released.
		 * 
         * The goal of this feature is to easily handle complex multiline 
		 * strings like JSON/XML/HTML :
		 *   - It allow to write multiline strings without using line breakers like \r\n, or need to escape chars.
		 *   - Text Block string have the same methods as other strings like contains(), indexOf(), length() (it's still a String object).
		 *  
		 * Lets assume we would like to write a string that contains JSon formated text. We could write the following :
		 */
		String stringJSON = "{\r\n" 
         		+ "\"Name\" : \"Toto\",\r\n" 
         		+ "\"Registration_number\" : \"32\"\r\n" 
         		+ "}";
		
		System.out.println(stringJSON);
		System.out.println("---------------------------------------------");
		
		/*  
		 * With Text Blocks, we just have to normally type our string (without line breakers or char to escape), and surround 
		 * it with """ (triple double-quote). Beware, the opening triple-double quotes must be followed by a line terminator :
		 */
		String textBlockJSON = """
          {
             "Name" : "Toto",
             "Registration_number" : "32"
          }""";
		   	
		System.out.println(textBlockJSON);
		System.out.println("---------------------------------------------");
		
        /*
         * String created with Text Blocks and string created without it but including line breaker chars are equals :
         */ 
        String textBlock = """
        		Hello
        		Mister""";
			
	    String str = "Hello\nMister";
	    
	    System.out.println(textBlock.equals(str)); // return "true".
	    System.out.println(textBlock == str);// return "true".
	    System.out.println("---------------------------------------------");
	    
	    /* 
		 * New methods are also added to String for working with Text Blocks :
		 *   - stripIndent() : used to remove the incidental white space characters from the beginning and end of every line in the text block.
		 *   	It doesn't modify the indentation inside the content (doesn't replace "\t" tabulations).
		 *   - translateEscapes() : translate the escape sequences as per the string syntax (as if in a string literal). For example,
		 *      translates escape sequences such as “\\t” to “\t”
		 *   - formatted() : similar to String format() method to support formatting in text block strings.
		 *   
		 * For example, we may write the previous code snippet like this :
		 */
	    String newTextBlockJSON = """
		         {
		            "Name" : "%s",
		            "Registration_number" : "%s"
		         }""".formatted("Toto", "32");
	    
		System.out.println(newTextBlockJSON);
		System.out.println("---------------------------------------------");
		
		/*
		 * Finally, we will note that we have the possibility to use:  
		 * - "\" char to indicate the end of a line (it must be the last char of the line).
		 * - "\s" in place of a single space.
		 */
		String firstString = "Hello  , I try Java 14 new features.";
		
		String secondString = """
			    Hello\s\s,\sI\stry \
			    Java 14 new features.""";
		
		System.out.println(firstString);
		System.out.println(secondString);
	}
}
