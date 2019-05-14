package com.iss.training.spring;

import com.iss.training.spring.beans.User;
import com.iss.training.spring.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class DemoApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                DemoConfiguration.class);

        System.out.println("resource class: "+context.getResource("").getClass());

        byte[] b1 = new byte[100];
        InputStream stream = context.getResource("app.properties").getInputStream();
        stream.read(b1);
        System.out.println("app.properties content: \n\t"+new String(b1));
        stream.close();

        byte[] b2 = new byte[100];
        stream = context.getResource("classpath:app.properties").getInputStream();
        stream.read(b2);
        System.out.println("app.properties content: \n\t"+new String(b2));
        stream.close();

        try {
            byte[] b3 = new byte[100];
            stream = context.getResource("file:///C:/windows-version.txt").getInputStream();
            stream.read(b3);
            System.out.println("C:/windows-version.txt content: \n\t" + new String(b3));
            stream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        byte[] b4 = new byte[1000];
        stream = context.getResource("https://www.google.com/").getInputStream();
        System.out.println("https://www.google.com/ content: \n\t" );
        while (stream.read(b4)!=-1) {
            System.out.println(new String(b4));
        }
        stream.close();
    }
}
