package Exc_12;

public class Run
{
    public static void main(String[] args)
    {
        BankAccount ac1 = new BankAccount("Gulddreng",100.899);
        ac1.setTransactionFee(10.00);
        ac1.withdraw(85);
        ac1.withdraw(10);
        System.out.println(ac1);
    }
}
