package liangshuhe;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	}
}

//学号：202102915
//姓名：蔡宇杰
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] sum =new int[2];
    	for(int i =0;i<=nums.length-2;i++)
    		for(int j=i+1;j<=nums.length-1;j++)
    			if(nums[i]+nums[j]== target &&i!=j) {
    				sum[0]=i;
    				sum[1]=j;
    			}
    	return sum;
    }
}
