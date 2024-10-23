/**
 * Julie Sakai
 * 9/30/24
 * Module 8 Assignment
 */

/**
 * This program calculate the cost of a yearly auto service visit.
 * Using four methods for services for standard service charge, oil change fee,
 * tire rotation charge, and with coupon. 
 * yearlyService(no parameters) will return the standard service charge.
 * yearlyService(one parameter) will return the standard service charge with added oil change fee.
 * yearlyService(two parameters) will return the standard service charge and with added oil change fee
 * and a tire rotation charge.
 * yearlyService (three parameters) will return the standard service charge with added oil change fee,
 * a tire rotation charge, and a coupon amount that will be subtracted from the total cost.
 * 
 * 
 */
public class yearlyService {
    //Added values for the charges to input.
    private static final double standard_service_charge = 100.0;
    private static final double oil_change_fee = 50.0;
    private static final double tire_rotation_charge = 40.0;

    public static double yearlyService() {
        return standard_service_charge;
    }

    public static double yearlyService(double oilChangeFee) {
        return standard_service_charge + oilChangeFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return standard_service_charge + oilChangeFee + tireRotationCharge;
    }

    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        double totalCost = standard_service_charge + oilChangeFee + tireRotationCharge;
        return Math.max(0, totalCost - couponAmount); 
    }

    public static void main(String[] args) {
        //Test 1 to calculate the standard service charge.
        System.out.println("Test 1:");
        System.out.println("Standard Service Charge: $" + yearlyService());
        System.out.println();

        //Test 2 to calculate the total cost with various combinations of services and a coupon.
        System.out.println("Test 2:");
        System.out.println("Service Charge with Oil Change: $" + yearlyService(oil_change_fee));
        System.out.println("Service Charge with Oil Change and Tire Rotation: $" +
                yearlyService(oil_change_fee, tire_rotation_charge));
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon: $" +
                yearlyService(oil_change_fee, tire_rotation_charge, 90.0));
    }
}