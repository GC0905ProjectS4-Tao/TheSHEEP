/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author DTT
 */
public class MD5 {

    public static String encrypt(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] output = messageDigest.digest(str.getBytes());
            String outString = Hex.encodeHexString(output);
            return outString;
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return "False, see log";
        }
    }
}
