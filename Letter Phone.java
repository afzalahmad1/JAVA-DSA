public class Solution {
    String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        dfs(digits, 0, new StringBuilder(), res);
        return res;
    }
    
    public void dfs(String digits, int index, StringBuilder sb, ArrayList<String> res){
        if(index == digits.length()){
            res.add(sb.toString());
            return;
        }
        
        String str = map[digits.charAt(index) - '0'];
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            dfs(digits, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
