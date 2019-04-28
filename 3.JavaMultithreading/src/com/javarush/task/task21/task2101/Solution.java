package com.javarush.task.task21.task2101;

import java.util.Arrays;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] result =new byte[4];
        result[0] = (byte)(ip[0] & mask[0]);
        result[1] = (byte)(ip[1] & mask[1]);
        result[2] = (byte)(ip[2] & mask[2]);
        result[3] = (byte)(ip[3] & mask[3]);
        return result;
    }

    public static void print(byte[] bytes) {
        StringBuilder strB = new StringBuilder();
        boolean initial = true;
        for (byte b : bytes) {
            if (!initial) {
                strB.append(" ");
            } else initial = false;
            strB.append(getBitStr(b));
        }
        System.out.println(strB.toString());
    }

    private static String getBitStr(byte b) {
        StringBuilder strB = new StringBuilder();

        for (int i = 7; i >= 0; i--) {
            if ( ((1 << i) & b ) != 0) {
                strB.append("1");
            } else {
                strB.append("0");
            }
        }
        return strB.toString();
    }
}

