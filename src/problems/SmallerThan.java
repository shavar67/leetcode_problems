package problems;

public class SmallerThan {


    public static void main(String[] args) {

        int [] nums = {6,3,7,6,9};
        int [] temps = smallerNum(nums);
        for (int temp : temps) {
            System.out.println(temp);

        }
    }

     public static int [] smallerNum(int [] nums){
        int [] results = new int[nums.length];
        int counter = 0;
        if(nums.length == 0) return nums;
        for(int i = 0; i < nums.length;i++){
            for (int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i] && j != i){

                    counter++;
                    results[i]  = counter;
                }

            }
            counter = 0;
        }


        return results;
     }
}
