/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import javax.swing.text.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import us.codecraft.xsoup.Xsoup;

        

        
        
/**
 *
 * @author Ivan
 */
public class Alati {
    
    public static String getOib(){
         try {
            //https://stackoverflow.com/questions/8616781/how-to-get-a-web-pages-source-code-from-java
             URI uri = new URI("http://oib.itcentrala.com/oib-generator/");
             StringBuilder sb;
             try (BufferedReader in = new BufferedReader(
                     new InputStreamReader(
                             uri.toURL().openStream()))) {
                 String inputLine;
                 sb = new StringBuilder();
                 while ((inputLine = in.readLine()) != null) {
                     sb.append(inputLine);
                 }}
            //   /html/body/div[1]/div[1]/text()
             Document d=(Document) Jsoup.parse(sb.toString());
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate((Element) d).get();

            //System.out.println(sb.toString());
        } catch (Exception e) {
        }

        return "";
    }
    
}