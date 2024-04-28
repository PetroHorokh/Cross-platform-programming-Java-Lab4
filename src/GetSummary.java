import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GetSummary implements Process {
    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        if (payments.isEmpty()) {
            System.out.println("Немає даних про оплату.");
            return;
        }

        Map<String, Double> summary = new HashMap<>();

        for (Payment record : payments) {
            String serviceType = record.getServiceType();
            double amount = record.getAmount();

            if (summary.containsKey(serviceType)) {
                summary.put(serviceType, summary.get(serviceType) + amount);
            } else {
                summary.put(serviceType, amount);
            }
        }

        System.out.println("Вид послуги, Сума");
        for (Map.Entry<String, Double> entry : summary.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
