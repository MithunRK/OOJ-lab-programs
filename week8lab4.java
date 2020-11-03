import java.util.Scanner;

abstract class Account {
    String cName, accType;
    long accNo;
    double bal;
    final double minBal = 1000.0;

    Account(String cName, long accNo, double bal, String accType) {
        this.accNo = accNo;
        this.cName = cName;
        this.bal = bal;
        this.accType = accType;
    }

    abstract void addBal(double amt);

    abstract void dispBal();

    abstract void withBal(double amt);
}

class Curr_acct extends Account {
    Curr_acct(String cName, long accNo, double bal) {
        super(cName, accNo, bal, "Current");
        System.out.println("name: "+cName+"\taccno: "+accNo+"\tbal: "+bal+"\ttype: "+accType);
    }

    void addBal(double amt){
        this.bal  += amt;
        
    }

    void dispBal(){
        System.out.println("Your balance is: " + this.bal);
    }

    void withBal(double amt){
        this.bal -= amt;
        checkBal();
    }

   

    void checkBal() {
        if (this.bal < minBal) {
            this.bal -= this.bal * 0.02;
            System.out.println(" Avail. Balance :" +this.bal);
            System.out.println("Since Ur acc has balance less then the limit ,2% had been detected as penalty");
        }
}
}

class Sav_acct extends Account {
    Sav_acct(String cName, long accNo, double bal) {
        super(cName, accNo, bal, "Savings");
        System.out.println("Customer acc details are:-\n name: " + cName + "\taccno: " + accNo + "\tbal: " + bal + "\ttype: " + accType);
    }

    void addBal(double amt){
        this.bal  += amt;
        addIntr();
    }
    
    void addIntr() {
        this.bal += this.bal * 0.07;
    }

    void dispBal(){
        System.out.println("Your balance is: " + this.bal);
    }

    void withBal(double amt){
        this.bal -= amt;
        
    }
}


class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double amt;
        int flag = 0;
        while( flag == 0){
            System.out.println("choose acc type");
            System.out.println("1:Current acc.\n2:Savings acc.");
            int ch=sc.nextInt();
          switch(ch){
              case 1:
                System.out.println("Enter the name & acc number of the customer");
                String name=sc.next();
                long account_no=sc.nextLong();
                Curr_acct c = new Curr_acct(name, account_no, 50000);
                System.out.println("\nCurrent_acct\n");
                int flag1 = 0;
                  while( flag1 == 0) {
                   System.out.println("1:Addamount\n2:DisplayBalance\n3:Withdraw");
                   int ch1 = sc.nextInt();
                    switch (ch1) {
                     case 1:
                     System.out.println("Enter amt to be added:");
                     amt = sc.nextDouble();
                     c.addBal(amt);
                     break;

                     case 2:
                     c.dispBal();
                     break;

                     case 3:
                     System.out.println("Enter amt to be withdrawn:");
                     amt = sc.nextDouble();
                     c.withBal(amt);
                     break;
               
                    default:
                    flag1 = 1;
                    }
                  }
                  break;
             case 2:
              System.out.println("Enter the name & acc no. of the cutomer");
              String name1=sc.next();
              long account_no2=sc.nextLong();
              Sav_acct s = new Sav_acct(name1, account_no2, 40000);
              System.out.println("\nSavings_acct\n");
              int flag2 = 0;
               while(flag2 == 0){
                System.out.println("1:AddBal\n2:DisplayBal\n3:Withdraw");
                int ch2 = sc.nextInt();
                 switch (ch2) {
                  case 1:
                    System.out.println("Enter amt to be added:");
                    amt = sc.nextDouble();
                    s.addBal(amt);
                    break;

                  case 2:
                    s.dispBal();
                    break;

                  case 3:
                    System.out.println("enter amt to be withdrawn:");
                    amt = sc.nextDouble();
                    s.withBal(amt);
                    break;

                  default:
                    flag2 =1;
                 }

               }
        
        }
       }
    }
}