import java.util.List;
import java.util.Scanner;

public class Executor {
    private final Process operation;

    public Executor(Process operation) {
        this.operation = operation;
    }

    public void executeOperation(Scanner scanner,List<Payment> payments) {
        operation.execute(scanner, payments);
    }
}
