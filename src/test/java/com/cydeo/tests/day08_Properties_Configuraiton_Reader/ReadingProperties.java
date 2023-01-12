package com.cydeo.tests.day08_Properties_Configuraiton_Reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_test() throws IOException {
        //1- Create the object of Properties
        Properties properties= new Properties();

        //2- We need to open file in java memory: FileInputStream
        FileInputStream file=new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object

        properties.load(file);

        //4-Use properties object to read value

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

    }
}
