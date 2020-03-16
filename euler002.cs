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
            long c = 4 * b + a;
            long sum = a + b;
            do
            {                
                sum += c;              
                a=b;
                b=c;
                c = 4 * b + a;
            }
            while(c<=n);
        Console.WriteLine(sum);
        }
    }
}
