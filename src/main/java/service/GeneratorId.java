package service;

import java.util.Random;

public class GeneratorId {
    public static String generate(){
        Random generator = new Random();
        String str="";
        for(int i=0; i<8; i++) {
            str=str+generator.nextInt(9);
        }
        return str;

    }
}
