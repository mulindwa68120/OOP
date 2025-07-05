package airqo;
import java.util.Arrays;
import java.util.Random;
public class AirQOAnalyzer {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1;
        }
        System.out.println("AQI Readings for 30 Days:");
        System.out.println(Arrays.toString(aqiReadings));
        Arrays.sort(aqiReadings);
        double medianAQI = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        System.out.println("Median AQI: " + medianAQI);
        int hazardousDayCount = 0;
        for (int reading : aqiReadings) {
            if (reading > 200) {
                hazardousDayCount++;
            }
        }
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDayCount);
    }
}