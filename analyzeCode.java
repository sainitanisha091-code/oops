import java.util.*;
class Solution {
    public static void analyzeCode(String s) {
        int upper = 0 ; 
        int lower = 0 ; 
        int digit=0;
        for (int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if(Character.isLowerCase(ch)){
                lower++;
            }
            else{
                digit++;
            }
        }
        System.out.print(upper+" "+lower+" "+digit);
        
        
    }
}

