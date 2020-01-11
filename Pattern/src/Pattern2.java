public class Pattern2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        System.out.print(" ");
        System.out.format("%5s","");
        for (int j = 0; j < nums.length; j++) {
            System.out.format("%5s",nums[j]);
        }
        System.out.println("");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.format("%3s",nums[i]);
            System.out.format("%2s","|");
            for (int j = 0; j < nums.length; j++) {

//                System.out.print(nums[i]*nums[j]+"%n");
//                System.out.printf("%n", nums[i] * nums[j]+"0");
                System.out.format("%5s",nums[i] * nums[j]);
            }

            System.out.println("");

        }

    }

}
