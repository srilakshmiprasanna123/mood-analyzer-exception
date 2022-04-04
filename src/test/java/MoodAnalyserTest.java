import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertSame;

/**
 * create a class name as MoodAnalyserTest
 */
public class MoodAnalyserTest {

    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertSame("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
