package com.moodanalyser;
public class MoodAnalyser {
    private  String message;
    public MoodAnalyser(){
    }
    public  MoodAnalyser(String message){
        this.message=message;
    }
    public String analyserMood(){
        try {
            return analyserMoodAgain();
        }catch (Exception e){
            return "HAPPY";
        }
    }
    public String analyserMoodAgain() throws MoodAnalyserException {
        try {
            if(message.contains("sad")){
                return "SAD";
            }
            return "HAPPY";
        }catch (Exception e){
            throw new MoodAnalyserException("please enter proper message");
        }
    }
}
