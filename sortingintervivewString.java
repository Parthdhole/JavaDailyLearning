package sortingKunal;

public class sortingintervivewString {
    public static void main(String[] args) {
        String s="babad";
        System.out.println("The given String is palindrom "+isPalindrome(s));
        System.out.println("The given String is islongestplindrom "+longestPalindrome(s));


    }
        public static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

            public static String longestPalindrome(String s){
                String longest = "";
                // Outer loop for starting index
               for(int i=0;i<s.length();i++){
                   for(int j=i;j<s.length();j++){
                       String subarray=s.substring(i,j+1);
                       if( subarray.length()>longest.length()){
                           longest=subarray;

                       }
                   }
                }
                return longest;
            }
}
