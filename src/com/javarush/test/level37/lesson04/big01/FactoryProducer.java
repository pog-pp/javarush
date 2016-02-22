package com.javarush.test.level37.lesson04.big01;

import com.javarush.test.level37.lesson04.big01.female.FemaleFactory;
import com.javarush.test.level37.lesson04.big01.male.MaleFactory;

/**
 * Created by paul on 2/18/16.
 */
public class FactoryProducer
{
    public static enum HumanFactoryType{
    MALE,
        FEMALE
}
    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        switch (humanFactoryType)
        {
            case MALE: return new MaleFactory();
            case FEMALE: return new FemaleFactory();

        }
        return null;
    }
}
