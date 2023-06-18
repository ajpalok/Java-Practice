public class Main {
    public static void main(String[] args) {
        Account A = new Account();

        System.out.println(A.balance);

        A.addMoney(3000);
        System.out.println("After adding money, Balance of A is: " + A.balance);

        A.reduceMoney(1500);
        System.out.println("After reducing money, Balance of A is: " + A.balance);

        Account B = new Account();
        A.transferMoneyTo(B,500);
        System.out.println("After Transferring money from A to B,\n\tBalance of A is: " + A.balance + "\n\tBalance of B is: " + B.balance);
    }
}