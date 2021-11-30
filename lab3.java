package com.company;
import java.math.BigDecimal;
import java.math.*;


class lab3 {
    static int gcd(int e, int z)
{
    if (e == 0)
        return z;
    else
        return gcd(z % e, e);
}
    public static void main(String args[])
    {
        int p, q, n, z, d = 0, e, i;
        int msg = 12;
        double c;
        BigInteger msgback;
        p = 3;
        q = 11;
        n = p * q;
        z = (p - 1) * (q - 1);
        System.out.println("значение z= " + z);
        for (e = 2; e < z; e++) {
            if (gcd(e, z) == 1) {
                break;
            }
        }
        System.out.println("значение e = " + e);
        for (i = 0; i <= 9; i++) {
            int x = 1 + (i * z);
            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        System.out.println("значение d = " + d);
        c = (Math.pow(msg, e)) % n;
        System.out.println("Зашифрованное значение : " + c);
        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        msgback = (C.pow(d)).mod(N);
        System.out.println("Расшифрованное: "
                + msgback);
    }

}

