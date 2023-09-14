package com.sudarshan;

import com.sudarshan.services.TextMessageServices;

public class Main {
    public static void main(String[] args) {
        TextMessageServices TextMessageServices = new TextMessageServices();
        TextMessageServices.sendMessage("Hello Student!");
    }
}