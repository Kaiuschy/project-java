public class MyClass {

    public static void main (String [] args) {

        String firstName = "Kaiuschy";
        String secondName = "Neves";
        String fullName = fullName(firstName, secondName);
        System.out.println(fullName);
    
        String date = "13 -";
        String month = "09 -";
        String year = " 1996.";

        String dateBirthday = dateBirthday(date, month, year);
        System.out.println(dateBirthday);


    }

    public static String fullName (String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }

    public static String dateBirthday (String date, String month, String year) {
        return date.concat(" ").concat(month).concat(year);
    }
}