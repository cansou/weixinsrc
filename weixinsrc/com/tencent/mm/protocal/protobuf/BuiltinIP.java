// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.tencent.mm.protocal.protobuf;

import c.a.a.a;
import c.a.a.c;
import com.tencent.mm.protobuf.BaseProtoBuf;
import com.tencent.mm.protobuf.ByteString;

public class BuiltinIP extends BaseProtoBuf
{

    public BuiltinIP()
    {
    }

    public final int a()
    {
        return 0 + (0 + c.a.a.a.a(1, b) + c.a.a.a.a(2, d) + c.a.a.a.a(3, f));
    }

    public final void a(c.a.a.c.a a1)
    {
        a1.a(1, b);
        a1.a(2, d);
        a1.a(3, f);
    }

    public final byte[] b()
    {
        if(!c || !e || !g)
            throw new c((new StringBuilder()).append("Not all required fields were included (false = not included in message),  type:").append(c).append(" port:").append(e).append(" IP:").append(g).append("").toString());
        else
            return super.b();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("").append(getClass().getName()).append("(").toString();
        String s1 = (new StringBuilder()).append(s).append("type = ").append(b).append("   ").toString();
        String s2 = (new StringBuilder()).append(s1).append("port = ").append(d).append("   ").toString();
        String s3 = (new StringBuilder()).append(s2).append("IP = ").append(f).append("   ").toString();
        return (new StringBuilder()).append(s3).append(")").toString();
    }

    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private ByteString f;
    private boolean g;
}