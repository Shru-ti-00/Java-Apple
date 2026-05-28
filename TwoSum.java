class Leet1 {
    public int[] solution(int[] nums, int target){

        int[] indices=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    indices[0]=i;
                    indices[1]=j;
                    break;
                }
                
            }
        }
        return indices;
    }    
}

public class TwoSum
{
    public static void main(String[] args)                      //main method
    {
        int[] nums={2,7,11,15};
        int target=9;
        Leet1 obj=new Leet1();
        int[] result=obj.solution(nums,target);
        System.out.println(result[0]+","+result[1]);

    }
}

