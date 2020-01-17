package com.cursmysql;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Google extends Thread{
    List<String> siteContent= new ArrayList<>();




    @Override
    public void run() {
        try {
            URL hotnews = new URL("https://www.hotnews.ro");
            URLConnection con = hotnews.openConnection();
            InputStream inputStream = con.getInputStream();
            Scanner scannerHotnews = new Scanner(inputStream);
            System.out.println(scannerHotnews.nextLine());
            while (scannerHotnews.hasNext()) {
                siteContent.add(scannerHotnews.nextLine());
            }
        }catch (Exception e){
            System.out.println("nu poate fi accesat");
        }
    }
}
