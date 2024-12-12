                                    package createobjects;

public class Ambience {
    String name;
    int lightIntensity;
    int temperatureindegrees;
    String weatherCondition;
    Boolean isItRaining;
    String timeOfDay;
    Boolean amIHere;

    void whereIamNow(){
        if (this.amIHere == true) {
            System.out.println("I'm now on the " + this.name);
            System.out.println("At " + this.timeOfDay);
        }
    }

    Boolean itstimetogohome() {
        int iwillreturn = 0;
        if (this.timeOfDay.equals("night") || this.timeOfDay.equals("dawn")) {
            System.out.println("i`m going to my House, because it's " + timeOfDay);
            iwillreturn = 1;
        }
        if (this.isItRaining == true) {
            System.out.println("It's raining");
            iwillreturn = 1;
        }
        if (this.temperatureindegrees > 25) {
            System.out.println("It's too hot");
            iwillreturn = 1;
        }
        if (this.weatherCondition.equals("sunny") || this.weatherCondition.equals("cloudy")) {
            System.out.println("It's weather on the " + this.name + " is unfarovable");
            iwillreturn = 1;
        }
        if (iwillreturn == 1) {
            return true;
        }
        return false;
    }

    void goingHome(Boolean isItTime){
        if (isItTime == true) {
            this.amIHere = false;
            System.out.println("I'm returning home.");
        }
        else {
            this.amIHere = true;
            System.out.println("I'm good");
        }
    }

    void ArrivedHome(){
        if (this.name.equals("Bedroom")) {
            this.amIHere = true;
            System.out.println("I'm at home");
        }
        else {
            this.amIHere = false;
            System.out.println("I'm not home yet");
        }
    }

    boolean isIdealReadingSpot(){
        if (this.temperatureindegrees > 25)
            return false;

        else if (this.isItRaining == true)
            return false;

        else if (this.lightIntensity < 5)
            return false;
        else
            System.out.println("It's a ideal spot to read");
        return true;
    }

}