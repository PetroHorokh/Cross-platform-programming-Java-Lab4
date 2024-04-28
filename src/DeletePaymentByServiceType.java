import java.util.List;
import java.util.Scanner;

public class DeletePaymentByServiceType implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть тип послуги, за яким потрібно видалити оплати:");
        String serviceType = scanner.nextLine();

        boolean found = false;

        for (var obj : payments) {
            if (obj.getServiceType().equals(serviceType)) {
                payments.remove(obj);
                found = true;
            }
        }

        if(!found){
            System.out.println("Не було знайдено оплат з заданим типом послуг");
        }
    }
}
