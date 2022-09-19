package guilv;

public class guilv {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class Solution {
    public boolean wordPattern(String pattern, String s) {
    	unordered_map<char,string> hash1;
    	unordered_map<char,string> hash2;
    	int cnt_str =0;
    	int i=0;
    	for (auto &e : pattern){
    		string str ="";
    		for(;i<s.size();i++) {
    			if(s[i]!=' ')str.push_back(s[i]);
    			else {
    				i++;
    				cnt_str +=1;
    				break;
    			}
    		}
    		if(hash1.find(e)!=hash1.end()&&hash1[e]!=str) return false;
    		if(hash2.find(str)!=hash2.end()&&hash2[str]!=e) return false;
    		hash2[str]=e;
    		hash1[e]=str;
    		str.clear();
    	}
    	cnt_str+=1;
    	if(cnt_str !=pattern.size()) return false;
    	return true;
    }
}