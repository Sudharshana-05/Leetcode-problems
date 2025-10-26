class Bank {
    private final long[] bal;  // Account balances (0-indexed)
    private final int n;       // Number of accounts

    public Bank(long[] balance) {
        this.bal = balance;
        this.n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        // Validate both accounts and check sufficient balance
        if (!valid(account1) || !valid(account2) || bal[account1 - 1] < money) {
            return false;
        }
        // Perform transfer atomically
        bal[account1 - 1] -= money;
        bal[account2 - 1] += money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        // Validate account exists
        if (!valid(account)) {
            return false;
        }
        // Add money to account
        bal[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        // Validate account and check sufficient balance
        if (!valid(account) || bal[account - 1] < money) {
            return false;
        }
        // Subtract money from account
        bal[account - 1] -= money;
        return true;
    }
    
    // Helper method to validate account number
    private boolean valid(int account) {
        return account > 0 && account <= n;
    }
}