// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.tencent.mm.protocal.protobuf;

import c.a.a.a;
import c.a.a.c;
import com.tencent.mm.protobuf.BaseProtoBuf;

// Referenced classes of package com.tencent.mm.protocal.protobuf:
//            RequestProtoBuf, BaseRequest, SKBuiltinString_t

public class GetMsgImgRequest extends BaseProtoBuf
    implements RequestProtoBuf
{

    public GetMsgImgRequest()
    {
    }

    public final int a()
    {
        int i1 = 0 + c.a.a.a.a(2, d) + c.a.a.a.a(5, j) + c.a.a.a.a(6, l) + c.a.a.a.a(7, n);
        if(q)
            i1 += c.a.a.a.a(8, p);
        return i1 + (0 + c.a.a.a.b(1, b.a()) + c.a.a.a.b(3, f.a()) + c.a.a.a.b(4, h.a()));
    }

    public final void a(c.a.a.c.a a1)
    {
        a1.b(1, b.a());
        b.a(a1);
        a1.a(2, d);
        a1.b(3, f.a());
        f.a(a1);
        a1.b(4, h.a());
        h.a(a1);
        a1.a(5, j);
        a1.a(6, l);
        a1.a(7, n);
        if(q)
            a1.a(8, p);
    }

    public final byte[] b()
    {
        if(!c || !e || !g || !i || !k || !m || !o)
            throw new c((new StringBuilder()).append("Not all required fields were included (false = not included in message),  BaseRequest:").append(c).append(" MsgId:").append(e).append(" FromUserName:").append(g).append(" ToUserName:").append(i).append(" TotalLen:").append(k).append(" StartPos:").append(m).append(" DataLen:").append(o).append("").toString());
        else
            return super.b();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("").append(getClass().getName()).append("(").toString();
        String s1 = (new StringBuilder()).append(s).append("BaseRequest = ").append(b).append("   ").toString();
        String s2 = (new StringBuilder()).append(s1).append("MsgId = ").append(d).append("   ").toString();
        String s3 = (new StringBuilder()).append(s2).append("FromUserName = ").append(f).append("   ").toString();
        String s4 = (new StringBuilder()).append(s3).append("ToUserName = ").append(h).append("   ").toString();
        String s5 = (new StringBuilder()).append(s4).append("TotalLen = ").append(j).append("   ").toString();
        String s6 = (new StringBuilder()).append(s5).append("StartPos = ").append(l).append("   ").toString();
        String s7 = (new StringBuilder()).append(s6).append("DataLen = ").append(n).append("   ").toString();
        if(q)
            s7 = (new StringBuilder()).append(s7).append("CompressType = ").append(p).append("   ").toString();
        return (new StringBuilder()).append(s7).append(")").toString();
    }

    private BaseRequest b;
    private boolean c;
    private int d;
    private boolean e;
    private SKBuiltinString_t f;
    private boolean g;
    private SKBuiltinString_t h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
}
