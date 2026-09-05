class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here00
        for (int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(s2.contains(String.valueOf(ch))){
    00            s1 = s1.replace(String.valueOf(ch),"");
                s2 = s2.replace(String.valueOf(ch),"");
                i--;
            }
        }
        if(s1.length()==0&&s2.length()==0){
            return "-1";
        }
        String result = s1+s2;
        return result;
        
    }
}
