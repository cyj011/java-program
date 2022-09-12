import java.util.Scanner;

public class huiwen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="1234567";
		for(int i=0;i<5 ;i++)
			System.out.println(i);
	}

}
class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0)
    		return false;
    	else {
    		String s=x +"";
    		int a= 0;
    		int b=s.length() -1;
    		while(a<b)
    			if(s.charAt(a++) !=s.charAt(b--))
    				return false;
    	}
    	return true;
    }
}