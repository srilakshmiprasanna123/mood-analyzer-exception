/**
 * Purpose  -  ability to analyse and respond Happy or Sad Mood
 * @author  - Ashvini Kanojia
 * @version - 16.0
 * @since   - 01-04-2022
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
