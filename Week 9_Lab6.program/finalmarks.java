import CIE.*;
import SEE.*;
import java.util.Scanner;
 class finalmarks {
     public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER OF STUDENTS");
      int n=s.nextInt();
      SEE.Externals ob1[]=new SEE.Externals[n];
      CIE.Internals ob[]=new  CIE.Internals[n];
 for(int i=0;i<n;i++)
    {
     System.out.println("ENTER THE USN,NAME AND SEMESTER OF STUDENT"+(i+1));
     String u=s.next();
     String na=s.next();
     int se=s.nextInt();
     ob1[i]=new SEE.Externals(u,na,se);
     ob1[i].get();
     ob[i]=new CIE.Internals();
     ob[i].get();
    }   
 for(int i=0;i<n;i++)
     {
        System.out.println("THE TOTAL MARKS OF STUDENT"+(i+1)+" ARE");
         for(int j=0;j<5;j++)
         {
           System.out.println("SUBJECT"+(j+1)+"="+(ob[i].cie[j]+ob1[i].see[j]));
         }
     }   
 }
}