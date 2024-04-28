import java.util.List;
import java.util.Scanner;

public class PutPaymentsServiceType implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть тип послуг, який потрібно замінити в оплатах:");
        String serviceTypeToChange = scanner.nextLine();

        System.out.println("Введіть тип послуг, на який потрібно замінити застарілий:");
        String serviceTypeChange = scanner.nextLine();

        boolean found = false;

        for (var obj : payments) {
            if (obj.getServiceType().equals(serviceTypeToChange)) {
                obj.setServiceType(serviceTypeChange);
                found = true;
            }
        }

        if(!found){
            System.out.println("Не було знайдено оплат з заданим типом послуг");
        }
    }
}
