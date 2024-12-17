package createobjects;

public class Pen {
   private String model;
   public String color;
   private float tip;
   protected int charge;
   private boolean capped;


    public Pen(String model, boolean capped) {
        setModel(model);
        this.color = "red";
        setTip(0.5f);
        this.capped = capped;
        this.putcap();
   }

   public String getModel() {
       return this.model;
   }
   public void setModel(String Model){
       this.model = Model;
   }

   public Float getTip() {
       return this.tip;
   }
   public void setTip(Float tip){
       this.tip = tip;
   }

   public void status() {
        System.out.println("Pen status");
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip thickness: " + this.getTip());
        System.out.println("Charge: " + charge + "%");
        System.out.println("A " + this.color + " pen ");
        System.out.println("Is it capped? " + this.capped);
    }
    protected void scribble() {
        if (!this.capped)
            System.out.println("Pen scribble");
        else
            System.out.println("ERROR! Your pen is capped");
    }

   public void putcap()
    {
        this.capped = true;
    }

   public void uncap()
    {
        this.capped = false;
    }

}