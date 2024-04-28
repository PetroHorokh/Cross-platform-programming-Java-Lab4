import java.util.List;
import java.util.Scanner;

public class DeletePaymentByLastName implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть прізвище, за яким потрібно видалити оплати:");
        String lastName = scanner.nextLine();

        boolean found = false;

        for (var obj : payments) {
            if (obj.getLastName().equals(lastName)) {
                payments.remove(obj);
                found = true;
            }
        }

        if(!found){
            System.out.println("Не було знайдено оплат з заданим прізвищем");
        }
    }
}
