import java.util.Scanner;

public class TrafficSignalStreak {

    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0)
            return;

        char longestColor = signalLog.charAt(0);

        int currentCount = 1;
        int maxCount = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i)
                    == signalLog.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println(
                "Longest Streak: '" + longestColor
                + "' repeated " + maxCount + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);
    }
}