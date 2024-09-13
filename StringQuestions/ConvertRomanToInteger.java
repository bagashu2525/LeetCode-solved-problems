import java.util.HashMap;

public class ConvertRomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        s=s.toUpperCase();
        char[] ch= s.toCharArray();
        int sum=0;
        int i;
        for(i=0; i<s.length()-1; i++){
            if(mp.get(ch[i])>=mp.get(ch[i+1]))
                sum+=mp.get(ch[i]);
            else
                sum-=mp.get(ch[i]);
        }
        sum+=mp.get(ch[i]);
        return sum;
    }
}
