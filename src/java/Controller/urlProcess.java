/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DTT
 */
public class urlProcess {
    public static String readUrl(String urlString) {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } catch (Exception ex) {
            return ex.toString();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(urlProcess.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}