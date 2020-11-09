import java.util.Scanner;
abstract class player{
  String name;
  int matches_played;
  double average;
  abstract void cal_average(String n,int m,int n);
}
class batsman extends player{
  int runs_scored;
  void cal_average(String x,int y,int z){
  name=x;
  matches_played=y;
  runs_scored=z;
  average=(double)runs_scored/matches_played;
  System.out.println("The averge runs scored by "+name+" is :"+average);
  }
}
class bowler extends player{
  int runs_given;
  void cal_average(String a,int b,int c){
   name=a;
   matches_played=b;
   runs_given=c;
   average=(double)runs_given/matches_played;
   System.out.println("The average runs given by "+name+" is:"+average);
  }
}
class playermain{
  public static void main(String args[]){
     int m,n,i;
     Scanner xx=new Scanner(System.in);
     System.out.println("Enter the no. of Batsman and bowlers");
     m=xx.nextInt();
     n=xx.nextInt();
     batsman BAT[]=new batsman[m];
     for(i=0;i<m;i++){
      BAT[i]=new batsman();
      System.out.println("Enter player name,no. of matches played,& no. of runs scored by Batsman "+(i+1)+":");
      BAT[i].name=xx.next();
      BAT[i].matches_played=xx.nextInt();
      BAT[i].runs_scored=xx.nextInt();
     }
     bowler BOL[]=new bowler[n];
     for(i=0;i<n;i++){
      BOL[i]=new bowler();
      System.out.println("Enter player name,no.of matches played,& no. of runs given by Bowler "+(i+1)+":");
      BOL[i].name=xx.next();
      BOL[i].matches_played=xx.nextInt();
      BOL[i].runs_given=xx.nextInt();
     }
     for(i=0;i<m;i++){
      BAT[i].cal_average(BAT[i].name ,BAT[i].matches_played,BAT[i].runs_scored);
     }
     for(i=0;i<n;i++){
      BOL[i].cal_average(BOL[i].name ,BOL[i].matches_played,BOL[i].runs_given);
     }
  }
}