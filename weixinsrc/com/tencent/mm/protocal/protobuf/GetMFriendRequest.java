// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.tencent.mm.protocal.protobuf;

import c.a.a.a;
import c.a.a.c;
import com.tencent.mm.protobuf.BaseProtoBuf;

// Referenced classes of package com.tencent.mm.protocal.protobuf:
//            RequestProtoBuf, BaseRequest

public class GetMFriendRequest extends BaseProtoBuf
    implements RequestProtoBuf
{

    public GetMFriendRequest()
    {
    }

    public final int a()
    {
        int i = 0;
        if(e)
            i = 0 + c.a.a.a.a(2, d);
        if(g)
            i += c.a.a.a.b.a.b(3, f);
        return i + (0 + c.a.a.a.b(1, b.a()));
    }

    public final GetMFriendRequest a(int i)
    {
        d = i;
        e = true;
        return this;
    }

    public final GetMFriendRequest a(BaseRequest baserequest)
    {
        b = baserequest;
        c = true;
        return this;
    }

    public final GetMFriendRequest a(String s)
    {
        f = s;
        g = true;
        return this;
    }

    public final void a(c.a.a.c.a a1)
    {
        a1.b(1, b.a());
        b.a(a1);
        if(e)
            a1.a(2, d);
        if(g)
            a1.a(3, f);
    }

    public final byte[] b()
    {
        if(!c)
            throw new c((new StringBuilder()).append("Not all required fields were included (false = not included in message),  BaseRequest:").append(c).append("").toString());
        else
            return super.b();
    }

    public final int c()
    {
        return d;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("").append(getClass().getName()).append("(").toString();
        String s1 = (new StringBuilder()).append(s).append("BaseRequest = ").append(b).append("   ").toString();
        if(e)
            s1 = (new StringBuilder()).append(s1).append("OpType = ").append(d).append("   ").toString();
        if(g)
            s1 = (new StringBuilder()).append(s1).append("MD5 = ").append(f).append("   ").toString();
        return (new StringBuilder()).append(s1).append(")").toString();
    }

    private BaseRequest b;
    private boolean c;
    private int d;
    private boolean e;
    private String f;
    private boolean g;
}