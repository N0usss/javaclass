import java.time.DayOfWeek;

public class Calories {

    public static void main(String[] args) {

        String dayName = "";
        int increment = 100;
        int calories = 1700;

        for (int i = 2; i <= 7; i++) {

                switch (i) {
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    case 7:
                        dayName = "Sunday";

                        break;

                    default:
                        break;
                }

                if(i>=3)
                {
                    calories += increment;
                }

                System.out.println(dayName + " " + calories);

            }
        }

    }

