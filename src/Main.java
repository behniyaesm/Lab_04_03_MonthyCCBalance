public class Main
{
    public static void main(String[] args)
    {
    double cardBalance = 5000.0;
    double interestRate = 0.17;
    double interest = 0;
    double dueBalance = 0;

    interest = cardBalance * interestRate;
    dueBalance = cardBalance + interest;
        System.out.println("The total credit card balance due for the first month is $" + dueBalance + ".");

    interest = dueBalance * interestRate;
    dueBalance = dueBalance + interest;
        System.out.println("The total credit card balance due for the second month is $" + dueBalance + ".");

    }
}