package Java_04_ObjectOrientedProgramming;

import java.util.UUID;

public class Java_04_12_PaymentGateway {
    public static void main(String[] args) {
        PaypalGateway p = new PaypalGateway();

    }
}

abstract class PaymentGateway{
    protected boolean validateAmount(double amount){
        return amount > 0;
    }
    protected void logTransaction(String transactionId){
        System.out.println("Transaction logged: " + transactionId);
    }

    public abstract String processPayment(double amount);

    public final String executePayment(double amount){
        if(!validateAmount(amount)){
            throw new IllegalArgumentException("Invalid amount");
        }
        String transactionId = processPayment(amount);
        logTransaction(transactionId);
        return transactionId;
    }
}

class PaypalGateway extends PaymentGateway {
    @Override
    public String processPayment(double amount) {
        //PayPal-specific API call
        return "PAYPAL_" + UUID.randomUUID().toString();
    }
}

class StripeGateway extends PaymentGateway{
    @Override
    public String processPayment(double amount) {
        // PayPal-specific API call
        return "PAYPAL_" + UUID.randomUUID().toString();
    }
}