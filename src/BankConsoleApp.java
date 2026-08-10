import java.util.Scanner;

public class BankConsoleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        int choice;

        do {

            System.out.println("\n===== SecureBank =====");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balance");
            System.out.println("5.Close Account");
            System.out.println("6.Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Account ID : ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();

                        System.out.print("Enter Balance : ");
                        double balance = sc.nextDouble();

                        bank.createAccount(id, name, balance);

                        break;

                    case 2:

                        System.out.print("Enter Account ID : ");
                        id = sc.nextInt();

                        System.out.print("Enter Amount : ");
                        double amount = sc.nextDouble();

                        bank.deposit(id, amount);

                        break;

                    case 3:

                        System.out.print("Enter Account ID : ");
                        id = sc.nextInt();

                        System.out.print("Enter Amount : ");
                        amount = sc.nextDouble();

                        bank.withdraw(id, amount);

                        break;

                    case 4:

                        System.out.print("Enter Account ID : ");
                        id = sc.nextInt();

                        bank.checkBalance(id);

                        break;

                    case 5:

                        System.out.print("Enter Account ID : ");
                        id = sc.nextInt();

                        bank.closeAccount(id);

                        break;

                    case 6:

                        System.out.println("Thank You");

                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        } while (choice != 6);

        sc.close();
    }
}