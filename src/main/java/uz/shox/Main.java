package uz.shox;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://kun.uz/news/list");
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host : " + url.getHost());
            System.out.println("Port : " + url.getPort());
            System.out.println("Path : " + url.getPath());
            System.out.println("File : " + url.getFile());
            System.out.println("Query : " + url.getQuery());

            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            FileWriter fileWriter = new FileWriter("D:\\Proyiktlar\\newList.txt");
            while ((reader.readLine() != null)) {
                fileWriter.write(String.valueOf(reader));
            }
            reader.close();
            fileWriter.close();

            System.out.println(reader);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

