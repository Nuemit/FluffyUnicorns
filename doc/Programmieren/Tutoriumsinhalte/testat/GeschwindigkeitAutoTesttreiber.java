
/**
 * The {@code GeschwindigkeitAutoTesttreiber} class is a test driver for the {@code GeschwindigkeitAuto} class.
 * It initializes an array of speeds and calls methods to read and output the speeds.
 * <p>
 * This class contains a {@code main} method which serves as the entry point for the application.
 * </p>
 * <p>
 * Note: The maximum array length is set to half of {@code Integer.MAX_VALUE} to avoid memory issues.
 * </p>
 */
public class GeschwindigkeitAutoTesttreiber {
    public static void main(String[] args) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE/2;
        int[] geschwindigkeiten = new int[MAX_ARRAY_LENGTH];
        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeiten);
        GeschwindigkeitAuto.ausgeben(geschwindigkeiten);
    }
}