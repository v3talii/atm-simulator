public class Main {
    public static void main(String[] args) 
    {

    Account myAccount = new Account("Bob", "Dickson", 3312, 1530.0);


    Control myAtm = new Control(myAccount);


    myAtm.start();
    }
    
}
