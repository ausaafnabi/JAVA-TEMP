
public class MyClass2 {

    public static void main(String[] args) 
    { 
        try
        { 
            // Creating an exception 
            NumberFormatException e = 
                       new NumberFormatException("Exception"); 
            //set cause of the exception
            e.initCause(new NullPointerException( 
                      "actual cause")); 
            throw e; 
        } 
  
        catch(NumberFormatException e) 	//Exception Handler
        {     
            System.out.println(e); 
            System.out.println(e.getCause()); 
        } 
    }
}
