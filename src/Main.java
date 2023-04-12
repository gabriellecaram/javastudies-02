import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Zane Alexander";
        String accountType = "Checking account";
        double balance = 2500.00;
        int option = 0;
        Scanner reading = new Scanner(System.in);
        String menu = """
                      1- Consult balance
                      2- Receive money
                      3- Wire transfer
                      4- Leave
                           """;

        System.out.println("Customer: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Opening balance: " + balance);
        System.out.println("\n");

        while(option!=4) {

            System.out.println("Please, choose an option: ");
            System.out.println(menu);
            option = reading.nextInt();

            switch (option){
                case 1:
                    System.out.println("US$ "+balance);
                    break;
                case 2:
                    System.out.println("type receiving amount: ");
                    int receive = reading.nextInt();
                    balance += receive;
                    System.out.println("Actual balance: " + balance);
                    break;
                case 3:
                    System.out.println("Type transfering amount: ");
                    int transfer = reading.nextInt();
                    if(balance >= transfer) {
                        balance = balance - transfer;
                        System.out.println("Actual balance: " + balance);
                    }else System.out.println("Insufficient funds.");
                    break;
                case 4:
                    break;
            }
        }

    }

}