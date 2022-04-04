/**
 * Purpose  -  Handle Exception if User Provides Invalid  Mood like null
 * @author  - Sri Lakshmi Prasanna
 * @version - 16.0
 * @since   - 01-04-2022
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    private String message;

    /**
     * create a default constructor name as MoodAnalyserMain
     */

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood(String i_am_in_any_mood) {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }


}