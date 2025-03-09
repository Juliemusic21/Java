/* Julie Sakai
CSD-405
Module 6 Programming Assignment
11/16/24 */

package divison;

public class UseDivision {
    public static void main(String[] args) {

    //One instance for International Division and display results
    InternationalDivision Japan = new InternationalDivision("International",9876, "Japan", "Japanese");
    InternationalDivision Philippines = new InternationalDivision("International",5432, "Philippines", "Tagalog");
    Japan.display();
    Philippines.display();

    //One instance for Domestic Division and display results
    DomesticDivision Hawaii = new DomesticDivision("Domestic", 2345, "Hawaii");
    DomesticDivision California = new DomesticDivision("Domestic", 1234, "California");
    Hawaii.display();
    California.display();
    }
}
