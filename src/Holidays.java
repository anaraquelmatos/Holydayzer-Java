import javax.lang.model.type.NullType;

public class Holidays {
    protected String date;
    protected String description;

    public void setHoliday(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public Holidays(String date, String description) {
        this.date = date;
        this.description = description;
    }
}