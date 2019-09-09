package com.staccato.cracking;

public class lang {

    public static void main(String[] args) {
        System.out.println(trytest());
    }

    private static int trytest(){
        try {
            System.out.println("accesed try");
            int var = 1;
            return 100/0;
        }catch (Exception e){
            System.out.println("catch");
            return 0;
        }finally{
            System.out.println("finally");
            return 1000;
        }
    }
}
