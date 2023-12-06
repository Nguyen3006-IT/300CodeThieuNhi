/* 
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


Example 1:
Input: n = 2
    Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
    Input: n = 3
    Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

==> 1 <= n <= 45 <==

                n = 4          |
               /     \         |
             3        2        |
           /  \     /  \       | ==> way(n) = step(n-1) + step(n-2) 
          2    1   1    0      |
        /  \                   |
       1    0                  |

*/

import java.util.Scanner;

public class Sentence17 {
    public int climbStairs(int n) {
        if (n <= 1) 
            return n;

        return climbStairs(n-1) + climbStairs(n-2);
    }
    
    public static void main(String[] args) {
        Sentence17 run = new Sentence17();
        Scanner input = new Scanner(System.in);
        System.out.println(run.climbStairs(input.nextInt() + 1));

    }
}
