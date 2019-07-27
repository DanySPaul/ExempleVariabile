package com.sda11.exemple;

public class Bicicleta {
    public int gear;
    public String marca;
    public double speed;
    public String culoare;

    public Bicicleta(int g , String m , float s , String C){
        this.gear=g;
                this.marca=m;
                thi
    }

    public void schimbaviteza(){
        if(gear<24){
            gear++;
        }else{
            gear--;
        }
    }
    public void accelereaza(){
        speed=speed*1.1f;





    }
}

