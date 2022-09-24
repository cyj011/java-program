package t1078;

public class t1078 {
	

}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int sum = 0;
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            sum = 2*sum + A[i];
            sum %= 5;
            if (sum == 0) {
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}