package com.CaesarCipher.Decryption;

import com.CaesarCipher.Encryption.HelperClass;

public class Decryption {
    public void decryptionAlgorithm(String cipherText, String key) {
        char[] chars = cipherText.toCharArray();
        char[] outChars = new char[cipherText.length()];

        char[] keyArray = key.toCharArray();
        int keyNumber = 0;

        for (char c : keyArray) {
            int value = HelperClass.getAsciiValue(c);
            keyNumber += value;
        }

        keyNumber = keyNumber % 95;

        for (int i = 0; i < cipherText.length(); i++) {
            int value = HelperClass.getAsciiValue(chars[i]);
            int mod = 0;
            if (value < 32 || (value-keyNumber < 32)) {
                mod = ((value - keyNumber - 32 + 95) % 95) + 32;
            }
            else {
                mod = ((value - keyNumber - 32) % 95) + 32;
            }

            char ch = HelperClass.getCharacter(mod);
            outChars[i] = ch;
        }

        String plainText = new String(outChars);

        System.out.println();
        System.out.println("The Decrypted message is : " + plainText);
    }
}
