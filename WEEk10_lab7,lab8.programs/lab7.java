import java.util.Scanner;
class generic<DT1,DT2,DT3>
{
    DT1 obj;
    DT2 obj1;
    DT3 obj2;
    generic(DT1 a,DT2 b,DT3 c)
    {
        obj=a;
        obj1=b;
        obj2=c;
    }
    DT1 get1()
    {
        return obj;
    }
    DT2 get2()
    {
        return obj1;
    }
    DT3 get3()
    {
        return obj2;
    }
    void showdatatype()
    {
        System.out.println("THE TYPES OF DATATYPE USED IS="+obj.getClass().getName());
        System.out.println("THE TYPES OF DATATYPE USED IS="+obj1.getClass().getName());
        System.out.println("THE TYPES OF DATATYPE USED IS="+obj2.getClass().getName());
    }
}
class genericmain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("ENTER THE VALUES");
        int x=ss.nextInt();
        String str=ss.next();
        double xx=ss.nextDouble();
        generic<Integer,String,Double> a=new generic<Integer,String,Double>(x,str,xx);
        a.showdatatype();
        System.out.println("THE INTEGER ENTERED IS="+a.get1());
        System.out.println("THE STRING ENTERED IS="+a.get2());
        System.out.println("THE DOUBLE ENTERED IS="+a.get3());
    }
}