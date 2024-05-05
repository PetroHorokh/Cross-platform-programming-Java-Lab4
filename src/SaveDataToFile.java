import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SaveDataToFile implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        String filename = "payments.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            for (Payment payment : payments) {
                writer.write(payment.getLastName() + ", " +
                        payment.getAddress() + ", " +
                        payment.getServiceType() + ", " +
                        payment.getPaymentDate() + ", " +
                        payment.getAmount());
                writer.newLine();
            }

            writer.close();
            System.out.println("Дані збережені у файл " + filename);
        } catch (IOException e) {
            System.err.println("Виникла помилка при записі даних про оплати у файл " + filename);
        }
    }
}
