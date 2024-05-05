import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        String paymentDate;

        do {
            System.out.println("Введіть дату оплати (формат: рррр-мм-дд):");
            paymentDate = scanner.nextLine();
            if (Formatter.isValidDate(paymentDate)) {
                SimpleDateFormat validator = new SimpleDateFormat(Formatter.pattern);
                validator.setLenient(false);

                try {
                    Date dateValidation = validator.parse(paymentDate);
                    if (new Date().getYear() - dateValidation.getYear() < 5 && new Date().getTime() - dateValidation.getTime() > 0) {
                        break;
                    } else {
                        System.out.println("Дата оплати не може бути раніше ніж 5 років тому та в майбутньому");
                    }
                } catch (ParseException e) {
                    System.out.println("Дата не в правильному форматі");
                }
            }
        } while (true);

        System.out.println("Введіть суму оплати:");
        double amount = scanner.nextDouble();

        Payment record = new Payment(lastName, address, serviceType, paymentDate, amount);
        payments.add(record);
    }
}
