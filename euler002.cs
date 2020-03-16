using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            long n = Convert.ToInt64(Console.ReadLine());
            long a=1,b=2,c=3,sum=2;
            while(c<=n)
            {
                if(c%2==0)
                    sum+=c;
                a=b;
                b=c;
                c=a+b;
            }
        Console.WriteLine(sum);
        }
    }
}
