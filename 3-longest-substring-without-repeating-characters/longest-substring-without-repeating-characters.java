class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        int start =0;
        int end =0;
        int Maxlen=Math.min(s.length(),1);
        Set<Character> Slide = new HashSet<>();
        while(end<s.length())
            {
            char c = s.charAt(end);
            while(Slide.contains(c))
             {
                Slide.remove(s.charAt(start));
                start+=1;
             }
            Slide.add(c);
            int window = end-start+1;
            Maxlen=Math.max(Maxlen,window);
            end+=1;
          }
          return Maxlen;
    }
}
