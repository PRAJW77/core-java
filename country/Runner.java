package com.xworkz.country;

public class Runner {
    public static void main(String[] args) {

            Collector collector1 = new Collector(" Venkatesh T ",2017);
            Collector collector2 = new Collector(" Gangadharaswamy G M",201);
            collector1.collectorInfo();
            collector2.collectorInfo();
            System.out.println();

            District district1 = new District("Chitradurga",collector1);
            District district2 = new District("Davanagere",collector2);
            district1.DistrictInfo();
            district2.DistrictInfo();
            System.out.println();






        }
    }
