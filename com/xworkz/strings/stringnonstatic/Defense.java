package com.xworkz.com.xworkz.strings.stringnonstatic;

import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Defense {
    public static void main(String[] args) {

        String unit = "Indian Navy";
        String base = "Karwar Base";

        System.out.println(Arrays.toString(unit.toCharArray()));
        System.out.println(Arrays.toString(base.toCharArray()));

        System.out.println(unit);
        System.out.println(base);

        System.out.println(Arrays.toString(unit.getBytes()));
        System.out.println(Arrays.toString(unit.getBytes(StandardCharsets.UTF_8)));

        System.out.println(unit.toLowerCase(Locale.ROOT));
        System.out.println(base.toLowerCase());

        System.out.println(unit.toUpperCase());
        System.out.println(base.toUpperCase());

        System.out.println(unit.charAt(3));

        System.out.println(unit.codePointAt(2));

        System.out.println(unit.codePointCount(0, unit.length()));

        System.out.println(unit.compareTo(base));

        System.out.println(unit.concat(" Operations"));

        System.out.println(unit.hashCode());

        System.out.println(unit.endsWith("y"));

        System.out.println(base.lastIndexOf("a"));

        System.out.println(unit.replace("Navy", "Air Force"));

        String temp = "  Indian Navy  ";
        System.out.println(temp.trim());

    }
}