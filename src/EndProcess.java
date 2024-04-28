import java.util.List;
import java.util.Scanner;

public class EndProcess implements Process {

    @Override
    public void execute(Scanner scanner, List<Payment> payments) {
        System.exit(0);
    }
}
