package createobjects;

public class Pen {
    String model;
    String color;
    float tip;
    int charge;
    boolean capped;
    void status() {
        System.out.println("Pen status");
        System.out.println("Model: " + model);
        System.out.println("Tip thickness: " + tip);
        System.out.println("Charge: " + charge + "%");
        System.out.println("A " + this.color + " pen ");
        System.out.println("Is it capped? " + this.capped);
    }

    void scribble()
    {
        if (!this.capped)
            System.out.println("Pen scribble");
        else
            System.out.println("ERROR! Your pen is capped");
    }

    void putcap()
    {
        this.capped = true;
    }

    void uncap()
    {
        this.capped = false;
    }

}