package test;

import javax.crypto.Cipher;

public class HelloWorld {
    public static void main(String[] args) throws Throwable {
        System.out.println("Cipher: " + Cipher.getInstance("AES/GCM/NoPadding").getProvider().getName());
    }
}