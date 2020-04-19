import java.util.Calendar;
public class AddDates 
{
public static void main(String[] args) 
{
Calendar c1 = Calendar.getInstance();
Calendar c2 = Calendar.getInstance();
Calendar cTotal = (Calendar) c1.clone();
cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));

}
}
