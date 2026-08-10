import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int id, String name, double balance) {

        accounts.put(id, new Account(id, name, balance));

        System.out.println("Account Created Successfully");
    }

    public void deposit(int id, double amount)
            throws AccountNotFoundException {

        if (!accounts.containsKey(id))
            throw new AccountNotFoundException("Account Not Found");
        if (amount <= 0) {
    System.out.println("Invalid Deposit Amount");
    return;
}
        Account a = accounts.get(id);

        a.setBalance(a.getBalance() + amount);

        System.out.println("Amount Deposited");
    }

    public void withdraw(int id, double amount)
            throws AccountNotFoundException,
            InsufficientFundsException {

        if (!accounts.containsKey(id))
            throw new AccountNotFoundException("Account Not Found");

        Account a = accounts.get(id);

        if (amount > a.getBalance())
            throw new InsufficientFundsException("Insufficient Balance");

        a.setBalance(a.getBalance() - amount);

        System.out.println("Amount Withdrawn");
    }

    public void checkBalance(int id)
            throws AccountNotFoundException {

        if (!accounts.containsKey(id))
            throw new AccountNotFoundException("Account Not Found");

        System.out.println("Balance : " + accounts.get(id).getBalance());
    }

    public void closeAccount(int id)
            throws AccountNotFoundException {

        if (!accounts.containsKey(id))
            throw new AccountNotFoundException("Account Not Found");

        accounts.remove(id);

        System.out.println("Account Closed");

    }
}