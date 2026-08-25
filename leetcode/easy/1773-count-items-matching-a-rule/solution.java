class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //        int count = 0;
        int n = items.size();
        int col;
        if(ruleKey.equals("color")) {
            col = 1;
        }
        else if(ruleKey.equals("name")){
            col = 2;
        } 
        else{
            col = 0;
        }

        int count = 0;

        for(int i = 0 ; i < n;i++ ){
//            String val = items.get(i).get(col);
            if (items.get(i).get(col).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}