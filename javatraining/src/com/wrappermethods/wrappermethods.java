package com.wrappermethods;

public class wrappermethods {

    public static void main(String[] args) {

        // byte → Byte
        byte b = 10;
        Byte byteObj = b;   // autoboxing
        byte b2 = byteObj;  // unboxing
        System.out.println("byte: " + b + " | Byte: " + byteObj + " | Unboxed: " + b2);

        // short → Short
        short s = 20;
        Short shortObj = s;
        short s2 = shortObj;
        System.out.println("short: " + s + " | Short: " + shortObj + " | Unboxed: " + s2);

        // int → Integer
        int i = 30;
        Integer intObj = i;
        int i2 = intObj;
        System.out.println("int: " + i + " | Integer: " + intObj + " | Unboxed: " + i2);

        // long → Long
        long l = 40L;
        Long longObj = l;
        long l2 = longObj;
        System.out.println("long: " + l + " | Long: " + longObj + " | Unboxed: " + l2);

        // float → Float
        float f = 50.5f;
        Float floatObj = f;
        float f2 = floatObj;
        System.out.println("float: " + f + " | Float: " + floatObj + " | Unboxed: " + f2);

        // double → Double
        double d = 60.6;
        Double doubleObj = d;
        double d2 = doubleObj;
        System.out.println("double: " + d + " | Double: " + doubleObj + " | Unboxed: " + d2);

        // char → Character
        char c = 'A';
        Character charObj = c;
        char c2 = charObj;
        System.out.println("char: " + c + " | Character: " + charObj + " | Unboxed: " + c2);

        // boolean → Boolean
        boolean flag = true;
        Boolean boolObj = flag;
        boolean flag2 = boolObj;
        System.out.println("boolean: " + flag + " | Boolean: " + boolObj + " | Unboxed: " + flag2);
    }
}
