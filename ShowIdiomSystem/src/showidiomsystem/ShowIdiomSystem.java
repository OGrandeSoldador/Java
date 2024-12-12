package showidiomsystem;

public class ShowIdiomSystem {
    public static void main(String[] args) {
        String currentlanguage = (System.getProperty("user.language"));
        String country = System.getProperty("user.country");

        if (currentlanguage.equals("pt")) {currentlanguage = "Portuguese";}
        System.out.println("Current Language: " + currentlanguage);

        if (country.equals("BR")) {country = "Brazil";}
        System.out.println("Country: " + country);
    }
}