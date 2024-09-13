package GreedyAlgo;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length!=0 && g.length!=0){
        while(l<g.length && r<s.length){
            if(g[l]<=s[r])
                l++;
            r++;
        }
        }
        return l;
    }
}
