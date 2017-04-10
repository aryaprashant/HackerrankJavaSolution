    static boolean isAnagram(String a, String b) {
        
        
        if(a.length()!= b.length())
            {
            return false;
        }
        else
            {
            char[] s1 = a.toLowerCase().toCharArray();
            char[] s2 = b.toLowerCase().toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2))
                return true;
            else
                return false;
        }
    }