# Bank Account

Write a simple bank application that allows a user to create an account as an object under Account class. in Account class there will be some methods addMoney(amount) and reduceMoney(amount), and transferMoneyTo().

- Create a class called Account
- Create a method called addMoney(amount) that adds the amount to the account balance
- Create a method called reduceMoney(amount) that reduces the amount from the account balance
- Create a method called transferMoneyTo(amount, account) that transfers the amount from the current account to the account passed as a parameter

Use the following classes:

```java
class Account{
    int balance;
    void addMoney(int amount){
        // add amount to balance
    }
    void reduceMoney(int amount){
        // reduce amount from balance
    }
    void transferMoneyTo(Account account, int amount){
        // transfer amount from current account to account
    }
    int getBalance(){
        // return balance
    }
}

class Main{
    Account account1 = new Account(); // balance = 0
    Account account2 = new Account(); // balance = 0

    account1.addMoney(100);

    account1.reduceMoney(100);

    account1.transferMoneyTo(account2, 25);

    System.out.println(account1.balance); // 125
    System.out.println(account2.balance); // 75

    System.out.println(account1.getBalance()); // 125
    System.out.println(account2.getBalance()); // 75
}
```
