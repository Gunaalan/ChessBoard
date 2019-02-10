package com.company.guna;

import com.google.gson.Gson;
import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by guna on 06/04/18.
 */
public class Main {

    @Data
    public static class  Request {
        String corporateCode = "ACCNT1";
        String partnerCode = "PARTNER_1";
        String personId = "PERSON1";
        String accountId = "ACCNT1";
        String logoURL = "logoXX";
        String webHookURL = "hhXX";
        String name = "hola";
        String email = "gar@gmail.com";
        String mobile = "9487700480";
        boolean mobileApp = true;


        public Request() {
        }

    }

    //private static final Scanner scanner = new Scanner(System.in);
    public static String key = "A1HS8CUR1TY@9812";
    public static void main(String[] args) throws IOException {

        Request request = new Request();
        Gson gson = new Gson();
        String json = gson.toJson(request);
        System.out.println("Json string to encrypt is \n" + json);
        String d = "";
        try {
            System.out.println("The D string is \n" + encryptForMarsh(json));
            System.out.println("The H string is \n" + generateHash(json));
            System.out.println("lets decrypt..");
            System.out.println("after decrypting \n" + decryptForMarsh("n7dLY0qI9pe4OzkAOAcV+bPbJljhnJG5DoyauoisL//M07SMObKezhR/xxJbBIotOuAcnaCwuPtffXjknTPeyo1/xDkvKPxsLhrWJvHSiDe+dTcAunJhYoIxYSiyqDE2SvxwRbAqrmi1KIerA2mDQROPJIqg0lhG5RgiRKYUjCWDK4nFEfp2oHMEodA1WROTZJ9MhujnaRtk0VFqMMU40aOEDhusGu6xQQHAcO6jDC5e6Cc8zpe0Yzb4AHSqCDBQBI6xoHeusgjPa+Du29LJ9KxBeH6h52OppGVaeJuPEC4Yv5d2Dg8qwSjreWJtCkdd"));
        }
        catch (Exception e) {
            System.out.println("Exception is "  +  e);
        }

    }

    public static String encryptForMarsh(String input) throws Exception {
        byte[] plainTextByteArray = input.getBytes();
        byte[] sessionKey = key.getBytes();
        byte[] iv = sessionKey;
        SecretKeySpec secretSpec = new SecretKeySpec(sessionKey, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/ISO10126Padding");
        byte[] ivBytes = DatatypeConverter.parseBase64Binary(key);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(sessionKey, "AES"), new IvParameterSpec(iv));
        byte[] ciphertext = cipher.doFinal(plainTextByteArray);
        byte[] encodedByte = Base64.getEncoder().encode(ciphertext);
        String ecodedString = new String(encodedByte);
        return ecodedString;
    }

    public static String decryptForMarsh(String toDecrypt) throws Exception {
        toDecrypt = toDecrypt.replace(' ','+');
        byte[] sessionKey = key.getBytes();
        byte[] iv = sessionKey;
        Cipher cipher = Cipher.getInstance("AES/CBC/ISO10126Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(sessionKey, "AES"), new IvParameterSpec(iv));
        byte[] decoded = Base64.getDecoder().decode(toDecrypt);
        byte[] decodedByte = cipher.doFinal(decoded);
        return new String(decodedByte);
    }

    public static String generateHash(String a) {
        String h = DigestUtils.sha256Hex(a);
        return h;
    }
}



