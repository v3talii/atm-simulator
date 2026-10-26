import java.util.Scanner;

public class Control {

    private Account account;
    private Scanner scanner;

    // Control structure
    public Control (Account account){
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    
    // Start structure
    public void start(){
        System.out.println("--- WELCOME TO THE ATM ---");

        boolean isAuthenticated = authenticate();

        if (isAuthenticated) {
            showMenu();
        } else {
            System.out.println("Card blocked due to 3 incorrect attempts. Contact your bank.");
        }
    }

    // Private method to handle PIN authentication logic
    private boolean authenticate(){

        for (int attempts = 1; attempts <= 3; attempts++) {
            System.out.println("Enter PIN: ");
            int inputPin = scanner.nextInt();
        
            if (inputPin == account.getPinCode()) {
                System.out.println("PIN accepted. Welcome, " + account.getName() + "!");
                return true; 
            } else {
                System.out.println("Incorrect PIN, remaining attempts: " + (3 - attempts));
            }
        } 
        
        return false;
    }

    // Private method to display and manage the main menu loop
    private void showMenu(){ 

        int choice;

        do 
        {
            System.out.println("--- MAIN MENU ---");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Please Select Options (1-4): ");

            choice = scanner.nextInt();

            switch(choice) 
            {
                case 1: 
                System.out.println("Current Balance: €" + account.getBalance());
                break;

                case 2:
                System.out.println("Enter Deposit Amount: €");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;

                case 3:
                System.out.println("Enter Withdraw Amount: €");
                double witdrawAmount = scanner.nextDouble();
                account.withdraw(witdrawAmount);
                break;

                case 4:
                System.out.println("Thanks you for using our ATM!");
                break;

                default:
                System.out.println("Invalid Option! Please Try Again!");
                break;
            }

        } while (choice != 4);
    }
}