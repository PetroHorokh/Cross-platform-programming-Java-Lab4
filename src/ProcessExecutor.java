import java.util.List;
import java.util.Scanner;

public class ProcessExecutor {
    private final Process operation;

    public ProcessExecutor(Process operation) {
        this.operation = operation;
    }

    public void executeOperation(Scanner scanner,List<Payment> payments) {
        operation.execute(scanner, payments);
    }
}
