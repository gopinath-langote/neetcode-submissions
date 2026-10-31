class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty())
            return null;
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length())
            .append("#")
            .append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str == null || str.isEmpty())
            return ans;
        boolean flag = true;
        int pos = 0;
        while(flag){
            str = str.substring(pos);
            if(str.isEmpty())
                break;
            int temp = str.indexOf("#");
            int strLen = Integer.valueOf(str.substring(0, temp));
            String decodedString = str.substring(temp + 1, strLen + temp +1);
            ans.add(decodedString);
            pos = temp + strLen + 1;
        }
        return ans;
    }
}
