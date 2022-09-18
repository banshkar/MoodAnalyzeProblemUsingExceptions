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
}