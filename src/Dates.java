import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
       Date date1 =sdf.parse("20-01-2022");
        Date date2 =sdf.parse("18-02-2022");

        System.out.println(date1.before(date2));
        System.out.println(date2.before(date1));
    }
}
