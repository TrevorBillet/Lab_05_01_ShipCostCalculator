public class Main {

    public static void main(String[] args)
    {
        int itemPrice = 102;
        double shippingRate = (.02);
        double shippingTotal = 0;
        double totalPrice = 0;
        if (itemPrice >= 100)
        {
            System.out.println("Your items are eligable for free shipping! Your price is " + itemPrice);
        }
        else if (itemPrice < 100)
        {
            shippingTotal = (itemPrice * shippingRate);
            totalPrice = shippingTotal + itemPrice;
            System.out.println("Your items are not eligable for free shipping! Your shipping costs are " + shippingTotal + " and your total price is " + totalPrice);
        }
    }
}

