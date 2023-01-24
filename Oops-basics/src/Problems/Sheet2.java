package Problems;

import java.util.HashMap;
import java.util.Map;

public class Sheet2 {

    public static void main(String[] args) {
        String line = "Please encrypt this text";
        String key = "abcde";
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put ('a',1);
        for (int i = 1; i < 26; i++) {
            hm.put((char) ('a'+i),i+1);
        }
        String low_lineline=line.toLowerCase();
        int j =0 ;
        int value  = 0;
        for (int i = 0; i <line.length(); i++) {

            if (j == key.length()){
                j = 0;
            }
            if (line.charAt(i) == ' '){
                sb.append(' ');


            }
            else {
                value = hm.get(low_lineline.charAt(i))+ hm.get(key.charAt(j));
                if (value > 26){
                    value = value % 26;
                }
                for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
                    if(entry.getValue() == value) {
                        sb.append(entry.getKey());
                        break;
                    }
                }
            }
           if (line.charAt(i) == ' '){
               j=0;
           }
           else {
               j++;
           }








        }
        System.out.println(sb);
    }
}
