package SEE;
import java.util.Scanner;

public class Externals extends CIE.Student {
    public Externals(String usn,String name,int sem)
    {
        super(usn,name,sem);
    }
    Scanner s = new Scanner(System.in);
public int[] see=new int[5];
         public void get()
          {
              for(int i=0;i<5;i++){
              System.out.println("ENTER THE SEE MARK IN SUBJECT"+(i+1));
                see[i]=s.nextInt();
          }
        }
}