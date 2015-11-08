package mattnewsom.tempconversion;

/**
 * Created by Matthew on 11/7/2015.
 */
public class ConverterUtil {
    public static float convertFtoC(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static float convertCtoF(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }


}
