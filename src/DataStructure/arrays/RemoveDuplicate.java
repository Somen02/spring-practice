package DataStructure.arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] nums={1,1,1,2,2,3,3,3};

        System.out.println(removeDuplicates(nums));

        for(int i:nums){
            System.out.print(i+",");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int index=1;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index-1]==nums[i]){
                count++;
                if(count==1){
                    nums[index]=nums[i];
                    index++;
                }

            }else{
                nums[index]=nums[i];
                index++;
                count=0;
            }
        }
        return index;
    }
}
