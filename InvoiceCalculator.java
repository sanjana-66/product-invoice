package com.example.invoice;

public class InvoiceCalculator {

    // Calculate product amount
    public double calculateProductAmount(double price, int quantity) {
        return price * quantity;
    }

    // Calculate discount
    public double calculateDiscount(double amount) {
        if (amount >= 5000) {
            return amount * 0.10;
        } else if (amount >= 2000) {
            return amount * 0.05;
        }

        return 0;
    }

    // Calculate GST
    public double calculateGST(double amount) {
        return amount * 0.18;
    }

    // Calculate final amount
    public double calculateFinalAmount(double amount) {

        double discount = calculateDiscount(amount);

        double amountAfterDiscount = amount - discount;

        double gst = calculateGST(amountAfterDiscount);

        return amountAfterDiscount + gst;
    }
}