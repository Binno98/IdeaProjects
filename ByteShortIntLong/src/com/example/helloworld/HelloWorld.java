package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        int myValue=10000;

        int myMinValue=Integer.MIN_VALUE;
        int myMaxValue=Integer.MAX_VALUE;
        System.out.println("Integer minimum value="+myMinValue);
        System.out.println("Integer maximum value="+myMaxValue);
        System.out.println("Integer value="+myValue);


        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte max value="+myMaxByteValue);
        System.out.println("Byte min value="+myMinByteValue);


        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short max value="+myMaxShortValue);
        System.out.println("Short min value="+myMinShortValue);

        long myLongValue=100L;
        System.out.println("Integer long value="+myLongValue);

        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long max value="+myMaxLongValue);
        System.out.println("Long min value="+myMinLongValue);

        byte myNewByteValue=(byte)(myMinByteValue/2);
        short myNewShortValue=(short)(myMinShortValue/2);

    }
}
