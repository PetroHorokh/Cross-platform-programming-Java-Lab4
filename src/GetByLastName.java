import java.util.List;
import java.util.Scanner;

public class GetByLastName implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть прізвище для пошуку оплат:");
        String lastName = scanner.nextLine();

        boolean found = false;

        for (Payment record : payments) {
            if (record.getLastName().equalsIgnoreCase(lastName)) {
                found = true;
                System.out.println(record);
            }
        }

        if (!found) {
            System.out.println("Немає оплат для людини з таким прізвищем.");
        }
    }
}
