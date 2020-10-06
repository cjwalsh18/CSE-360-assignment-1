package cse360assignment02;

public class AddingMachine {private int total;
private String transactions;

    /**
     * AddingMachine constructor initializing int total
     */

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        transactions = "0";
    }

    /**
     * getTotal method returning the total variable
     * @return
     */
    public int getTotal () {
        return total;
    }

    /**
     * add method that will add value to the total variable
     * @param value
     */
    public void add (int value) {
        total = total + value;
        transactions = transactions + " + " + value;

    }

    /**
     * subtract method that will subtract value from total variable
     * @param value
     */
    public void subtract (int value) {
        total = total - value;
        transactions = transactions + " - " + value;
    }

    /**
     * toString method that will return all the operation done to total
     */
    public String toString () {

        return transactions;
    }

    /**
     * clear method that will clear used memory
     */
    public void clear() {
    }
}
