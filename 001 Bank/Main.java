public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
        System.out.println(account1.balance);

        account1.addMoney(3000);
        System.out.println("After adding money, Balance of account1 is: " + account1.balance);

        account1.reduceMoney(1500);
        System.out.println("After reducing money, Balance of account1 is: " + account1.balance);

        Account account2 = new Account();

        account1.transferMoneyTo(account2,500);
        System.out.println("After Transferring money from account1 to account2,\n\tBalance of account1 is: " + account1.balance + "\n\tBalance of account2 is: " + account2.balance);


        System.out.println("\nReturning value of a method test:\n");

        System.out.println("Balance of account1 is: " + account1.getBalance());
        System.out.println("Balance of account2 is: " + account2.getBalance());

    }
}