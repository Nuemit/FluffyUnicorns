package testat;

public class GeschwindigkeitAutoTesttreiber {
    public static void main(String[] args) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE/2;
        int[] geschwindigkeiten = new int[MAX_ARRAY_LENGTH];
        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeiten);
        GeschwindigkeitAuto.ausgeben(geschwindigkeiten);
    }
}