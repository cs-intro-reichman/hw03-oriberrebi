/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String A = args[0];
        System.out.println(uniqueChars(A));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String A) {
        String ans = "";
        

        for (int i = 0; i < A.length(); i++){
            if ((A.charAt(i)) != 32){
                if (ans.indexOf(A.charAt(i)) == -1) {
                    ans = ans + A.charAt(i);
                }
            }
            else{
                ans = ans + A.charAt(i);
            }
    }
    return ans;

}
}