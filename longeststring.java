import java.util.HashSet;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int x=s.length();
      HashSet<Character> h=new HashSet<>();
      int l=0;
      int max=0;
      for(int r=0; r<x; r++){
         char c= s.charAt(r);
         while(h.contains(c)){
            h.remove(s.charAt(l));
            l++;
         }
         h.add(c);
         max=Math.max(max,r-l+1);
      }
      return max;
    
       
    }

void main(){
    String s="abbabcdefa";
    Solution obj=new Solution();
   int ans= lengthOfLongestSubstring( s);
     System.out.println(ans);
    

}
}