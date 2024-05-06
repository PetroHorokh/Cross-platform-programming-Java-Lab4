import java.util.List;
import java.util.Scanner;

public class GetByAddress implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть адресу для пошуку оплат:");
        String address = scanner.nextLine();

        boolean found = false;

        for (Payment record : payments) {
            if (record.getAddress().equalsIgnoreCase(address)) {
                found = true;
                System.out.println(record);
            }
        }

        if (!found) {
            System.out.println("Немає оплат для введеної адреси.");
        }
    }
}
