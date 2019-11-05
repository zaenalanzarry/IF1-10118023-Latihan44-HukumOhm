/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan44;

/**
 *
 * @author Zaenal PC
 */
public final class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial ");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");            
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
 
        System.out.println("\nKuat Arus : " + kuatArus + " ampere");
        System.out.println("Hambatan : " +hambatan + " ohm" );
        System.out.println("Hasil Tegangan : " + hitungTegangan() + " volt");
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
       
}
