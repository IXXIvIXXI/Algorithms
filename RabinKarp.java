// hash( txt[s+1 .. s+m] ) = ( d ( hash( txt[s .. s+m-1]) – txt[s]*h ) + txt[s + m] ) mod q 
// hash( txt[s .. s+m-1] ) : Hash value at shift s. 
// hash( txt[s+1 .. s+m] ) : Hash value at next shift (or shift s+1) 
// d: Number of characters in the alphabet 
// q: A prime number 
// h: d^(m-1)

public class RabinKarp {
   public final static int d = 256;
  
    static void search(String pat, String txt, int q){
      int patLen = pat.length();
      int stringLen = txt.length();
      int hashTxt = 0;
      int hashPat = 0;
      int h = 1;
      int j;
      
      // get h
      for (int i = 0; i < patLen - 1; i++) {
        h = (h * d) % q;
      }
      
      // initialize hashTxt and hashPat by calculating
      // first hash value for substring from 0 - pattern length
      for (int i = 0; i < M; i++) {
        hashPat = (d*hashPat + pat.charAt(i)) % q;
        hashTxt = (d*hashTxt + txt.charAt(i)) % q;
      }
      
      for (int i = 0; int i <= stringLen - patLen; i++) {
        if (hashPat == hashTxt) {
          for (j = 0; j < patLen; j++) {
            if (txt.charAt(i + j) != pat.charAt(j)) {
              break;
            }
        }
        
        if (j == patLen) System.out.println("Find at index: " + i);
          
        if (i < stringLen - patLen) {
                hashTxt = (d*(hashTxt - txt.charAt(i)*h) + txt.charAt(i+patLen)) % q;
      
                // if its negative make it non-negative
                if (hashTxt < 0)
                hashTxt = (hashTxt + q);
            }
      }
    }
}
