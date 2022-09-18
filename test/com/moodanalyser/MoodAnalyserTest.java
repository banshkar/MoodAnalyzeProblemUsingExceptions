package com.moodanalyser;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("i am sad mood");
            String mood =moodAnalyser.analyserMood();
            assertEquals("SAD",mood);
        }
       catch (Exception e){
           System.out.println(e);
       }
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("i am happy mood");
            String mood =moodAnalyser.analyserMood();
            assertEquals("HAPPY",mood);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void givenNull_WhenHappy_ShouldReturnHappy(){
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String mood =moodAnalyser.analyserMood();
            assertEquals("HAPPY",mood);
    }
}