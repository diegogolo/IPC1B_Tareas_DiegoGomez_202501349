package org.example.model;

public class Conversion {
    Temperatura temps = new Temperatura();

    public double farenheit(double f){
        f=(temps.getCelsius()*9/5)+32;
        return f;
    }
    public double kelvin(double k){
         k=temps.getCelsius()+273.15;
        return k;
    }
}
