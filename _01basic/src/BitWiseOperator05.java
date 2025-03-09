public class BitWiseOperator05 {
    public static void main(String[] args) {
        //computer - 0101
        //int a = 5;
        //char c ='A';
        //System.out.println(Integer.toBinaryString(c));
        //System.out.println(Integer.toBinaryString(a));

        // total number of bits in computer system - 32 bits
        //operands - byte short int long
        //Operator  And - &, Or - |, XOR ^, NOT - ~, Left shift - <<, Right shift - >>, unsigned right shift - >>>

        // AND & if both bits 1 then final bits 1 otherwise all 0
        int a = 5 & 4;
        //System.out.println(Integer.toBinaryString(5));
        //System.out.println(Integer.toBinaryString(4));
        //System.out.println(a); // 4

        // OR | if any bits 1 then final bits 1 otherwise all 0
        int  o = 5|4;
        //System.out.println(Integer.toBinaryString(5));
        //System.out.println(Integer.toBinaryString(4));
        //System.out.println(o);

        // XOR ^ if both bits different then final bits 1 and if both are same then 0
        int x = 5^7;
        //System.out.println(Integer.toBinaryString(5));
        //System.out.println(Integer.toBinaryString(7));
        //System.out.println(x);

        // NOT ~ it toggles all bits in the value, transforming 0 bits to 1 and 1 bits to 0
        int n = 5;
       // System.out.println(Integer.toBinaryString(n));
        int c =~n;
        //System.out.println(c);
        //System.out.println(Integer.toBinaryString(c));

        // Left shift << ,Right shift - >>,unsigned right shift - >>>
        int ls = -5; // positive case 000000, negative case 111111,
        System.out.println(Integer.toBinaryString(ls));
        //int ls1 = ls << 2;
        //int ls1 = ls >> 2;
        int ls1 = ls >>> 2; // unsigned shift left 00 after shifting
        System.out.println(ls1);
        System.out.println(Integer.toBinaryString(ls1));


    }

}
