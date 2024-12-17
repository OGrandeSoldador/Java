package createobjects;

public class Ambience {
    private String name;
    private int lightIntensity;
    private int temperatureindegrees;
    private String weatherCondition;
    private Boolean isItRaining;
    private String timeOfDay;
    private Boolean amIHere;

    public Ambience(String name, int lightIntensity, int temperatureindegrees, String timeOfDay, Boolean amIHere) {
        setName(name);
        setLightIntensity(lightIntensity);
        setTemperatureindegrees(temperatureindegrees);
        setTimeOfDay(timeOfDay);
        setAmIHere(amIHere);
    }

    public void setItRaining(Boolean itRaining) {
        isItRaining = itRaining;
    }
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    public void setTemperatureindegrees(int temperatureindegrees) {
        this.temperatureindegrees = temperatureindegrees;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLightIntensity(int lightIntensity) {
        this.lightIntensity = lightIntensity;
    }
    public void setAmIHere(Boolean amIHere) {
        this.amIHere = amIHere;
    }

    public Boolean getAmIHere() {
        return amIHere;
    }
    public Boolean getItRaining() {
        return isItRaining;
    }
    public int getLightIntensity() {
        return lightIntensity;
    }
    public String getName() {
        return name;
    }
    public int getTemperatureindegrees() {
        return temperatureindegrees;
    }
    public String getTimeOfDay() {
        return timeOfDay;
    }
    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void whereIamNow(){
        if (this.getAmIHere() == true) {
            System.out.println("I'm now on the " + this.getName());
            System.out.println("At " + this.getTimeOfDay());
        }
        else{
            System.out.println("I'm not now on the " + this.getName());
        }
    }

    public Boolean itstimetogohome() {
        int iwillreturn = 0;
        if (this.getTimeOfDay().equals("night") || this.getTimeOfDay().equals("dawn")) {
            System.out.println("i`m going to my House, because it's " + timeOfDay);
            iwillreturn = 1;
        }
        if (this.getItRaining() == true) {
            System.out.println("It's raining");
            iwillreturn = 1;
        }
        if (this.getTemperatureindegrees() > 25) {
            System.out.println("It's too hot");
            iwillreturn = 1;
        }
        if (this.getWeatherCondition().equals("sunny") || this.getWeatherCondition().equals("cloudy")) {
            System.out.println("It's weather on the " + this.name + " is unfarovable");
            iwillreturn = 1;
        }
        if (iwillreturn == 1) {
            return true;
        }
        return false;
    }

    public void goingHome(Boolean isItTime){
        if (isItTime == true) {
            setAmIHere(false);
            System.out.println("I'm returning home.");
        }
        else {
            setAmIHere(true);
            System.out.println("I'm good");
        }
    }

    public void ArrivedHome(){
        if (this.getName().equals("Bedroom")) {
            setAmIHere(true);
            System.out.println("I'm at home");
        }
        else {
            setAmIHere(false);
            System.out.println("I'm not home yet");
        }
    }

    public boolean isIdealReadingSpot(){
        if (this.getTemperatureindegrees() > 25)
            return false;

        else if (this.getItRaining())
            return false;

        else if (this.getLightIntensity() < 5)
            return false;
        else
            System.out.println("It's a ideal spot to read");
        return true;
    }

}