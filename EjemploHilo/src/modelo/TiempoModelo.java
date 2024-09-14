package modelo;

/**
 *
 * @author Douglas Soch
 */
public class TiempoModelo {

    int seconds;
    String timeFormatted; // 00:00

    public TiempoModelo() {
    }

    public void incrementSecond() {
        seconds++;
    }

    public String currentTime() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        timeFormatted = String.format("%02d:%02d", minutes, remainingSeconds);
        return timeFormatted;
    }
    
}
