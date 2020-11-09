import java.util.Scanner;
class Student{
    private String usn;
    private String name;
    private int[] credits = new int[5];
    private int[] marks = new int[5];

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student usn");
        usn = sc.next();
        System.out.println("Enter Student name");
        name = sc.next();
        System.out.println("Enter credits followed by marks for 5 subjects:");
        for(int i = 0; i < 5; i++){
            credits[i] = sc.nextInt();
            marks[i] = sc.nextInt();
        }
    }


    void printDetails(){
        System.out.println("-----Student details-----");
        System.out.println("Name: " + name +"\t"+ " usn: " + usn);
         for(int i = 0; i < 5; i++){
             System.out.println("Sub" + (i+1) + " Marks is: " + marks[i] +"\t"+ " Credit is: " + credits[i]);
         }
    }


    void sgpaCaculation(){
        double sgpa;
        int[] gpcr = new int[5];
        int credSum = 0, gp,sgpacr=0;
        for(int i = 0; i < 5; i++){
            credSum += credits[i];
            if (marks[i] >= 90){
                gp = 10;
            }
            else if(marks[i] >= 80){
                gp = 9;
            }
            else if(marks[i] >= 70){
                gp = 8;
            }
            else if(marks[i] >= 60){
                gp = 7;
            }
            else if(marks[i] >= 50){
                gp = 5;
            }
            else if(marks[i] >= 40){
                gp = 4;
            }
            else{
                gp = 0;
            }
            gpcr[i] =  gp * credits[i];
            sgpacr+=gpcr[i] ;
        }
        
        System.out.println("Student's sgpa is: " + (sgpacr)/(credSum));
    }
}


public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.getDetails();
        s1.printDetails();
        s1.sgpaCaculation();
    }
}