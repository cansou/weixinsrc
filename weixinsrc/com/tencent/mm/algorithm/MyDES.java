// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.tencent.mm.algorithm;


// Referenced classes of package com.tencent.mm.algorithm:
//            MyByteArray

public class MyDES
{

    public MyDES()
    {
    }

    public static char a(byte abyte0[], byte abyte1[], long l, int i, byte abyte2[])
    {
        MyByteArray mybytearray;
        MyByteArray mybytearray1;
        MyByteArray amybytearray[];
        MyByteArray mybytearray2;
        MyByteArray mybytearray3;
        MyByteArray mybytearray4;
        MyByteArray mybytearray5;
        MyByteArray mybytearray6;
        MyByteArray mybytearray7;
        MyByteArray mybytearray8;
        MyByteArray mybytearray9;
        MyByteArray mybytearray10;
        MyByteArray mybytearray11;
        MyByteArray mybytearray12;
        MyByteArray mybytearray13;
        mybytearray = new MyByteArray(abyte0);
        mybytearray1 = new MyByteArray(abyte1);
        amybytearray = new MyByteArray[16];
        for(int j = 0; j < 16; j++)
            amybytearray[j] = new MyByteArray(new byte[48]);

        mybytearray2 = new MyByteArray(new byte[256]);
        mybytearray3 = new MyByteArray(new byte[24]);
        mybytearray4 = new MyByteArray(new byte[64]);
        mybytearray5 = new MyByteArray();
        mybytearray6 = new MyByteArray();
        mybytearray7 = new MyByteArray();
        mybytearray8 = new MyByteArray();
        mybytearray9 = new MyByteArray(new byte[64]);
        mybytearray10 = new MyByteArray(new byte[48]);
        mybytearray11 = new MyByteArray(new byte[32]);
        mybytearray12 = new MyByteArray(new byte[9]);
        mybytearray13 = new MyByteArray(new byte[8]);
        if(abyte2 == null || abyte2.length <= 0) goto _L2; else goto _L1
_L1:
        long l1 = -8L & 7L + l;
        if(l1 != 0L) goto _L3; else goto _L2
_L2:
        char c1 = '\0';
_L5:
        return c1;
_L3:
        mybytearray5.b = 0;
        mybytearray5.a = mybytearray4.a;
        mybytearray6.b = 28;
        mybytearray6.a = mybytearray4.a;
        mybytearray7.b = 0;
        mybytearray7.a = mybytearray9.a;
        mybytearray8.b = 32;
        mybytearray8.a = mybytearray9.a;
        a(mybytearray3, 24);
        MyByteArray mybytearray14 = new MyByteArray(abyte2);
        if(i > 24)
            i = 24;
        d(mybytearray3, mybytearray14, i);
        byte abyte3[] = new byte[56];
        abyte3[0] = 57;
        abyte3[1] = 49;
        abyte3[2] = 41;
        abyte3[3] = 33;
        abyte3[4] = 25;
        abyte3[5] = 17;
        abyte3[6] = 9;
        abyte3[7] = 1;
        abyte3[8] = 58;
        abyte3[9] = 50;
        abyte3[10] = 42;
        abyte3[11] = 34;
        abyte3[12] = 26;
        abyte3[13] = 18;
        abyte3[14] = 10;
        abyte3[15] = 2;
        abyte3[16] = 59;
        abyte3[17] = 51;
        abyte3[18] = 43;
        abyte3[19] = 35;
        abyte3[20] = 27;
        abyte3[21] = 19;
        abyte3[22] = 11;
        abyte3[23] = 3;
        abyte3[24] = 60;
        abyte3[25] = 52;
        abyte3[26] = 44;
        abyte3[27] = 36;
        abyte3[28] = 63;
        abyte3[29] = 55;
        abyte3[30] = 47;
        abyte3[31] = 39;
        abyte3[32] = 31;
        abyte3[33] = 23;
        abyte3[34] = 15;
        abyte3[35] = 7;
        abyte3[36] = 62;
        abyte3[37] = 54;
        abyte3[38] = 46;
        abyte3[39] = 38;
        abyte3[40] = 30;
        abyte3[41] = 22;
        abyte3[42] = 14;
        abyte3[43] = 6;
        abyte3[44] = 61;
        abyte3[45] = 53;
        abyte3[46] = 45;
        abyte3[47] = 37;
        abyte3[48] = 29;
        abyte3[49] = 21;
        abyte3[50] = 13;
        abyte3[51] = 5;
        abyte3[52] = 28;
        abyte3[53] = 20;
        abyte3[54] = 12;
        abyte3[55] = 4;
        byte abyte4[] = new byte[48];
        abyte4[0] = 14;
        abyte4[1] = 17;
        abyte4[2] = 11;
        abyte4[3] = 24;
        abyte4[4] = 1;
        abyte4[5] = 5;
        abyte4[6] = 3;
        abyte4[7] = 28;
        abyte4[8] = 15;
        abyte4[9] = 6;
        abyte4[10] = 21;
        abyte4[11] = 10;
        abyte4[12] = 23;
        abyte4[13] = 19;
        abyte4[14] = 12;
        abyte4[15] = 4;
        abyte4[16] = 26;
        abyte4[17] = 8;
        abyte4[18] = 16;
        abyte4[19] = 7;
        abyte4[20] = 27;
        abyte4[21] = 20;
        abyte4[22] = 13;
        abyte4[23] = 2;
        abyte4[24] = 41;
        abyte4[25] = 52;
        abyte4[26] = 31;
        abyte4[27] = 37;
        abyte4[28] = 47;
        abyte4[29] = 55;
        abyte4[30] = 30;
        abyte4[31] = 40;
        abyte4[32] = 51;
        abyte4[33] = 45;
        abyte4[34] = 33;
        abyte4[35] = 48;
        abyte4[36] = 44;
        abyte4[37] = 49;
        abyte4[38] = 39;
        abyte4[39] = 56;
        abyte4[40] = 34;
        abyte4[41] = 53;
        abyte4[42] = 46;
        abyte4[43] = 42;
        abyte4[44] = 50;
        abyte4[45] = 36;
        abyte4[46] = 29;
        abyte4[47] = 32;
        byte abyte5[] = new byte[16];
        abyte5[0] = 1;
        abyte5[1] = 1;
        abyte5[2] = 2;
        abyte5[3] = 2;
        abyte5[4] = 2;
        abyte5[5] = 2;
        abyte5[6] = 2;
        abyte5[7] = 2;
        abyte5[8] = 1;
        abyte5[9] = 2;
        abyte5[10] = 2;
        abyte5[11] = 2;
        abyte5[12] = 2;
        abyte5[13] = 2;
        abyte5[14] = 2;
        abyte5[15] = 1;
        b(mybytearray4, mybytearray3, 64);
        a(mybytearray4, mybytearray4, abyte3, 56, mybytearray2);
        for(int k = 0; k < 16; k++)
        {
            c(mybytearray5, mybytearray2, abyte5[k]);
            c(mybytearray6, mybytearray2, abyte5[k]);
            a(amybytearray[k], mybytearray4, abyte4, 48, mybytearray2);
        }

        int i1 = mybytearray1.b;
        int j1 = mybytearray.b;
        a(mybytearray, mybytearray12, amybytearray, mybytearray9, mybytearray10, mybytearray11, mybytearray7, mybytearray8, mybytearray2);
        d(mybytearray13, mybytearray, 8);
        mybytearray.b = 8 + mybytearray.b;
        long l2 = 0L;
        for(long l3 = l1 >> 3; l2 < l3;)
        {
            for(int k1 = 0; k1 < 8; k1++)
                mybytearray13.a[k1 + mybytearray13.b] = (byte)(mybytearray13.a[k1 + mybytearray13.b] ^ mybytearray1.a[k1 + mybytearray1.b]);

            a(mybytearray, mybytearray13, amybytearray, mybytearray9, mybytearray10, mybytearray11, mybytearray7, mybytearray8, mybytearray2);
            d(mybytearray13, mybytearray, 8);
            l2++;
            mybytearray.b = 8 + mybytearray.b;
            mybytearray1.b = 8 + mybytearray1.b;
        }

        mybytearray1.b = i1;
        mybytearray.b = j1;
        c1 = '\001';
        if(true) goto _L5; else goto _L4
_L4:
    }

