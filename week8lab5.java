import java.util.Scanner; 
abstract class Shape
{
    double d1;
    double d2;
    Shape(double a,double b)
    {
        d1=a;
        d2=b;
    }
    abstract void printarea();
}
class Rectangle extends Shape
{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    void printarea()
    {
        double area=d1*d2;
        System.out.println("Area of the rectangle :"+area);
    }
}
class Triangle extends Shape
{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    void printarea()
    {
        double area=d1*d2/2;
        System.out.println("Area of the triangle :"+area);
    }
}
class Circle extends Shape
{
    Circle(double rad)
    {
        super(rad,rad);
    }
    void printarea()
    {
        double area=3.14*d1*d1;
        System.out.println("Area of the circle :"+area);
    }
}
class Main
{
    public static void main(String args[]){
        Scanner xx=new Scanner(System.in);
    for(;;){
        System.out.println("***Enter ur choice***");
        System.out.println("\n1;rectangle\n2:triangle\n3:circle\n");
        int ch=xx.nextInt();
     switch(ch){
       case 1: System.out.println("Enter the breadth nd lenght of rectangle");
               int x=xx.nextInt();
               int y=xx.nextInt();
               Rectangle r=new Rectangle(x,y);
               r.printarea();
       break;

       case 2: System.out.println("Enter base nd height value of triangle");
               int z=xx.nextInt();
               int w=xx.nextInt();
               Triangle t=new Triangle(z,w);
               t.printarea();
       break;
        case 3:System.out.println("Enter radius of circle");
               double rad=xx.nextInt();
               Circle c=new Circle(rad);
               c.printarea();
        break;
     } 
    }
    }
}