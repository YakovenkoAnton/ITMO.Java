package com.company;

import java.util.Random;

public class Vector {
    int x, y, z;


    public Vector(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double vLength(Vector a){
        return Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
    }

    public int scalMult(Vector a, Vector b){
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }

    public static Vector vectMult(Vector a, Vector b){
        return new Vector(
                a.y*b.z - a.z*b.y,
                a.z*b.x - a.x*b.z,
                a.x*b.y - a.y*b.x
        );
    }

    public double angleVector(Vector a, Vector b){
        return scalMult(a, b)/(vLength(a)*vLength(b));
    }

    public static Vector sumVector(Vector a, Vector b){
        return new Vector(
                a.x+b.x,
                a.y + b.y,
                a.z + b.z
        );
    }

    public static Vector difVector(Vector a, Vector b){
        return new Vector(
                a.x-b.x,
                a.y - b.y,
                a.z - b.z
        );
    }

    public static Vector[] vectorArr(int n){
        Vector[] vArr = new Vector[n];
        Random rnd = new Random();
        for (int i=0; i<n; i++){
            vArr[i]=new Vector(
                    rnd.nextInt(10),
                    rnd.nextInt(10),
                    rnd.nextInt(10)
            );
        }
        return vArr;



    }
}
