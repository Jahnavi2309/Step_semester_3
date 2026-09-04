import java.util.Scanner;

public class DuplicateSeatChecker {

    static void checkDuplicateSeats(int[] seats) {
        boolean found = false;

        for (int i = 0; i < seats.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (seats[i] == seats[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = i + 1; j < seats.length; j++) {
                if (seats[i] == seats[j]) {
                    System.out.println(
                        "Duplicate Seat Number Found: " + seats[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No Duplicate Seats Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat numbers:");

        for (int i = 0; i < n; i++)
            seats[i] = sc.nextInt();

        checkDuplicateSeats(seats);
    }
}