import java.util.ArrayList;
import java.util.List;

public class CountryService {
    private List<String> countries;

    public CountryService() {
        countries = new ArrayList<>();
        countries.add("Україна");
        countries.add("Канада");
        countries.add("Німеччина");
        countries.add("Японія");
    }


    public String findCountry(String countryName) throws CountryNotFoundException {
        if (!countries.contains(countryName)) {
            throw new CountryNotFoundException("Країна '" + countryName + "' не знайдена!");
        }
        return "Країна '" + countryName + "' знайдена у списку.";
    }
}
