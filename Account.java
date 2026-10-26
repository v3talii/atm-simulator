public class Account {
    private String name;
    private String surname;
    private int pinCode;
    private double balance;


// Constructor for the new account 
public Account(String name, String surname, int pinCode, double balance) 
{

    this.name = name;
    this.surname = surname;
    this.pinCode = pinCode;
    this.balance = balance;

}

//getters and setteres for new account 

public String getName() 
{

    return name;
}

public String getSurname()
{

    return surname;
}

public int getPinCode()
{

    return pinCode;
}

public double getBalance(){

    return balance;
}


// add function to deposit money into account 

public void deposit(double amount)
{

    if (amount > 0)
    {
    balance += amount;
    System.out.println("Successfully Deposited: €" + amount);
    System.out.println("Your Current Balance : €" + balance);

    } else {

        System.out.println("Error! Deposit must be positive!");
    }

}


// add function to witdraw money from account 

public void withdraw(double amount)
{

    if (amount <= 0){

        System.out.println("Error! Withdraw must be positive!");

    } else if (amount > balance) 

        {

        System.out.println("Error! Not enough money on your account!");

        } else {

        balance -= amount;

        System.out.println("Successfully Withdrawed: €" + amount);
        System.out.println("Your Current Balance : €" + balance);
        }

}

}






