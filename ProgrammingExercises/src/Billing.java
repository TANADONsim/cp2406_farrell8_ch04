public class Billing
{
    public static void main(String args[])
    {
        /* Declaring First and Last names */
        double price = 15;
        int quantity = 3;
        double coupon = 10.00;
        double result;

        /* Testing only price stated */
        result = computeBill(price);
        System.out.println("The final price is " + result);

        /* Testing only price and quantity stated */
        result = computeBill(price, quantity);
        System.out.println("The final price is " + result);

        /* Testing price, quantity, and coupon use */
        result = computeBill(price, quantity, coupon);
        System.out.println("The final price is " + result);
    }

    private static double computeBill(double price)
    {
        double priceWTax = price * 1.08;
        return priceWTax;
    }

    private static double computeBill(double price, int quantity)
    {
        double priceWTax = price * quantity *  1.08;
        return priceWTax;
    }

    private static double computeBill(double price, int quantity, double coupon)
    {
        double priceWTax = ((price * quantity) - coupon) *  1.08;
        return priceWTax;
    }
}

