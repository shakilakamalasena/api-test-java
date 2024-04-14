import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    String region;
    int population;
    List<String> capital;

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "region='" + region + '\'' +
                ", population=" + population +
                ", capital=" + capital +
                '}';
    }
}
