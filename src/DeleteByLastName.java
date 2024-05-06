import java.util.List;
import java.util.Scanner;

public class DeleteByLastName implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {

        try {
            System.out.println("Введіть прізвище, за яким потрібно видалити оплати:");
            String lastName = scanner.nextLine();

            boolean found = false;

            for(int i = 0; i < payments.size(); i++){
                if (payments.get(i).getLastName().equals(lastName)) {
                    payments.remove(payments.get(i));
                    found = true;
                }
            }

            if(!found){
                System.out.println("Не було знайдено оплат з заданим прізвищем");
            }
        }catch (Exception ex){
            System.err.println(ex.toString());
        }


    }
}
