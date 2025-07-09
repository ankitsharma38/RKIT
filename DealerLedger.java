import java.util.Scanner;

public class DealerLedger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDays = input.nextInt();

        //array to store money for each day
        int[] moneyFlow = new int[numberOfDays];

        //dailly transaction enter by users
        for (int i = 0; i < numberOfDays; i++) {
            moneyFlow[i] = input.nextInt();
        }
        int currBal = 0;
        
        //adding amount for each day
        //and checking if balance is 0
        for (int day = 0; day < numberOfDays; day++) {
            currBal += moneyFlow[day];
            // If balance is 0, we found the answer
            if (currBal == 0) {
                System.out.println(day + 1); 
                input.close();
                return;
            }
        }
        // If we never hit 0 balance
        System.out.println(-1);
    }
}
