class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
    Map<Character,Integer> countt=new HashMap<>();
    Map<Character,Integer> window=new HashMap<>();
    for(char c : t.toCharArray()){
        countt.put(c,countt.getOrDefault(c,0)+1);
    }
    int[] res={-1,-1};
    int reslen=Integer.MAX_VALUE;
    int have=0,need=countt.size();
    int l=0;
    for(int r=0;r<s.length();r++){
        char c=s.charAt(r);
        window.put(c,window.getOrDefault(c,0)+1);
        if(countt.containsKey(c) && window.get(c).equals(countt.get(c))){
            have++;
        }
        while(have==need){
            if(r-l+1<reslen){
                reslen=r-l+1;
                res[0]=l;
                res[1]=r;
            }
            char leftchar=s.charAt(l);
            window.put(leftchar,window.get(leftchar)-1);
            if(countt.containsKey(leftchar) && window.get(leftchar)<countt.get(leftchar)){
                have--;
            }
            l++;
        }
    }
    return reslen==Integer.MAX_VALUE? "":s.substring(res[0],res[1]+1);
}}
