/* Julie Sakai
CSD-405
Module 6 Programming Assignment
11/16/24 */

package divison;

//Create an abstract Division class with Company's division name and account number
public abstract class Division {
    private String divisionName;
    private int accountNumber;

    //Use a constructor in the superclass for both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //Getter method for fields
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    //Abstract method to display information about the division
    public abstract void display();
}
