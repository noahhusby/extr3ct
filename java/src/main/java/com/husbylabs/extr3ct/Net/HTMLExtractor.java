package com.husbylabs.extr3ct.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTMLExtractor {
    public static String extractTextFromURL(String webURL) throws IOException {
        URL url = new URL(webURL);


        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        String output = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            output = line + "\n" + output;
        }

        return output;
    }

    public static String seperateTextFromURL(String webURL, char s) throws IOException{
        URL url = new URL(webURL);


        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        String output = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            output = line + s + output;
        }

        return output;
    }

}
