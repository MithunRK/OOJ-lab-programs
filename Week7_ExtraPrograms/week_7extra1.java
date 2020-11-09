import java.util.Scanner;
class student{
  String sem,usn,name;
  double ciemarks,seemark;
  void accept(){
    Scanner xx= new Scanner(System.in);
    System.out.println("Enter student name:");
    name=xx.next();
    System.out.println("Enter student USN" );
    usn=xx.next();
    System.out.println("sem:");
    sem=xx.next();
  void dislaydet(){
    System.out.println("name:"+name+"USN"+usn+"sem"+sem);
  }
  void acceptcie(){
    System.out.print("out of total 40");
    ciemarks=xx.nextInt();
  }
}
class text extends student{
  
  for(int i=0;i<n;i++){
    System.out.println("Enter number of courses :");
    int c=xx.nextInt();
    student s2[]=new student[c];
      System.out.println("Enter cie mark of course"+(i+1) );
      s2[i] =new student();
      s2[i].acceptcie();
    
  }
}
class studentmain{
  public static void main(String[] args){
    Scanner xx= new Scanner(System.in);
    System.out.println("Enter number of students :");
    int n=xx.nextInt();
    student s1[]=new student[n];
    for(int i=0;i<n; i++){
      System.out.println("Enter details of student ");
      s1[i] =new student();
      s1[i].accept();
    }
  }
}