package com.moodanalyser;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class MoodAnalyserTest extends NumberFormatException{
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("i am sad mood");
            String mood =moodAnalyser.analyserMood(null);
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
            String mood =moodAnalyser.analyserMood(null);
            assertEquals("HAPPY",mood);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public  void givenNull_WhenMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyserMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
            System.out.println(e.type);
            System.out.println(e);
        }
    }
}