public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this(id, name);
        this.balance = balance;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit method
    public int credit(int amount) {
        if (amount >= 0) {
            balance += amount;
            return balance;
        } else {
            System.out.println("Amount cannot be negative.");
            return balance;
        }
    }

    // Debit method
    public int debit(int amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return balance;
        }
    }

    // Transfer method
    public int transferTo(Account anotherAccount, int amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            anotherAccount.credit(amount);
            return balance;
        } else {
            System.out.println("Amount exceeded balance.");
            return balance;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}