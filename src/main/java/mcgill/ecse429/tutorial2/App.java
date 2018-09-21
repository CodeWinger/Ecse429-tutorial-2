package mcgill.ecse429.tutorial2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if (args == null || args.length == 0) {
    		System.out.println("no input");
    		return;
    	} 
    	
    	for (String argument : args) {
    		System.out.println(argument);
    	}
    }
}
