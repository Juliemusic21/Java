/* Julie Sakai
CSD-405
Module 6 Programming Assignment
11/16/24 */

package divison;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    //Display information about international division including name, account number, country, and language
    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName() + "- Account Number: " + getAccountNumber() +
                " - Country: " + country + "- Language: " + language);
    }
}
