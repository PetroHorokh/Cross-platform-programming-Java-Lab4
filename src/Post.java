import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Post implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.out.println("Введіть прізвище платника:");
        String lastName = scanner.nextLine();

        System.out.println("Введіть адресу платника:");
        String address = scanner.nextLine();

        System.out.println("Введіть вид послуги:");
        String serviceType = scanner.nextLine();

        String paymentDate;

        do {
            System.out.println("Введіть дату (формат: рррр-мм-дд):");
            paymentDate = scanner.nextLine();
            if (Formatter.isValidDate(paymentDate)) {
                try{
                    DateTimeFormatter validator = DateTimeFormatter.ofPattern(Formatter.pattern);
                    LocalDate dateValidation = LocalDate.parse( paymentDate , validator);
                    int diff = Period.between(dateValidation, LocalDate.now()).getYears();
                    if ( 0 < diff && diff < 5) {
                        break;
                    } else {
                        System.out.println("Дата мусить бути не пізніше поточного часу та не більше 5 років тому");
                    }
                }catch (DateTimeParseException ex){
                    System.err.println("Дата не в правильному форматі");
                }
            }
        } while (true);

        double amount;

        do{
            try{
                System.out.println("Введіть суму оплати:");
                amount = scanner.nextDouble();
                break;
            }catch (Exception ex){
                System.err.println("Неправильний формат");
            }
        }while (true);


        Payment record = new Payment(lastName, address, serviceType, paymentDate, amount);
        payments.add(record);
    }
}
