public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double percents = 9.9;
        int credit = 1_000_000;
        int months = 10;

        int pay = (int) service.calculate( percents, credit, months);
        System.out.println("Ежемесячный платеж: " + (int) service.calculate(9.99, 1_000_000,12));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + (int) service.calculate(9.99, 1_000_000,24));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + (int) service.calculate(9.99, 1_000_000,36));
        System.out.println();
    }
}
