import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String lastName;
    private String address;
    private String serviceType;
    private String paymentDate;
    private double amount;

    public Payment(String lastName, String address, String serviceType, String paymentDate, double amount) {
        this.lastName = lastName;
        this.address = address;
        this.serviceType = serviceType;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return lastName + ", " + address + ", " + serviceType + ", " + paymentDate + ", " + amount;
    }
}
