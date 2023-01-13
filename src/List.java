public class List {
    private Holidays[] arr = new Holidays[] {
            new Holidays("01/01/2023", "Confraternização mundial"),
            new Holidays("21/02/2023", "Carnaval"),
            new Holidays("17/04/2023", "Páscoa"),
            new Holidays("21/04/2023", "Tiradentes"),
            new Holidays("01/05/2023", "Dia do Trabalho"),
            new Holidays("08/06/2023", "Corpus Christi"),
            new Holidays("07/09/2023", "Independência do Brasil"),
            new Holidays("12/10/2023", "Nossa Senhora Aparecida"),
            new Holidays("02/11/2023", "Finados"),
            new Holidays("15/11/2023", "Proclamação da República"),
            new Holidays("25/12/2023", "Natal"),
    };

    public String getHoliday(String date) {
        for (int i = 0; i <= arr.length; i++) {
            if (date.equals(arr[i].date)) {
                return arr[i].description;
            } else {
                return "Não existe feriado com esta data!";
            }
        }
    }

    public void getHolidays() {
        for (Holidays holidays : arr) {
            System.out.println(holidays.date + "=> " + holidays.description);
        }
    }
}
