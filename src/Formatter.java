import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatter {
    public static String pattern = "yyyy-MM-dd";

    public static boolean isValidDate(String date) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
