/* Julie Sakai
CSD-405
Module 6 Programming Assignment
11/16/24 */

package divison;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }
    //Display information about domestic division including account number and state
    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName() +
                " - Account Number: " + getAccountNumber() + " - State: " + state);
    }
}
