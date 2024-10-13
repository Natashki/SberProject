package school.redrover;

import java.util.Calendar;
import java.util.Date;

public class Account {
    private int id;
    double balance;
    double annualInterestRate;
    private final Date dateCreated;

    Account(){
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = Calendar.getInstance().getTime();
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = Calendar.getInstance().getTime();

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest(){
        return this.annualInterestRate / 1200 * this.balance;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance +=  amount;
    }

}
