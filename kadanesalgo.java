public class kadanesalgo {
   public static int max(int[]array) {
       int sum = 0;
       int max = 0;
       for (int i = 0; i < array.length; i++) {
           if (sum + array[i] < 0)
               sum = 0;
           else
               sum = sum + array[i];
           max = (int) (Math.max(max, sum));

       }

       System.out.println(sum);
   return max;}



    public static void main(String[] args) {
     int []arr={-2,-3,4-1,-2,1,5,-3};
        System.out.println(max(arr));
    }
}
