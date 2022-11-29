package com.suxaslux.JConsoleColor;

public class Print {
    public static void PrintMessage(String message, String color)
    {
        System.out.println(color + message + Color.RESET);
    }
}