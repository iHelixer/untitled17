public class Main {
    public static void main(String[] args) {
        CountryService countryService = new CountryService();

        try {

            System.out.println(countryService.findCountry("Україна"));

            System.out.println(countryService.findCountry("Франція"));
        } catch (CountryNotFoundException e) {


            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Пошук завершено.");
        }
    }
}
