class StackExcep extends Exception
{
  private String er;
  
  StackExcep(String s)
  {
   er=s;
  }

  public String toString()
  {
    return er + "Occured";
  }
}

class Stack
{
 private int arr[];
 private int tos;
 
 Stack()
 {
  arr=new int[10];
  tos=0;
 }
  
 void push(int val) throws StackExcep
 {
  if(tos<10)
    arr[tos++]=val;
  else
   throw new StackExcep("Overflow ");
 }

 int pop() throws StackExcep
 {
  if(tos>0)
    return arr[--tos];
  else
   throw new StackExcep("Underflow ");
 }
}

class Ques5
{
 public static void main(String args[])
 {
   int i=0;
   Stack S=new Stack();
   try
   {
      for(i=0;i<10;i++)
      {
        S.push(i+1);
        System.out.println("Element Inserted At Index Position:" + i);
      }
      S.push(11);
   }
   catch(StackExcep e)
   {
     System.out.println("Exception Caught: " + e);
   }
   try
   {
      while(i>=0)
     {
       System.out.println("Element Poped:" + S.pop());
       i--;
     }
     S.pop();
   }
  
  catch(StackExcep e)
  {
   System.out.println("Exception Caught: " + e);
  }
 }
}