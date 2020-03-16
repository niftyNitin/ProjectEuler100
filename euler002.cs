//Project Euler #2: Even Fibonacci numbers
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            long n = Convert.ToInt64(Console.ReadLine());
            long a=0,b=2;
            long sum = a + b;
            while(b<=n)
            {
                long c = (4 *b) + a;
                if(c>=n)
                    break;
                a=b;
                b=c;
                sum += c;
            }
        Console.WriteLine(sum);
        }
    }
}
