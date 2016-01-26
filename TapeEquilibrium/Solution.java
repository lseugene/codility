// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long left = A[0];
        long right = 0;
        for(int i = 1; i < A.length; ++i){
            right += A[i];
        }
        
        long eq = Math.abs(left - right);
        for(int i = 1; i < A.length - 1; ++i) {
            left  += A[i];
            right -= A[i];
            eq = Long.min(Math.abs(left - right), eq);                        
        }
        return (int)eq;
    }    
}