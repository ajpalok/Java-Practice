public class Account {

    double balance;
    
    void addMoney(int amount){
        balance+=amount;
    }

    void reduceMoney(int amount){
        balance-=amount;
    }

    void transferMoneyTo(Account receiver, int amount){
        this.reduceMoney(amount);
        receiver.addMoney(amount);
    }

    double getBalance(){
        return balance;
    }
}