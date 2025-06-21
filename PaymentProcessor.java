package Polymorphism;


abstract class PaymentMethod {
    abstract boolean validate();
    abstract void processPayment(double amount);
}


class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    boolean validate() {
        System.out.println("Validating credit card details...");
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Processing credit card payment of $" + amount);
        } else {
            System.out.println("Credit card validation failed!");
        }
    }
}


class PayPalPayment extends PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    boolean validate() {
        System.out.println("Validating PayPal account...");
        return email.contains("@") && !password.isEmpty();
    }

    @Override
    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("PayPal validation failed!");
        }
    }
}


class BankTransferPayment extends PaymentMethod {
    private String accountNumber;
    private String bankCode;

    public BankTransferPayment(String accountNumber, String bankCode) {
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    @Override
    boolean validate() {
        System.out.println("Validating bank transfer details...");
        return accountNumber.length() >= 10 && bankCode.length() == 4;
    }

    @Override
    void processPayment(double amount) {
        if (validate()) {
            System.out.println("Processing bank transfer of $" + amount);
        } else {
            System.out.println("Bank transfer validation failed!");
        }
    }
}


public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment("1234567812345678", "12/27", "123");
        PaymentMethod payment2 = new PayPalPayment("user@example.com", "securePass");
        PaymentMethod payment3 = new BankTransferPayment("9876543210", "BANK");

   
        payment1.processPayment(150.00);
        payment2.processPayment(200.50);
        payment3.processPayment(1000.00);
    }
}