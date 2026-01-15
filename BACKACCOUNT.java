 import java.util.Scanner;
 
 interface Account  {

    void deposit(double Amount);

    void Withdraw(double Amount);

    void calculate_interest(double Amount);

    void view_balance();

    
}

 class SavingAccount implements Account{

    String AccountNumber;
     double balance;

    SavingAccount(String AccountNumber,double balance){

        this.AccountNumber=AccountNumber;
    this.balance=balance;
}

     
       

        public void deposit(double Amount ){
         balance+=Amount;
         System.out.println("In Your Saving Account late Deposit : "+Amount);

            
        }
       public void Withdraw(double Amount){
             balance-=Amount;
             System.out.println("In Your Saving Account late Withdraw : "+Amount);

        }

        public void calculate_interest(double Amount){

          double interst=( Amount*3*2)/100;
        System.out.println("The total interest in "+Amount+" is "+interst);
        }
        public void view_balance(){

            System.out.println("In your Saving Bank Account the balance : "+ balance);
        }
}

class currentAccount implements Account{

    String AccountNumber;
     double balance;

   currentAccount(String AccountNumber,double balance){

        this.AccountNumber=AccountNumber;
    this.balance=balance;
}

     
       

        public void deposit(double Amount ){
         balance+=Amount;
         System.out.println("In Your Saving Account late Deposit : "+Amount);

            
        }
       public void Withdraw(double Amount){
             balance-=Amount;
             System.out.println("In Your Saving Account late Withdraw : "+Amount);

        }

        public void calculate_interest(double Amount){

          //double interst=( Amount*3*2)/100;
        System.out.println("In a Current Bank Account, we do not give interest. Thank you for viewing.");
        }
        public void view_balance(){

            System.out.println("In your Saving Bank Account the balance : "+ balance);
        }
}


public class BACKACCOUNT{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("plz Enter your BACK ACCOUNT NUMBER");

    String type_ofBAckAccount=sc.nextLine(); 
    
    if(type_ofBAckAccount.equals("saving")){
    
   
System.out.print("Enter your Saving Back Account Number : ");


String AccountNumber=sc.nextLine();

if(AccountNumber.equals("1")){

      Account s =new SavingAccount("1",100000);

      s.deposit(5000);
      s.Withdraw(9888);
      s.calculate_interest(7000);
      s.view_balance();


}}
 else if(type_ofBAckAccount.equals("current")){
System.out.print("Enter your Current Back Account Number : ");
String current_Account_AccountNumber=sc.nextLine();
if(current_Account_AccountNumber.equals("1")){

      Account s =new SavingAccount("1",100000);

      s.deposit(5000);
      s.Withdraw(9888);
      s.calculate_interest(7000);
      s.view_balance();


}
}}
}
    

