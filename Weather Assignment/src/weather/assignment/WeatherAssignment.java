package weather.assignment;

/**
 *
 * @author rck20
 */
//HELLO THIS IS ME EDITING FROM GITHUB.COM
public class WeatherAssignment {

    public static void main(String[] args) {
        int[] temps = {5, 8, -11, -14, -6, -3, -2, -7, -1, 1, 3, 4, 0, -3};
        System.out.println(calcAvg(temps));
        System.out.println(calcMax(temps));
    }

    public static double calcAvg(int[] values) {
        double sum = 0;
        double count = 0;
        for (int value : values) {
            if (value >= -50 && value <= 50) {
                sum += value;
                count++;
            }

        }
        return sum / values.length;
    }

    public static int calcMax(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }

        }
        return max;
    }
}
