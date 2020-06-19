package MyThread.Sinchron;

public class SumArray {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Current value sum for: " + Thread.currentThread().getName() + ": " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        return sum;
    }
}
