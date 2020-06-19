package ForEach;

class ForEach {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int num : nums) {
//            if (num == 4) {
//                num = 40;
//            }
//            sum += num;
//            if (num == 5) {
//                break;
//            }
//        }
//        System.out.println("sum[3]: " + nums[3]);
//        System.out.println("Summa: " + sum);

        int[][] nums = {
                {3, 3, 3},
                {4, 4, 4},
                {5, 5, 5}
        };
        for (int x[] : nums) {
            int sum = 0;
            for (int y : x) {
                sum += y;
            }
            System.out.println(sum);
        }
    }
}
