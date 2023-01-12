package com.cydeo.tests.day08_Properties_Configuraiton_Reader;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    public void java_properties_reading_test(){
        //key=value
        //os.name=Windows 11
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));


    }
}
