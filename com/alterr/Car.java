package com.alterr;

public class Car {
    public double firstkoord;
    public double rashod;
    public double bakSize;
    public double gallonsInBak;
    public double nextkoord;

    public Car(double firstkoord, double rashod, double bakSize, double gallonsInBak){
        this.firstkoord = firstkoord;
        this.rashod = rashod;
        this.bakSize = bakSize;
        this.gallonsInBak = gallonsInBak;
    }

    public double MillDrive(double secondkoord){
        this.nextkoord = secondkoord;
        return Math.abs(secondkoord - firstkoord);
    }


    public double AddGallons(double m){
        double sumGallons = m *rashod;
        System.out.println(sumGallons);
        if(sumGallons > bakSize){
            System.out.println("не доедем");
            return 0;
        }
        else if(sumGallons - gallonsInBak<0){
            System.out.println("слили лишние " + Math.abs(sumGallons - gallonsInBak) + " галлонов.");
            this.gallonsInBak = sumGallons;
            return sumGallons;
        }
        else {
            this.gallonsInBak = sumGallons - gallonsInBak;
            return sumGallons - gallonsInBak;
        }
    }

    public double getKoordFromFirstkoord(double koord){
            return firstkoord+koord;
    }

    public double getKoordFromLevelGas(double levelgas){

        double potracheno = gallonsInBak - levelgas;
        double proehali = potracheno/rashod;
        if(nextkoord>firstkoord)
            return firstkoord+proehali;
        else
            return firstkoord-proehali;
    }

}

