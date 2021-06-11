package Interfaces;

public interface Branch {

    public boolean newCustomer(String customerName, double initialAmount);

    public boolean addCustomerTransaction(String customerName, double amount);

}
