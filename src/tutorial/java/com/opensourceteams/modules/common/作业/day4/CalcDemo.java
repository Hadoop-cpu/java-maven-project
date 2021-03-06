package com.opensourceteams.modules.common.作业.day4;

/**
 * 开发者:刘文  Email:372065525@qq.com
 * 16/2/27  下午1:57
 * 功能描述:
 */

public class CalcDemo {

    public static void main(String[] args) {
        //位运算符
        int a = -7 ;
        int b = 3 ;

      //  a = -5 ;
       // subRecursionListFiles = 4;

        //1...001   -7   --》 1111 1111 ... 1111 1001
        //...0011   3    -->  0000 0000 ... 0000 0011
        System.out.println("a <<  = " + ( a << 2 ));//-28
        System.out.println("a >>  = " + ( a >> 2 ));//1111 1111 ... 1111 1001   >> 2     1111 1111 ... 1111 1110  取正数   1111 1111 ... 1111 0010
        System.out.println("a >>> = " + ( a >>> 2 )); //1111 1111 ... 1111 1001   >>> 2  0011 1111 ... 1111 1110
        /**
         1111 1111...1111 1001
         0000 0000...0000 0011
         1111 1111...1111 1011
         0000 0000...0000 0101
         */
        System.out.println("a | subRecursionListFiles = " + ( a | b )); //1111 1111 ... 1111 1001 | 0000 0000...0000 0011
        /**
         1111 1111 ... 1111 1001
         0000 0000 ... 0000 0011
         0000 0000 ... 0000 0001
         */
        System.out.println("a & subRecursionListFiles = " + ( a & b));

        /**
         1111 1111 ... 1111 1001
         0000 0000 ... 0000 0011
         1111 1111 ... 1111 1010
         0000 0000 ... 0000 0110
         */
        System.out.println("a ^ subRecursionListFiles = " + ( a ^ b ));

        /**
         1111 1111 ... 1111 1001
         0000 0000 ... 0000 0110
         *
         */
        System.out.println(" ~a = " + ( ~a ));//反码
    }
}
