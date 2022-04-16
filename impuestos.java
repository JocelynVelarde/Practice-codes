package transpose.banco;

public class impuestos {

    public static void main(String[] args) {
        roundToNearestPenny(30.578);
        computeCostBasic(50.345);
        computeCostLuxury(50.345);
    }

    private static double basicRate =  0.04;
    private static double luxuryRate = 0.10;

    public static void computeCostBasic(double price) {
        double impuestoprice = price*basicRate;
        double finalprice = impuestoprice+price;
        roundToNearestPenny(finalprice);
    }

    public static void computeCostLuxury(double price) {
        double impuestoprice = price*luxuryRate;
        double finalprice = impuestoprice+price;
        roundToNearestPenny(finalprice);
    }

    public static void changeBasicRateTo(double newRate) {
        impuestos.basicRate = +newRate;
    }

    public static void changeLuxuryRateTo(int newRate) {
        impuestos.luxuryRate = +newRate;
    }

    public static void roundToNearestPenny(double price){
        int dollars = (int)Math.round(price * 100);
            if (dollars < 0) {
                dollars = (int)Math.abs(dollars);
                System.out.print("-");
                }
                    int cents = dollars % 100;
                    dollars = dollars / 100;
                        System.out.print("$");
                        System.out.print(dollars);
                        System.out.print(".");
                             if (cents <= 9) {
                            System.out.print(0);
                            }
                                System.out.print(cents);
                                System.out.println();
        }
}