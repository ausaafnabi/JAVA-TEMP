import java.io.*;

class Ques6
{
 public static void main(String []args)
 {
   int i;
   if(args.length!=2)
   {
     System.out.println("FILE NAMES NOT PROVIDED");
     return;
   }
   try(FileInputStream fin=new FileInputStream(args[0]);
FileOutputStream fout=new FileOutputStream(args[1]))
   {
     System.out.println("Starting To Write File....");
     System.out.println("###########################");
     System.out.println("FILE CONTENT: ");
     do
     {
       i=fin.read();
       if(i!=-1)
         fout.write(i);
	 System.out.print((char) i);
     }while(i!=-1);
     System.out.println("Completed Writing File....");

   }

   catch(FileNotFoundException e)
   {
     System.out.println("Error opening file " + e);
   }
   catch(IOException e)
   {
     System.out.println("Error reading/writing " + e);
   }
}
}
