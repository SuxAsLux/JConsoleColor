package com.suxaslux;

public class JConsoleColor {
    public static void Print(String message, String color)
    {
        System.out.println(color + message + Color.RESET);
    }
}