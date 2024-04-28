import java.util.List;
import java.util.Scanner;

@FunctionalInterface
public interface Process {
    void execute(Scanner scanner, List<Payment> payments);
}
