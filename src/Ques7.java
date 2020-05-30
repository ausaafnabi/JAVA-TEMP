import java.io.*;

class Ques7
{
  public static void main(String args[])
  {
    if(args.length!=1)
    {
     System.out.println("FILE NAME NOT PROVIDED");
     return;
    }
    try(BufferedReader br=new BufferedReader(new FileReader(args[0])))
    {
      String line=br.readLine();
      while(line!=null)
      {
        if(line.length()>0)
        {
          if(line.charAt(0)=='/' && line.charAt(0)=='/')
          {
            System.out.println(line);
          }
        }
       line=br.readLine();
     }
   }
   catch(IOException e)
   {
    System.out.println("Error Opening Files" + e);
   }
  }
}
