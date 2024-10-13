package school.redrover;

import school.redrover.ex8.MyTime;

import java.util.Arrays;

import static school.redrover.ex8.MyInteger.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Account account = new Account();
            Account account1 = new Account(1122, 20000);

            account1.setAnnualInterestRate(4.5);
            account1.withdraw(2500);
            account1.deposit(3000);

            System.out.println(account1.getBalance() + "RUB\n" + "Monthly payment " + account1.getMonthlyInterest() + "\nCreated Date of account " + account.getDateCreated());


            MyTime time = new MyTime();
            MyTime time1 = new MyTime(10, 22, 55);
            MyTime time2 = new MyTime();

            time2.setTime(555550000);

           time.displayTime();
           time1.displayTime();
           time2.displayTime();


            System.out.println( parseInt("123"));

            System.out.println( parseInt(Arrays.toString(new String[]{"1", "2", "3"})));

        }
    }
