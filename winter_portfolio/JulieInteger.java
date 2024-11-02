/* Julie Sakai
CSD-405
Module 3 Programming Assignment
11/2/24 */

public class JulieInteger {
    //Data field
    private int julie;

    //Constructor
    public JulieInteger(int initialValue) {
        this.julie = initialValue;
    }

    //Getter and setter
    public int getJulie() {
        return this.julie;
    }
    public void setJulie(int julie) {
        this.julie = julie;
    }

    //Non-static methods
    public boolean isEven() {
        return this.julie % 2 == 0;
    }

    public boolean isOdd() {
        return this.julie % 2 != 0;
    }

    public boolean isPrime() {
        if (this.julie <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.julie); i++) {
            if (this.julie % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Static methods
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Static methods with JulieInteger
    public static boolean isEven(JulieInteger value) {
        return value.getJulie() % 2 == 0;
    }

    public static boolean isOdd(JulieInteger value) {
        return value.getJulie() % 2 != 0;
    }

    public static boolean isPrime(JulieInteger value) {
        return isPrime(value.getJulie());
    }

    // Equals(int) and equal(Integer) methods
    public boolean equals(int value) {
        return this.julie == value;
    }

    public boolean equals(JulieInteger value) {
        return this.julie == value.getJulie();
    }

    //Test code with three instances
    public static void main(String[] args) {

        JulieInteger integer1 = new JulieInteger(7);
        JulieInteger integer2 = new JulieInteger(7);
        JulieInteger integer3 = new JulieInteger(10);

        //Test non-static methods
        System.out.println("integer1 isEven: " + integer1.isEven());
        System.out.println("integer1 isOdd: " + integer1.isOdd());
        System.out.println("integer1 isPrime: " + integer1.isPrime());

        //Test static methods
        System.out.println("isEven(10): " + JulieInteger.isEven(10));
        System.out.println("isOdd(10): " + JulieInteger.isOdd(10));
        System.out.println("isPrime(10): " + JulieInteger.isPrime(10));

        //Test static methods with JulieInteger
        System.out.println("isEven(integer3): " + JulieInteger.isEven(integer3));
        System.out.println("isOdd(integer3): " + JulieInteger.isOdd(integer3));
        System.out.println("isPrime(integer3): " + JulieInteger.isPrime(integer3));

        //Test equals methods
        System.out.println("integer1 equals 7: " + integer1.equals(7));
        System.out.println("integer1 equals integer2: " + integer1.equals(integer2));
        System.out.println("integer1 equals integer3: " + integer1.equals(integer3));
    }
}
