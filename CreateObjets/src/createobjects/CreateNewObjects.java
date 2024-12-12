package createobjects;

public class CreateNewObjects {
    public static void main(String[] args) {

        Pen P1 = new Pen();
        P1.model = "Bic 2.0";
        P1.color = "Black";
        P1.tip = 0.5f;
        P1.charge = 90;
        P1.uncap();
        P1.putcap();
        P1.status();
        P1.scribble();

        Reading Book = new Reading();
        Book.bookTitle = "Jurassic Park";
        Book.totalPages = 300;
        Book.isOpen = false;


        Ambience House = new Ambience();
        House.name = "Bedroom";
        House.lightIntensity = 8;
        House.weatherCondition = "favorable";
        House.temperatureindegrees = 22;
        House.isItRaining = false;
        House.timeOfDay = "Any time";
        House.amIHere = true;
        House.whereIamNow();
        House.goingHome(House.itstimetogohome());
        House.ArrivedHome();

        Ambience Street = new Ambience();
        Street.name = "Street 3";
        Street.lightIntensity = 2;
        Street.weatherCondition = "cloudy";
        Street.temperatureindegrees = 27;
        Street.isItRaining = true;
        Street.timeOfDay = "night";
        Street.amIHere = true;
        Street.whereIamNow();
        Street.goingHome(Street.itstimetogohome());
        Street.ArrivedHome();
        House.ArrivedHome();

        if(House.isIdealReadingSpot() == true)
        {
            Book.openBook();
            Book.readBook();
            Book.changecurrentPage(1);
            Book.nextPage();
            Book.readBook();
            Book.closeBook();
        }



    }
}