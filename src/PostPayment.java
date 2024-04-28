import java.util.*;

public class PostPayment implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть прізвище платника:");
        String lastName = scanner.nextLine();

        System.out.println("Введіть адресу платника:");
        String address = scanner.nextLine();

        System.out.println("Введіть вид послуги:");
        String serviceType = scanner.nextLine();

        System.out.println("Введіть дату оплати (формат: рррр-мм-дд):");
        String paymentDate = scanner.nextLine();

        System.out.println("Введіть суму оплати:");
        double amount = scanner.nextDouble();

        Payment record = new Payment(lastName, address, serviceType, paymentDate, amount);
        payments.add(record);
    }
}
