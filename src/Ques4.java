class Underage extends Exception
{
 private int age;
 Underage(int x)
 {
  age=x;
 }
 
 public String toString()
 {
  return "Your age " + age + " is Below 18"; 
 }
}

class Ques4
{
  static void test(int x) throws Underage
  {
   if(x<18)
     throw new Underage(x);
   else
    System.out.println("Valid Age: " + x);
  }
  
  public static void main(String []args)
  {
    try
    {
      test(21);
      test(17);
    }
    
    catch(Underage e)
    {
      System.out.println("Exception Caught: " + e);
    }
   }
}