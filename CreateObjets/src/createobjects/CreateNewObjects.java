package createobjects;

public class CreateNewObjects {
    public static void main(String[] args) {
        Ambience local1 = new Ambience("Bedroom", 8, 24, "any Time", false );
        Ambience local2 = new Ambience("Yard", 10, 27, "afternoon", true );

        local1.setWeatherCondition("Sunny");
        local1.setItRaining(false);

        local2.setWeatherCondition("Sunny");
        local2.setItRaining(true);

        local2.whereIamNow();
        local2.goingHome(local2.itstimetogohome());
        local1.ArrivedHome();
        local2.whereIamNow();
        local1.whereIamNow();

        Reading book1 = new Reading("Jurassic Park", 522);

        book1.Read(local1.isIdealReadingSpot(),10,1);

    }
}