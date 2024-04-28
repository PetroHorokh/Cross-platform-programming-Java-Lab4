import java.util.List;
import java.util.Scanner;

public class GetPaymentsByServiceType implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть тип сервісу для пошуку оплат:");
        String serviceType = scanner.nextLine();

        boolean found = false;

        for (Payment record : payments) {
            if (record.getServiceType().equalsIgnoreCase(serviceType)) {
                found = true;
                System.out.println(record);
            }
        }

        if (!found) {
            System.out.println("Немає оплат за даним типом послуг.");
        }
    }
}
