class Account {
    int acc_no;
    String name;
    float amount;

    //Methods to initialize obj
    void insert(int a,String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }
    //deposite method
    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt+"deposited");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }else{
            amount = amount-amt;
            System.out.println(amt+"withdraw done");
        }
    }

    void checkBalance(){
        System.out.println("Balance is:" +amount);
    }
    
    void display(){
        System.out.println("Account-No:"+acc_no);
        System.out.println("Name:"+name);
        System.out.println("Amount:"+amount);
    }

}
    public class BankAccount {
    
        public static void main(String[] args) {
            Account a1 = new Account();

            a1.insert(123456,"Sailesh",1000);
            a1.display();
            a1.checkBalance();
            a1.deposit(20000);
            a1.checkBalance();
            a1.withdraw(5000);
            a1.checkBalance();
        }
    }
