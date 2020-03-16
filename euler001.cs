using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            long n = Convert.ToInt64(Console.ReadLine());
            long n1=0,n2=0,n3=0;
            n1 = (n-1)/3;
            n1 = 3*n1*(n1+1)/2;
            n2 = (n-1)/5;
            n2 = 5*n2*(n2+1)/2;
            n3 = (n-1)/15;
            n3 = 15*n3*(n3+1)/2;
            Console.WriteLine(n1+n2-n3);
        }
    }
}
