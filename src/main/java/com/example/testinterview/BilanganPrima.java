package com.example.testinterview;

public class BilanganPrima {
    public static void main(String[] args) {
        cari();
    }
    public static void cari(){
        for (int i = 1; i <= 17; i++) {
            if(i%2!=0 && i<=3){
                System.out.println(i);

            }
            if(i>3 && i%3!=0 && i%2!=0){
                System.out.println(i);
            }
        }
    }
}
