package com.forichok.tess4jtest;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {

        Tesseract instance = new Tesseract();
        instance.setLanguage("eng");
        File imageFile = new File("/Users/n.udalov/Projects/tess4JTest/images/img_en.png");
        System.out.println("====0\n\n\n\n\n\n\n");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\n\n\n\n\n\n\n");

        instance.setLanguage("rus");
        imageFile = new File("/Users/n.udalov/Projects/tess4JTest/images/img_rus.png");
        System.out.println("\n\n\n\n\n\n\n");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println( "Hello World!" );
    }
}
