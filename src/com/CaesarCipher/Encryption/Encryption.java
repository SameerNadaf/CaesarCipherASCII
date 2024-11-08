package com.CaesarCipher.Encryption;

public class Encryption {
    public void encryptionAlgorithm(String message, String key) {
        char[] chars = message.toCharArray();
        char[] outChars = new char[message.length()];

        char[] keyArray = key.toCharArray();
        int keyNumber = 0;

        for (char c : keyArray) {
            int value = HelperClass.getAsciiValue(c);
            keyNumber += value;
        }

        for (int i = 0; i < message.length(); i++) {
            int value = HelperClass.getAsciiValue(chars[i]);
            int mod = ((value + keyNumber - 32) % 95) + 32;
            char ch = HelperClass.getCharacter(mod);
            outChars[i] = ch;
        }

        String cipherText = new String(outChars);

        System.out.println();
        System.out.println("The Encrypted message is : " + cipherText);
    }
}
