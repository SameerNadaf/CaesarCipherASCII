package com.CaesarCipher.Encryption;

public class Encryption {
    public void encryptionAlgorithm(String message, int key) {
        char[] chars = message.toCharArray();
        char[] outChars = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            int value = HelperClass.getAsciiValue(chars[i]);
            int mod = ((value + key - 32) % 95) + 32;
            char ch = HelperClass.getCharacter(mod);
            outChars[i] = ch;
        }

        String cipherText = new String(outChars);

        System.out.println();
        System.out.println("The Encrypted message is : " + cipherText);
    }
}
