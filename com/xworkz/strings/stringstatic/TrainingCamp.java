package com.xworkz.com.xworkz.strings;

public class TrainingCamp {
    public static void main(String[] args) {

        String unit = "Air Force";
        String base = "Bangalore";

        String join1 = String.join("", unit, base);
        System.out.println(join1);

        String join2 = String.join("-", "Air Force", "Bangalore");
        System.out.println(join2);

        String join3 = String.join(" ",  "Bangalore","Air Force");
        System.out.println(join3);

        String value1 = String.valueOf(unit);
        System.out.println(value1);

        String value2 = String.valueOf(base);
        System.out.println(value2);

        String value3 = String.valueOf(true);
        System.out.println(value3);

        String value4 = String.valueOf(45.6f);
        System.out.println(value4);

        String copy1 = String.copyValueOf(unit.toCharArray());
        System.out.println(copy1);

        String copy2 = String.copyValueOf(base.toCharArray());
        System.out.println(copy2);

        String finalJoin = String.join(" is operating from ", unit, base);
        System.out.println(finalJoin);
    }
}