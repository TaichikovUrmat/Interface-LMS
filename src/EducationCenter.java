import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate FoundationYear;

    public EducationCenter() {

    }

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        FoundationYear = foundationYear;
    }
}
