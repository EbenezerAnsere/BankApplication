package Interfaces;

public interface Bank {

    public boolean addBranch(String branchName);

    public boolean addCustomer(String branchName, String customerName, double initialAmount);

    public boolean addCustomerTransaction(String branchName, String customerName, double amount);

    public boolean listCustomers(String branchName, boolean showTransactions);

}
