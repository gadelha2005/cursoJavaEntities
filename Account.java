package entites;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number , String holder , double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    
    public Account(int number , String holder){
        this.number = number;
        this.holder = holder;
    }

    public int getNumber(int number){
        return number;
    }

    public String getHolder(String holder){
        return holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public double getBalance(double balance){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public String toString(){
        return "Account " + number + ", Holder:  " + holder + ", Balance: $ " + String.format("%.2f", balance); 
    }



}
