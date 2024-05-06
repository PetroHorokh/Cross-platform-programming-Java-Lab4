import java.util.List;
import java.util.Scanner;

public class GetAll implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Дані про оплати:");

        boolean found = false;

        for (Payment record : payments) {
            found = true;
            System.out.println(record.toString());
        }

        if (!found) {
            System.out.println("Немає оплат.");
        }
    }
}
