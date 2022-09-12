package zimu;

public class zimu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class Solution {
    public int lengthOfLastWord(String s) {
    	int a=s.length()-1;
    	int sum=0;
    	for(int i=a;i>=0;i++)
    	{
    		if(s.charAt(i)!=' ')
    			sum++;
    		else if(s.charAt(i)==' ')
    		{
    			break;
    		}
    	}
    	return sum;	

    }
}