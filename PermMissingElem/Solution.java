// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] data) {
    // write your code in Java SE 8
    long N = data.length + 1;
    long total = (N * (N + 1)) / 2;
    long sum = 0L;

    for (int i : data) {
        sum += i;
    }
    return (int)(total - sum);    
    }
}