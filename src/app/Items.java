package app;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

/**
 * Items
 */
public class Items {

    protected Scanner in;

    protected double income;
    protected double purchase;
    protected double balance;

    protected Map<String, Double> list;

    public Items() {
        this.income = 0;
        this.purchase = 0;
        this.balance = 0;
        this.in = new Scanner(System.in);
        this.list = new HashMap<String, Double>();
    }

    /**
     * 
     * param balance the balance to set
     */
    public void setBalance(double balance) {

        this.balance += balance;

    }

    /**
     * @return the balance
     */
    public double getBalance() {
        if (this.balance <= 0) {
            return 0;

        }
        return this.balance;
    }

    public void showBalance() {

        System.out.println("Balance: $" + getBalance());

    }

    /**
     * @return the list
     */
    public Map<String, Double> getList() {

        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(Map<String, Double> list) {

        this.list = list;
    }

}