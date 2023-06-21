public class CreditPaymentService {

    public double calculate(double percents, int amount, int months) {

        double percentsMonth = percents / 12 / 100;
        int pay = (int) (amount * (percentsMonth * Math.pow(1 + percentsMonth, months)) /
                        (Math.pow(1 + percentsMonth, months) - 1));
        return pay;
    }

}