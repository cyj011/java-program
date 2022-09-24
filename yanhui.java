package yanhui;

public class yanhui {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> re = new ArrayList<>();
        re.add(1);
        for (int i = 1; i <= rowIndex; i++) {
        	re.add(0);
            for (int j = re.size() - 1; j >= 0; j--) {
                if (j == 0) {
                    continue;
                } else {
                	re.set(j, re.get(j) + re.get(j - 1));
                }

            }
        }
        return re;
    }
}