    private static void a(MyByteArray mybytearray, int i)
    {
        for(int j = 0; j < i; j++)
            mybytearray.a[j + mybytearray.b] = 0;

    }

    private static void a(MyByteArray mybytearray, MyByteArray mybytearray1, int i)
    {
        for(int j = 0; j < i; j++)
        {
            byte abyte0[] = mybytearray.a;
            int k = j + mybytearray.b;
            abyte0[k] = (byte)(abyte0[k] ^ mybytearray1.a[j + mybytearray1.b]);
        }

    }

    private static void a(MyByteArray mybytearray, MyByteArray mybytearray1, byte abyte0[], int i, MyByteArray mybytearray2)
    {
        for(int j = 0; j < i; j++)
            mybytearray2.a[j + mybytearray2.b] = mybytearray1.a[-1 + (mybytearray1.b + abyte0[j])];

        d(mybytearray, mybytearray2, i);
    }

    private static void a(MyByteArray mybytearray, MyByteArray mybytearray1, MyByteArray amybytearray[], MyByteArray mybytearray2, MyByteArray mybytearray3, MyByteArray mybytearray4, MyByteArray mybytearray5, MyByteArray mybytearray6, 
            MyByteArray mybytearray7)
    {
        byte abyte0[] = new byte[64];
        abyte0[0] = 58;
        abyte0[1] = 50;
        abyte0[2] = 42;
        abyte0[3] = 34;
        abyte0[4] = 26;
        abyte0[5] = 18;
        abyte0[6] = 10;
        abyte0[7] = 2;
        abyte0[8] = 60;
        abyte0[9] = 52;
        abyte0[10] = 44;
        abyte0[11] = 36;
        abyte0[12] = 28;
        abyte0[13] = 20;
        abyte0[14] = 12;
        abyte0[15] = 4;
        abyte0[16] = 62;
        abyte0[17] = 54;
        abyte0[18] = 46;
        abyte0[19] = 38;
        abyte0[20] = 30;
        abyte0[21] = 22;
        abyte0[22] = 14;
        abyte0[23] = 6;
        abyte0[24] = 64;
        abyte0[25] = 56;
        abyte0[26] = 48;
        abyte0[27] = 40;
        abyte0[28] = 32;
        abyte0[29] = 24;
        abyte0[30] = 16;
        abyte0[31] = 8;
        abyte0[32] = 57;
        abyte0[33] = 49;
        abyte0[34] = 41;
        abyte0[35] = 33;
        abyte0[36] = 25;
        abyte0[37] = 17;
        abyte0[38] = 9;
        abyte0[39] = 1;
        abyte0[40] = 59;
        abyte0[41] = 51;
        abyte0[42] = 43;
        abyte0[43] = 35;
        abyte0[44] = 27;
        abyte0[45] = 19;
        abyte0[46] = 11;
        abyte0[47] = 3;
        abyte0[48] = 61;
        abyte0[49] = 53;
        abyte0[50] = 45;
        abyte0[51] = 37;
        abyte0[52] = 29;
        abyte0[53] = 21;
        abyte0[54] = 13;
        abyte0[55] = 5;
        abyte0[56] = 63;
        abyte0[57] = 55;
        abyte0[58] = 47;
        abyte0[59] = 39;
        abyte0[60] = 31;
        abyte0[61] = 23;
        abyte0[62] = 15;
        abyte0[63] = 7;
        byte abyte1[] = new byte[64];
        abyte1[0] = 40;
        abyte1[1] = 8;
        abyte1[2] = 48;
        abyte1[3] = 16;
        abyte1[4] = 56;
        abyte1[5] = 24;
        abyte1[6] = 64;
        abyte1[7] = 32;
        abyte1[8] = 39;
        abyte1[9] = 7;
        abyte1[10] = 47;
        abyte1[11] = 15;
        abyte1[12] = 55;
        abyte1[13] = 23;
        abyte1[14] = 63;
        abyte1[15] = 31;
        abyte1[16] = 38;
        abyte1[17] = 6;
        abyte1[18] = 46;
        abyte1[19] = 14;
        abyte1[20] = 54;
        abyte1[21] = 22;
        abyte1[22] = 62;
        abyte1[23] = 30;
        abyte1[24] = 37;
        abyte1[25] = 5;
        abyte1[26] = 45;
        abyte1[27] = 13;
        abyte1[28] = 53;
        abyte1[29] = 21;
        abyte1[30] = 61;
        abyte1[31] = 29;
        abyte1[32] = 36;
        abyte1[33] = 4;
        abyte1[34] = 44;
        abyte1[35] = 12;
        abyte1[36] = 52;
        abyte1[37] = 20;
        abyte1[38] = 60;
        abyte1[39] = 28;
        abyte1[40] = 35;
        abyte1[41] = 3;
        abyte1[42] = 43;
        abyte1[43] = 11;
        abyte1[44] = 51;
        abyte1[45] = 19;
        abyte1[46] = 59;
        abyte1[47] = 27;
        abyte1[48] = 34;
        abyte1[49] = 2;
        abyte1[50] = 42;
        abyte1[51] = 10;
        abyte1[52] = 50;
        abyte1[53] = 18;
        abyte1[54] = 58;
        abyte1[55] = 26;
        abyte1[56] = 33;
        abyte1[57] = 1;
        abyte1[58] = 41;
        abyte1[59] = 9;
        abyte1[60] = 49;
        abyte1[61] = 17;
        abyte1[62] = 57;
        abyte1[63] = 25;
        b(mybytearray2, mybytearray1, 64);
        a(mybytearray2, mybytearray2, abyte0, 64, mybytearray7);
        for(int i = 0; i < 16; i++)
        {
            d(mybytearray4, mybytearray6, 32);
            MyByteArray mybytearray8 = amybytearray[i];
            byte abyte3[] = new byte[48];
            abyte3[0] = 32;
            abyte3[1] = 1;
            abyte3[2] = 2;
            abyte3[3] = 3;
            abyte3[4] = 4;
            abyte3[5] = 5;
            abyte3[6] = 4;
            abyte3[7] = 5;
            abyte3[8] = 6;
            abyte3[9] = 7;
            abyte3[10] = 8;
            abyte3[11] = 9;
            abyte3[12] = 8;
            abyte3[13] = 9;
            abyte3[14] = 10;
            abyte3[15] = 11;
            abyte3[16] = 12;
            abyte3[17] = 13;
            abyte3[18] = 12;
            abyte3[19] = 13;
            abyte3[20] = 14;
            abyte3[21] = 15;
            abyte3[22] = 16;
            abyte3[23] = 17;
            abyte3[24] = 16;
            abyte3[25] = 17;
            abyte3[26] = 18;
            abyte3[27] = 19;
            abyte3[28] = 20;
            abyte3[29] = 21;
            abyte3[30] = 20;
            abyte3[31] = 21;
            abyte3[32] = 22;
            abyte3[33] = 23;
            abyte3[34] = 24;
            abyte3[35] = 25;
            abyte3[36] = 24;
            abyte3[37] = 25;
            abyte3[38] = 26;
            abyte3[39] = 27;
            abyte3[40] = 28;
            abyte3[41] = 29;
            abyte3[42] = 28;
            abyte3[43] = 29;
            abyte3[44] = 30;
            abyte3[45] = 31;
            abyte3[46] = 32;
            abyte3[47] = 1;
            byte abyte4[] = new byte[32];
            abyte4[0] = 16;
            abyte4[1] = 7;
            abyte4[2] = 20;
            abyte4[3] = 21;
            abyte4[4] = 29;
            abyte4[5] = 12;
            abyte4[6] = 28;
            abyte4[7] = 17;
            abyte4[8] = 1;
            abyte4[9] = 15;
            abyte4[10] = 23;
            abyte4[11] = 26;
            abyte4[12] = 5;
            abyte4[13] = 18;
            abyte4[14] = 31;
            abyte4[15] = 10;
            abyte4[16] = 2;
            abyte4[17] = 8;
            abyte4[18] = 24;
            abyte4[19] = 14;
            abyte4[20] = 32;
            abyte4[21] = 27;
            abyte4[22] = 3;
            abyte4[23] = 9;
            abyte4[24] = 19;
            abyte4[25] = 13;
            abyte4[26] = 30;
            abyte4[27] = 6;
            abyte4[28] = 22;
            abyte4[29] = 11;
            abyte4[30] = 4;
            abyte4[31] = 25;
            a(mybytearray3, mybytearray6, abyte3, 48, mybytearray7);
            a(mybytearray3, mybytearray8, 48);
            byte abyte5[][][] = new byte[8][][];
            byte abyte6[][] = new byte[4][];
            byte abyte7[] = new byte[16];
            abyte7[0] = 14;
            abyte7[1] = 4;
            abyte7[2] = 13;
            abyte7[3] = 1;
            abyte7[4] = 2;
            abyte7[5] = 15;
            abyte7[6] = 11;
            abyte7[7] = 8;
            abyte7[8] = 3;
            abyte7[9] = 10;
            abyte7[10] = 6;
            abyte7[11] = 12;
            abyte7[12] = 5;
            abyte7[13] = 9;
            abyte7[14] = 0;
            abyte7[15] = 7;
            abyte6[0] = abyte7;
            byte abyte8[] = new byte[16];
            abyte8[0] = 0;
            abyte8[1] = 15;
            abyte8[2] = 7;
            abyte8[3] = 4;
            abyte8[4] = 14;
            abyte8[5] = 2;
            abyte8[6] = 13;
            abyte8[7] = 1;
            abyte8[8] = 10;
            abyte8[9] = 6;
            abyte8[10] = 12;
            abyte8[11] = 11;
            abyte8[12] = 9;
            abyte8[13] = 5;
            abyte8[14] = 3;
            abyte8[15] = 8;
            abyte6[1] = abyte8;
            byte abyte9[] = new byte[16];
            abyte9[0] = 4;
            abyte9[1] = 1;
            abyte9[2] = 14;
            abyte9[3] = 8;
            abyte9[4] = 13;
            abyte9[5] = 6;
            abyte9[6] = 2;
            abyte9[7] = 11;
            abyte9[8] = 15;
            abyte9[9] = 12;
            abyte9[10] = 9;
            abyte9[11] = 7;
            abyte9[12] = 3;
            abyte9[13] = 10;
            abyte9[14] = 5;
            abyte9[15] = 0;
            abyte6[2] = abyte9;
            byte abyte10[] = new byte[16];
            abyte10[0] = 15;
            abyte10[1] = 12;
            abyte10[2] = 8;
            abyte10[3] = 2;
            abyte10[4] = 4;
            abyte10[5] = 9;
            abyte10[6] = 1;
            abyte10[7] = 7;
            abyte10[8] = 5;
            abyte10[9] = 11;
            abyte10[10] = 3;
            abyte10[11] = 14;
            abyte10[12] = 10;
            abyte10[13] = 0;
            abyte10[14] = 6;
            abyte10[15] = 13;
            abyte6[3] = abyte10;
            abyte5[0] = abyte6;
            byte abyte11[][] = new byte[4][];
            byte abyte12[] = new byte[16];
            abyte12[0] = 15;
            abyte12[1] = 1;
            abyte12[2] = 8;
            abyte12[3] = 14;
            abyte12[4] = 6;
            abyte12[5] = 11;
            abyte12[6] = 3;
            abyte12[7] = 4;
            abyte12[8] = 9;
            abyte12[9] = 7;
            abyte12[10] = 2;
            abyte12[11] = 13;
            abyte12[12] = 12;
            abyte12[13] = 0;
            abyte12[14] = 5;
            abyte12[15] = 10;
            abyte11[0] = abyte12;
            byte abyte13[] = new byte[16];
            abyte13[0] = 3;
            abyte13[1] = 13;
            abyte13[2] = 4;
            abyte13[3] = 7;
            abyte13[4] = 15;
            abyte13[5] = 2;
            abyte13[6] = 8;
            abyte13[7] = 14;
            abyte13[8] = 12;
            abyte13[9] = 0;
            abyte13[10] = 1;
            abyte13[11] = 10;
            abyte13[12] = 6;
            abyte13[13] = 9;
            abyte13[14] = 11;
            abyte13[15] = 5;
            abyte11[1] = abyte13;
            byte abyte14[] = new byte[16];
            abyte14[0] = 0;
            abyte14[1] = 14;
            abyte14[2] = 7;
            abyte14[3] = 11;
            abyte14[4] = 10;
            abyte14[5] = 4;
            abyte14[6] = 13;
            abyte14[7] = 1;
            abyte14[8] = 5;
            abyte14[9] = 8;
            abyte14[10] = 12;
            abyte14[11] = 6;
            abyte14[12] = 9;
            abyte14[13] = 3;
            abyte14[14] = 2;
            abyte14[15] = 15;
            abyte11[2] = abyte14;
            byte abyte15[] = new byte[16];
            abyte15[0] = 13;
            abyte15[1] = 8;
            abyte15[2] = 10;
            abyte15[3] = 1;
            abyte15[4] = 3;
            abyte15[5] = 15;
            abyte15[6] = 4;
            abyte15[7] = 2;
            abyte15[8] = 11;
            abyte15[9] = 6;
            abyte15[10] = 7;
            abyte15[11] = 12;
            abyte15[12] = 0;
            abyte15[13] = 5;
            abyte15[14] = 14;
            abyte15[15] = 9;
            abyte11[3] = abyte15;
            abyte5[1] = abyte11;
            byte abyte16[][] = new byte[4][];
            byte abyte17[] = new byte[16];
            abyte17[0] = 10;
            abyte17[1] = 0;
            abyte17[2] = 9;
            abyte17[3] = 14;
            abyte17[4] = 6;
            abyte17[5] = 3;
            abyte17[6] = 15;
            abyte17[7] = 5;
            abyte17[8] = 1;
            abyte17[9] = 13;
            abyte17[10] = 12;
            abyte17[11] = 7;
            abyte17[12] = 11;
            abyte17[13] = 4;
            abyte17[14] = 2;
            abyte17[15] = 8;
            abyte16[0] = abyte17;
            byte abyte18[] = new byte[16];
            abyte18[0] = 13;
            abyte18[1] = 7;
            abyte18[2] = 0;
            abyte18[3] = 9;
            abyte18[4] = 3;
            abyte18[5] = 4;
            abyte18[6] = 6;
            abyte18[7] = 10;
            abyte18[8] = 2;
            abyte18[9] = 8;
            abyte18[10] = 5;
            abyte18[11] = 14;
            abyte18[12] = 12;
            abyte18[13] = 11;
            abyte18[14] = 15;
            abyte18[15] = 1;
            abyte16[1] = abyte18;
            byte abyte19[] = new byte[16];
            abyte19[0] = 13;
            abyte19[1] = 6;
            abyte19[2] = 4;
            abyte19[3] = 9;
            abyte19[4] = 8;
            abyte19[5] = 15;
            abyte19[6] = 3;
            abyte19[7] = 0;
            abyte19[8] = 11;
            abyte19[9] = 1;
            abyte19[10] = 2;
            abyte19[11] = 12;
            abyte19[12] = 5;
            abyte19[13] = 10;
            abyte19[14] = 14;
            abyte19[15] = 7;
            abyte16[2] = abyte19;
            byte abyte20[] = new byte[16];
            abyte20[0] = 1;
            abyte20[1] = 10;
            abyte20[2] = 13;
            abyte20[3] = 0;
            abyte20[4] = 6;
            abyte20[5] = 9;
            abyte20[6] = 8;
            abyte20[7] = 7;
            abyte20[8] = 4;
            abyte20[9] = 15;
            abyte20[10] = 14;
            abyte20[11] = 3;
            abyte20[12] = 11;
            abyte20[13] = 5;
            abyte20[14] = 2;
            abyte20[15] = 12;
            abyte16[3] = abyte20;
            abyte5[2] = abyte16;
            byte abyte21[][] = new byte[4][];
            byte abyte22[] = new byte[16];
            abyte22[0] = 7;
            abyte22[1] = 13;
            abyte22[2] = 14;
            abyte22[3] = 3;
            abyte22[4] = 0;
            abyte22[5] = 6;
            abyte22[6] = 9;
            abyte22[7] = 10;
            abyte22[8] = 1;
            abyte22[9] = 2;
            abyte22[10] = 8;
            abyte22[11] = 5;
            abyte22[12] = 11;
            abyte22[13] = 12;
            abyte22[14] = 4;
            abyte22[15] = 15;
            abyte21[0] = abyte22;
            byte abyte23[] = new byte[16];
            abyte23[0] = 13;
            abyte23[1] = 8;
            abyte23[2] = 11;
            abyte23[3] = 5;
            abyte23[4] = 6;
            abyte23[5] = 15;
            abyte23[6] = 0;
            abyte23[7] = 3;
            abyte23[8] = 4;
            abyte23[9] = 7;
            abyte23[10] = 2;
            abyte23[11] = 12;
            abyte23[12] = 1;
            abyte23[13] = 10;
            abyte23[14] = 14;
            abyte23[15] = 9;
            abyte21[1] = abyte23;
            byte abyte24[] = new byte[16];
            abyte24[0] = 10;
            abyte24[1] = 6;
            abyte24[2] = 9;
            abyte24[3] = 0;
            abyte24[4] = 12;
            abyte24[5] = 11;
            abyte24[6] = 7;
            abyte24[7] = 13;
            abyte24[8] = 15;
            abyte24[9] = 1;
            abyte24[10] = 3;
            abyte24[11] = 14;
            abyte24[12] = 5;
            abyte24[13] = 2;
            abyte24[14] = 8;
            abyte24[15] = 4;
            abyte21[2] = abyte24;
            byte abyte25[] = new byte[16];
            abyte25[0] = 3;
            abyte25[1] = 15;
            abyte25[2] = 0;
            abyte25[3] = 6;
            abyte25[4] = 10;
            abyte25[5] = 1;
            abyte25[6] = 13;
            abyte25[7] = 8;
            abyte25[8] = 9;
            abyte25[9] = 4;
            abyte25[10] = 5;
            abyte25[11] = 11;
            abyte25[12] = 12;
            abyte25[13] = 7;
            abyte25[14] = 2;
            abyte25[15] = 14;
            abyte21[3] = abyte25;
            abyte5[3] = abyte21;
            byte abyte26[][] = new byte[4][];
            byte abyte27[] = new byte[16];
            abyte27[0] = 2;
            abyte27[1] = 12;
            abyte27[2] = 4;
            abyte27[3] = 1;
            abyte27[4] = 7;
            abyte27[5] = 10;
            abyte27[6] = 11;
            abyte27[7] = 6;
            abyte27[8] = 8;
            abyte27[9] = 5;
            abyte27[10] = 3;
            abyte27[11] = 15;
            abyte27[12] = 13;
            abyte27[13] = 0;
            abyte27[14] = 14;
            abyte27[15] = 9;
            abyte26[0] = abyte27;
            byte abyte28[] = new byte[16];
            abyte28[0] = 14;
            abyte28[1] = 11;
            abyte28[2] = 2;
            abyte28[3] = 12;
            abyte28[4] = 4;
            abyte28[5] = 7;
            abyte28[6] = 13;
            abyte28[7] = 1;
            abyte28[8] = 5;
            abyte28[9] = 0;
            abyte28[10] = 15;
            abyte28[11] = 10;
            abyte28[12] = 3;
            abyte28[13] = 9;
            abyte28[14] = 8;
            abyte28[15] = 6;
            abyte26[1] = abyte28;
            byte abyte29[] = new byte[16];
            abyte29[0] = 4;
            abyte29[1] = 2;
            abyte29[2] = 1;
            abyte29[3] = 11;
            abyte29[4] = 10;
            abyte29[5] = 13;
            abyte29[6] = 7;
            abyte29[7] = 8;
            abyte29[8] = 15;
            abyte29[9] = 9;
            abyte29[10] = 12;
            abyte29[11] = 5;
            abyte29[12] = 6;
            abyte29[13] = 3;
            abyte29[14] = 0;
            abyte29[15] = 14;
            abyte26[2] = abyte29;
            byte abyte30[] = new byte[16];
            abyte30[0] = 11;
            abyte30[1] = 8;
            abyte30[2] = 12;
            abyte30[3] = 7;
            abyte30[4] = 1;
            abyte30[5] = 14;
            abyte30[6] = 2;
            abyte30[7] = 13;
            abyte30[8] = 6;
            abyte30[9] = 15;
            abyte30[10] = 0;
            abyte30[11] = 9;
            abyte30[12] = 10;
            abyte30[13] = 4;
            abyte30[14] = 5;
            abyte30[15] = 3;
            abyte26[3] = abyte30;
            abyte5[4] = abyte26;
            byte abyte31[][] = new byte[4][];
            byte abyte32[] = new byte[16];
            abyte32[0] = 12;
            abyte32[1] = 1;
            abyte32[2] = 10;
            abyte32[3] = 15;
            abyte32[4] = 9;
            abyte32[5] = 2;
            abyte32[6] = 6;
            abyte32[7] = 8;
            abyte32[8] = 0;
            abyte32[9] = 13;
            abyte32[10] = 3;
            abyte32[11] = 4;
            abyte32[12] = 14;
            abyte32[13] = 7;
            abyte32[14] = 5;
            abyte32[15] = 11;
            abyte31[0] = abyte32;
            byte abyte33[] = new byte[16];
            abyte33[0] = 10;
            abyte33[1] = 15;
            abyte33[2] = 4;
            abyte33[3] = 2;
            abyte33[4] = 7;
            abyte33[5] = 12;
            abyte33[6] = 9;
            abyte33[7] = 5;
            abyte33[8] = 6;
            abyte33[9] = 1;
            abyte33[10] = 13;
            abyte33[11] = 14;
            abyte33[12] = 0;
            abyte33[13] = 11;
            abyte33[14] = 3;
            abyte33[15] = 8;
            abyte31[1] = abyte33;
            byte abyte34[] = new byte[16];
            abyte34[0] = 9;
            abyte34[1] = 14;
            abyte34[2] = 15;
            abyte34[3] = 5;
            abyte34[4] = 2;
            abyte34[5] = 8;
            abyte34[6] = 12;
            abyte34[7] = 3;
            abyte34[8] = 7;
            abyte34[9] = 0;
            abyte34[10] = 4;
            abyte34[11] = 10;
            abyte34[12] = 1;
            abyte34[13] = 13;
            abyte34[14] = 11;
            abyte34[15] = 6;
            abyte31[2] = abyte34;
            byte abyte35[] = new byte[16];
            abyte35[0] = 4;
            abyte35[1] = 3;
            abyte35[2] = 2;
            abyte35[3] = 12;
            abyte35[4] = 9;
            abyte35[5] = 5;
            abyte35[6] = 15;
            abyte35[7] = 10;
            abyte35[8] = 11;
            abyte35[9] = 14;
            abyte35[10] = 1;
            abyte35[11] = 7;
            abyte35[12] = 6;
            abyte35[13] = 0;
            abyte35[14] = 8;
            abyte35[15] = 13;
            abyte31[3] = abyte35;
            abyte5[5] = abyte31;
            byte abyte36[][] = new byte[4][];
            byte abyte37[] = new byte[16];
            abyte37[0] = 4;
            abyte37[1] = 11;
            abyte37[2] = 2;
            abyte37[3] = 14;
            abyte37[4] = 15;
            abyte37[5] = 0;
            abyte37[6] = 8;
            abyte37[7] = 13;
            abyte37[8] = 3;
            abyte37[9] = 12;
            abyte37[10] = 9;
            abyte37[11] = 7;
            abyte37[12] = 5;
            abyte37[13] = 10;
            abyte37[14] = 6;
            abyte37[15] = 1;
            abyte36[0] = abyte37;
            byte abyte38[] = new byte[16];
            abyte38[0] = 13;
            abyte38[1] = 0;
            abyte38[2] = 11;
            abyte38[3] = 7;
            abyte38[4] = 4;
            abyte38[5] = 9;
            abyte38[6] = 1;
            abyte38[7] = 10;
            abyte38[8] = 14;
            abyte38[9] = 3;
            abyte38[10] = 5;
            abyte38[11] = 12;
            abyte38[12] = 2;
            abyte38[13] = 15;
            abyte38[14] = 8;
            abyte38[15] = 6;
            abyte36[1] = abyte38;
            byte abyte39[] = new byte[16];
            abyte39[0] = 1;
            abyte39[1] = 4;
            abyte39[2] = 11;
            abyte39[3] = 13;
            abyte39[4] = 12;
            abyte39[5] = 3;
            abyte39[6] = 7;
            abyte39[7] = 14;
            abyte39[8] = 10;
            abyte39[9] = 15;
            abyte39[10] = 6;
            abyte39[11] = 8;
            abyte39[12] = 0;
            abyte39[13] = 5;
            abyte39[14] = 9;
            abyte39[15] = 2;
            abyte36[2] = abyte39;
            byte abyte40[] = new byte[16];
            abyte40[0] = 6;
            abyte40[1] = 11;
            abyte40[2] = 13;
            abyte40[3] = 8;
            abyte40[4] = 1;
            abyte40[5] = 4;
            abyte40[6] = 10;
            abyte40[7] = 7;
            abyte40[8] = 9;
            abyte40[9] = 5;
            abyte40[10] = 0;
            abyte40[11] = 15;
            abyte40[12] = 14;
            abyte40[13] = 2;
            abyte40[14] = 3;
            abyte40[15] = 12;
            abyte36[3] = abyte40;
            abyte5[6] = abyte36;
            byte abyte41[][] = new byte[4][];
            byte abyte42[] = new byte[16];
            abyte42[0] = 13;
            abyte42[1] = 2;
            abyte42[2] = 8;
            abyte42[3] = 4;
            abyte42[4] = 6;
            abyte42[5] = 15;
            abyte42[6] = 11;
            abyte42[7] = 1;
            abyte42[8] = 10;
            abyte42[9] = 9;
            abyte42[10] = 3;
            abyte42[11] = 14;
            abyte42[12] = 5;
            abyte42[13] = 0;
            abyte42[14] = 12;
            abyte42[15] = 7;
            abyte41[0] = abyte42;
            byte abyte43[] = new byte[16];
            abyte43[0] = 1;
            abyte43[1] = 15;
            abyte43[2] = 13;
            abyte43[3] = 8;
            abyte43[4] = 10;
            abyte43[5] = 3;
            abyte43[6] = 7;
            abyte43[7] = 4;
            abyte43[8] = 12;
            abyte43[9] = 5;
            abyte43[10] = 6;
            abyte43[11] = 11;
            abyte43[12] = 0;
            abyte43[13] = 14;
            abyte43[14] = 9;
            abyte43[15] = 2;
            abyte41[1] = abyte43;
            byte abyte44[] = new byte[16];
            abyte44[0] = 7;
            abyte44[1] = 11;
            abyte44[2] = 4;
            abyte44[3] = 1;
            abyte44[4] = 9;
            abyte44[5] = 12;
            abyte44[6] = 14;
            abyte44[7] = 2;
            abyte44[8] = 0;
            abyte44[9] = 6;
            abyte44[10] = 10;
            abyte44[11] = 13;
            abyte44[12] = 15;
            abyte44[13] = 3;
            abyte44[14] = 5;
            abyte44[15] = 8;
            abyte41[2] = abyte44;
            byte abyte45[] = new byte[16];
            abyte45[0] = 2;
            abyte45[1] = 1;
            abyte45[2] = 14;
            abyte45[3] = 7;
            abyte45[4] = 4;
            abyte45[5] = 10;
            abyte45[6] = 8;
            abyte45[7] = 13;
            abyte45[8] = 15;
            abyte45[9] = 12;
            abyte45[10] = 9;
            abyte45[11] = 0;
            abyte45[12] = 3;
            abyte45[13] = 5;
            abyte45[14] = 6;
            abyte45[15] = 11;
            abyte41[3] = abyte45;
            abyte5[7] = abyte41;
            int l = mybytearray3.b;
            int i1 = mybytearray6.b;
            for(byte byte0 = 0; byte0 < 8;)
            {
                byte byte1 = (byte)((mybytearray3.a[0 + mybytearray3.b] << 1) + mybytearray3.a[5 + mybytearray3.b]);
                byte byte2 = (byte)((mybytearray3.a[1 + mybytearray3.b] << 3) + (mybytearray3.a[2 + mybytearray3.b] << 2) + (mybytearray3.a[3 + mybytearray3.b] << 1) + mybytearray3.a[4 + mybytearray3.b]);
                b(mybytearray6, new MyByteArray(abyte5[byte0][byte1][byte2]), 4);
                byte0++;
                mybytearray3.b = 6 + mybytearray3.b;
                mybytearray6.b = 4 + mybytearray6.b;
            }

            mybytearray3.b = l;
            mybytearray6.b = i1;
            a(mybytearray6, mybytearray6, abyte4, 32, mybytearray7);
            a(mybytearray6, mybytearray5, 32);
            d(mybytearray5, mybytearray4, 32);
        }

        a(mybytearray2, mybytearray2, abyte1, 64, mybytearray7);
        a(mybytearray, 8);
        for(int j = 0; j < 64; j++)
        {
            byte abyte2[] = mybytearray.a;
            int k = mybytearray.b + (j >> 3);
            abyte2[k] = (byte)(abyte2[k] | mybytearray2.a[j + mybytearray2.b] << (j & 7));
        }

    }

    private static void b(MyByteArray mybytearray, MyByteArray mybytearray1, int i)
    {
        for(int j = 0; j < i; j++)
            mybytearray.a[j + mybytearray.b] = (byte)(1 & mybytearray1.a[(j >> 3) + mybytearray1.b] >> (j & 7));

    }

    private static void c(MyByteArray mybytearray, MyByteArray mybytearray1, int i)
    {
        int j = 0;
        d(mybytearray1, mybytearray, i);
        for(int k = j; k < 28 - i; k++)
            mybytearray.a[k + mybytearray.b] = mybytearray.a[i + (k + mybytearray.b)];

        for(; j < i; j++)
            mybytearray.a[(28 + (j + mybytearray.b)) - i] = mybytearray1.a[j + mybytearray1.b];

    }

    private static void d(MyByteArray mybytearray, MyByteArray mybytearray1, int i)
    {
        for(int j = 0; j < i; j++)
            mybytearray.a[j + mybytearray.b] = mybytearray1.a[j + mybytearray1.b];

    }
}