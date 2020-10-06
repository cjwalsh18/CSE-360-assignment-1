/**
 * Written by: Cullen Walsh
 * id:1214938374
 * date:10/5/2020
 * CSE 360
 *
 * AddingMachine.java: The AddingMachine Class will create a simple calculator
 * that will compute addition and subtraction to the value of total. While Also
 * keeping a transaction list of every operation that is calculated against total.
 */



package cse360assignment02;

public class AddingMachine {
    private int total;
    private String transactions;

    /**
     * AddingMachine constructor initializing int total and transactions
     */

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        transactions = "0";
    }

    /**
     * getTotal method returning the total variable
     * @return the value that is stored in total
     */
    public int getTotal () {
        return total;
    }

    /**
     * add method that will add value to the total variable
     * @param value which is then added to the total
     */
    public void add (int value) {
        total = total + value;
        transactions = transactions + " + " + value;

    }

    /**
     * subtract method that will subtract value from total variable
     * @param value which is then subtracted from the total
     */
    public void subtract (int value) {
        total = total - value;
        transactions = transactions + " - " + value;
    }

    /**
     * toString method that will return all the operation done to total
     * @return the string holding a list of all operation done to total
     */
    public String toString () {

        return transactions;
    }

    /**
     * clear method that will clear used memory in the variables total and transactions
     */
    public void clear() {
        total = 0;
        transactions = "0";
    }
}
