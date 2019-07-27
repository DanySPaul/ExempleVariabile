package com.sda11.exemple;

import com.sda11.exemple.Bicicleta;

public class Parc {
    public static void main(String[] args){
        Bicicleta bicicletaluiCristian=new Bicicleta();
        bicicletaluiCristian.marca="Giant";
                bicicletaluiCristian.culoare="albastra";
        bicicletaluiCristian.gear=24;
                bicicletaluiCristian.speed=10;
        System.out.println(bicicletaluiCristian.culoare);
        System.out.println(bicicletaluiCristian.marca);
        System.out.println(bicicletaluiCristian.gear);
        System.out.println(bicicletaluiCristian.speed);

        bicicletaluiCristian.schimbaviteza();
        System.out.println(bicicletaluiCristian.gear);
        bicicletaluiCristian.accelereaza();
        System.out.println(bicicletaluiCristian.speed);






    }
}
