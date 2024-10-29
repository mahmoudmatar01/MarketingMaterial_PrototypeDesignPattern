package org.design_patterns;


public class Main {
    public static void main(String[] args) {

        // create a new Flyer object
        Flyer flyer = new Flyer("Flyer-A4","Welcome to prototype design pattern","Green");

        // clone my old flyer object and change some configuration
        Flyer flyer2 = flyer.clone();
        flyer2.setContent("Cloned Flyer");
        flyer2.setColor("White");

        // create a new instance from Poster class
        Poster poster = new Poster("Poster-A3","Welcome to prototype design pattern","Red");

        // clone my old poster object and change some configuration
        Poster poster2 = poster.clone();
        poster2.setColor("Black");

        // display objects configurations
        System.out.println(flyer.toString());
        System.out.println(flyer2.toString());
        System.out.println(poster.toString());
        System.out.println(poster2.toString());

    }
}