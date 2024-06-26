import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LoadDataFromFile implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        payments.clear();
        String filename = "payments.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");

                String lastName = parts[0];
                String address = parts[1];
                String serviceType = parts[2];
                String paymentDate = parts[3];
                double amount = Double.parseDouble(parts[4]);

                Payment payment = new Payment(lastName, address, serviceType, paymentDate, amount);
                payments.add(payment);

            }
            System.out.println("Дані було завантажено з файлу");
        } catch (IOException e) {
            System.err.println("Виникла помилка при читанні даних з файлу " + filename);
        }
    }
}   
