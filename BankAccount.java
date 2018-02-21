package Exc_12;

public class BankAccount
{
    private String name;
    private double amount;
    private double transactionFee = 0.00;

    public BankAccount(String name,double amount)
    {
        this.name = name;
        this.amount = amount;
    }

    public void deposit (double amount)
    {
        this.amount += amount;
    }

    public void withdraw (double amount)
    {
        if(this.amount - (amount+this.transactionFee)>=0)
        {
            this.amount -= amount;
            System.out.println("You succesfully withdrawed " + amount + " dollars from your account");
        } else
        {
            System.out.println("Error! The amount + the transaction fee, exceeds your acoount funds");
        }
    }

    public void setTransactionFee(double value)
    {
        this.transactionFee = value;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %.2f",this.name,this.amount);
    }
}
