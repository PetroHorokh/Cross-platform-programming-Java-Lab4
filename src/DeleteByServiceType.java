import java.util.List;
import java.util.Scanner;

public class DeleteByServiceType implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть тип послуги, за яким потрібно видалити оплати:");
        String serviceType = scanner.nextLine();

        boolean found = false;

        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getServiceType().equals(serviceType)) {
                payments.remove(payments.get(i));
                found = true;
            }
        }

        if(!found){
            System.out.println("Не було знайдено оплат з заданим типом послуг");
        }
    }
}
