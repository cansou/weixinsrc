// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package a.a.b;


// Referenced classes of package a.a.b:
//            n

final class l extends n
{

    l()
    {
        this((byte)0);
    }

    private l(byte byte0)
    {
    }

    final boolean a(int i, int j)
    {
        boolean flag;
        if((1 & (i >>> 1) + j / 3) == 0)
            flag = true;
        else
            flag = false;
        return flag;
    }
}
