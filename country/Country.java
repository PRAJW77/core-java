package com.xworkz.country;

public class Country {
    String name;
    President president;
    State[] state;


    public Country(String name, President president, State[] states) {
        this.name = name;
        this.president = president;
        this.state = states;
    }
    public void countryInfo(){
        System.out.println("Country name:"+this.name);
        president.presidentInfo();

        for (State state1:this.state){
            state1.stateInfo();
            System.out.println();
        }
    }
}
