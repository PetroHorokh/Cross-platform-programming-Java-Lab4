import java.util.List;
import java.util.Scanner;

public class PutServiceType implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть тип послуг, який потрібно замінити в оплатах:");
        String serviceTypeToChange = scanner.nextLine();

        System.out.println("Введіть тип послуг, на який потрібно замінити застарілий:");
        String serviceTypeChange = scanner.nextLine();

        boolean found = false;

        for(int i = 0; i < payments.size(); i++){
            if (payments.get(i).getServiceType().equals(serviceTypeToChange)) {
                payments.get(i).setServiceType(serviceTypeChange);
                found = true;
            }
        }

        if(!found){
            System.out.println("Не було знайдено оплат з заданим типом послуг");
        }
    }
}
