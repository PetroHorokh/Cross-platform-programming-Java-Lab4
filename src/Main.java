import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Payment> payments = new ArrayList<>();

        var executor = new ProcessExecutor(new StartProcess());
        executor.executeOperation(scanner, payments);

        while (true) {
            System.out.println("Виберіть опцію:");
            System.out.println("1. Показати всі оплати");
            System.out.println("2. Показати оплати за адресою");
            System.out.println("3. Показати оплати за типом послуг");
            System.out.println("4. Показати оплати за прізвищем");
            System.out.println("5. Ввести нову оплату ");
            System.out.println("6. Оновити дані про оплати за типом послуг");
            System.out.println("7. Видалити оплати за прізвищем");
            System.out.println("8. Видалити оплати за типом послуг");
            System.out.println("9. Показати підсумок");
            System.out.println("10. Завантажити оплати з файлу");
            System.out.println("11. Зберегти оплати у файл");
            System.out.println("12. Вихід");

            System.out.print("Введіть операцію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    executor = new ProcessExecutor(new GetAllPayments());
                    executor.executeOperation(scanner, payments);
                    break;
                case 2:
                    executor = new ProcessExecutor(new GetPaymentByAddress());
                    executor.executeOperation(scanner, payments);
                    break;
                case 3:
                    executor = new ProcessExecutor(new GetPaymentsByServiceType());
                    executor.executeOperation(scanner, payments);
                    break;
                case 4:
                    executor = new ProcessExecutor(new GetPaymentByLastName());
                    executor.executeOperation(scanner, payments);
                    break;
                case 5:
                    executor = new ProcessExecutor(new PostPayment());
                    executor.executeOperation(scanner, payments);
                    break;
                case 6:
                    executor = new ProcessExecutor(new PutPaymentsServiceType());
                    executor.executeOperation(scanner, payments);
                    break;
                case 7:
                    executor = new ProcessExecutor(new DeletePaymentByLastName());
                    executor.executeOperation(scanner, payments);
                    break;
                case 8:
                    executor = new ProcessExecutor(new DeletePaymentByServiceType());
                    executor.executeOperation(scanner, payments);
                    break;
                case 9:
                    executor = new ProcessExecutor(new GetSummary());
                    executor.executeOperation(scanner, payments);
                    break;
                case 10:
                    executor = new ProcessExecutor(new GetPaymentsFromFile());
                    executor.executeOperation(scanner, payments);
                    break;
                case 11:
                    executor = new ProcessExecutor(new SavePaymentsToFile());
                    executor.executeOperation(scanner, payments);
                    break;
                case 12:
                    executor = new ProcessExecutor(new SavePaymentsToFile());
                    executor.executeOperation(scanner, payments);
                    executor = new ProcessExecutor(new EndProcess());
                    executor.executeOperation(scanner, payments);
                    break;
                default:
                    System.out.println("Некоректний вибір. Спробуйте знову.");
            }
        }
    }
}
