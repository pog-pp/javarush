package com.javarush.test.level33.lesson15.big01;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by paul on 2/10/16.
 */
public class Helper
{
    public static String generateRandomString(){
         SecureRandom random = new SecureRandom();
         return new BigInteger(130, random).toString(32);

    }
    public static void printMessage(String message){
        System.out.println(message);
    }
}
