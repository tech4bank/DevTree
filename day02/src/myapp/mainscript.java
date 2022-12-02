package myapp;

import java.util.Date;

import myapp.getsetcar;

public class mainscript {
    public static void main (String[] args) {

        getsetcar mycar = new getsetcar();
        getsetcar yourcar = new getsetcar();
        Date date = new Date();
        

        mycar.setColour("red");
        mycar.setMake ("honda");
        mycar.setRegister ("S1234Z")
        
        mycar.horn();
        System.out.printf("colour: %s, make: %s ", mycar.getColour(), mycar.getMake());

        mycar.accele();
        mycar.accele();
        mycar.accele();

        System.out.printf("acceleration: %d", mycar.getAccele());

        // code missing relook

    // cast into a getsetcar type
    if (yourcar instanceof getsetcar) {
        getsetcar turbo = (getsetcar)yourcar;
        turboset

    }

}
