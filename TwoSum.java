//Leetcode Program 1
//Program to find the indices of two integers of an array that sum up to the target

class Leet1 {
    public int[] solution(int[] nums, int target){

        int[] indices=new int[2];
        int found=1;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    indices[0]=i;
                    indices[1]=j;
                    found=1;
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
        int[] nums={25,8,9,4,5};
        int target=7;
        Leet1 obj=new Leet1();
        int[] result=obj.solution(nums,target);                 //method call
        System.out.println(result[0]+","+result[1]);

    }
}

